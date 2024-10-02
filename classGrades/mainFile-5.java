import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class mainFile here.
 *
 * @author (Hassan Talha)
 * @version (5/9/23)
 */
public class mainFile
{
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("-Class Grades-\n");
        
        System.out.print("Enter the name of your class: ");
        String className = input.nextLine();

        System.out.print("Enter class type (0 for Academic, 1 for Pre-AP, 2 for AP): ");
        int classType = input.nextInt();

        StudentClass studentClass = new StudentClass(className, classType);

        
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add assignment");
            System.out.println("2. Remove assignment");
            System.out.println("3. Modify assignment");
            System.out.println("4. View class information");
            System.out.println("5. Exit");

            System.out.print("\nEnter Selection: ");
            choice = input.nextInt();            
                if (choice == 1){
                    System.out.print("\nEnter the name of the assignment: ");
                    String assignmentName = input.next();

                    System.out.print("Enter assignment grade: ");
                    double assignmentGrade = input.nextDouble();

                    System.out.print("Enter assignment category (0 for Other, 1 for Minor, 2 for Major): ");
                    int assignmentCategory = input.nextInt();

                    Assignment assignment = new Assignment(assignmentName, assignmentGrade, assignmentCategory);
                    studentClass.addAssignment(assignment);

                    System.out.println("Assignment added.");
                }
                else if (choice == 2){
                     if (studentClass == null) {
                    System.out.println("Please add assignments to a class first.");
                     } else {
                    System.out.println("Assignments:");
                    ArrayList<Assignment> assignments = studentClass.getAssignments();
                    for (int i = 0; i < assignments.size(); i++) {
                        Assignment assignment = assignments.get(i);
                        System.out.println((i + 1) + ". " + assignment.getAssignmentName() + " - " + assignment.getGrade() + " - Category " + assignment.getCategory());
                    }

                    System.out.print("Enter the number of the assignment you want to remove: ");
                    int index = input.nextInt();
                    studentClass.removeAssignment(index - 1);
                    }
                }
                else if (choice == 3){
                    ArrayList<Assignment> assignments = studentClass.getAssignments();
                    if (assignments.isEmpty()) {
                        System.out.println("No assignments to modify.");
                        break;
                    }

                    System.out.println("\nAssignments:");
                    for (int i = 0; i < assignments.size(); i++) {
                        Assignment a = assignments.get(i);
                        System.out.println((i+1) + ". " + a.getAssignmentName() + " (" + a.getGrade() + ", " + a.getCategory() + ")");
                    }

                    System.out.println("Enter the number of the assignment to modify (0 to cancel): ");
                    int index = input.nextInt();
                    if (index != 0) {
                        Assignment a = assignments.get(index - 1);

                        System.out.println("\nModify assignment:");
                        System.out.println("1. Name");
                        System.out.println("2. Grade");
                        System.out.println("3. Category");
                        System.out.println("4. Cancel");

                        System.out.print("\nEnter your choice: ");
                        int modifyChoice = input.nextInt();

                        if (modifyChoice == 1) {
                            System.out.print("\nEnter new name: ");
                            String newName = input.next();
                            a.setAssignmentName(newName);
                            System.out.println("Assignment name updated.");
                        }
                        else if (modifyChoice == 2){
                            System.out.println("Enter the new grade:");
                            double newGrade = input.nextDouble();
                            a.setGrade(newGrade);
                            System.out.println("Grade updated.");
                        }
                        else if (modifyChoice == 3){
                            System.out.println("Select the new category:");
                            System.out.println("1. Other");
                            System.out.println("2. Minor");
                            System.out.println("3. Major");
                            int newCategoryChoice = input.nextInt();
                            if (newCategoryChoice < 1 || newCategoryChoice > 3) {
                                System.out.println("Invalid category selection.");
                            } else {
                                a.setCategory(newCategoryChoice - 1);
                                System.out.println("Category updated.");
                            }
                        }
                        else if (modifyChoice == 4){
                            System.out.println("Modification cancelled.");
                        }
                    }
                } 
                else if (choice == 4){
                     System.out.println("Class name: " + studentClass.getClassName() + "\n");
                        System.out.println("Class type: " + studentClass.getType() + "\n");
                        System.out.println("Other Weight/points: " + studentClass.otherAverage());
                        System.out.println("Minor Weight/points: " + studentClass.minorAverage());
                        System.out.println("Major Weight/points: " + studentClass.majorAverage());
                        System.out.println("Grade: " + studentClass.average());
                    
                        ArrayList<Assignment> assignments = studentClass.getAssignments();
                    
                        System.out.println("\nAssignments by category:");
                        System.out.println("Other:");
                        for (Assignment a : assignments) {
                            if (a.getCategory() == Assignment.other) {
                                System.out.println(a.getAssignmentName() + " - " + a.getGrade());
                            }
                        }
                        System.out.println("Other average: " + studentClass.otherAverage());
                        System.out.println("\nMinor:");
                        for (Assignment a : assignments) {
                            if (a.getCategory() == Assignment.minor) {
                                System.out.println(a.getAssignmentName() + " - " + a.getGrade());
                            }
                        }
                        System.out.println("Minor average: " + studentClass.minorAverage());
                        System.out.println("\nMajor:");
                        for (Assignment a : assignments) {
                            if (a.getCategory() == Assignment.major) {
                                System.out.println(a.getAssignmentName() + " - " + a.getGrade());
                            }
                        }
                        System.out.println("Major average: " + studentClass.majorAverage());
                }
                }while(choice != 5);
    }

}
