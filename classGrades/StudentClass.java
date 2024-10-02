import java.util.ArrayList;

/**
 * Write a description of class StudentClass here.
 *
 * @author (Hassan Talha)
 * @version (5/9/23)
 */
public class StudentClass
{
    public static final int ACADEMIC = 0;
    public static final int PRE_AP = 1;
    public static final int AP = 2;

    private double majorWeight;
    private double minorWeight;
    private double otherWeight;
    private ArrayList<Assignment> assignments;
    private String className;
    private int type;

    public StudentClass(String className, int type) {
        this.className = className;
        this.type = type;
        this.assignments = new ArrayList<Assignment>();
        if (type == 0) {
            
                majorWeight = 0.55;
                minorWeight = 0.3;
                otherWeight = 0.15;
            }
        else if (type == 1){
                majorWeight = 0.6;
                minorWeight = 0.3;
                otherWeight = 0.1;
            }
        else{
                majorWeight = 0.7;
                minorWeight = 0.2;
                otherWeight = 0.1;
                
        }
    }
    
    public String getClassName() {
        return className;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public double getMinorWeight() {
        return minorWeight;
    }

    public double getMajorWeight() {
        return majorWeight;
    }

    public double getOtherWeight() {
        return otherWeight;
    }

    public int getType() {
        return type;
    }

    public void addAssignment(Assignment a) {
        assignments.add(a);
    }

    public double minorAverage() {
        double total = 0;
        int count = 0;
        for (Assignment a : assignments) {
            if (a.getCategory() == Assignment.minor) {
                total += a.getGrade();
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return total / count;
    }

    public double majorAverage() {
        double total = 0;
        int count = 0;
        for (Assignment a : assignments) {
            if (a.getCategory() == Assignment.major) {
                total += a.getGrade();
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return total / count;
    }

    public double otherAverage(){
        double total = 0;
        int count = 0;
        for (Assignment a : assignments) {
            if (a.getCategory() == Assignment.other) {
                total += a.getGrade();
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return total / count;
    }
    
    public void removeAssignment(int index) {
        if (index >= 0 && index < assignments.size()) {
            assignments.remove(index);
        }
    }
    
    public double average() {
        double totalWeightedGrade = 0.0;
        double totalWeight = 0.0;
    
        for (Assignment assignment : assignments) {
            double weight = 0.0;
    
            switch (assignment.getCategory()) {
                case Assignment.other:
                    weight = otherWeight;
                    break;
                case Assignment.minor:
                    weight = minorWeight;
                    break;
                case Assignment.major:
                    weight = majorWeight;
                    break;
            }
    
            totalWeightedGrade += assignment.getGrade() * weight;
            totalWeight += weight;
        }
    
        if (totalWeight == 0.0) {
            return 0.0;
        }
    
        return totalWeightedGrade / totalWeight;
    }

}

