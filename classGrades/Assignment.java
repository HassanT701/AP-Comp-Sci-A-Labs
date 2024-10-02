
/**
 * Write a description of class Assignment here.
 *
 * @author (Hassan Talha)
 * @version (5/9/23)
 */
public class Assignment
{
    public static final int other = 0;
    public static final int minor = 1;
    public static final int major = 2;

    private String assignmentName;
    private double grade;
    private int category;

    public Assignment(String assignmentName, double grade, int category) {
        this.assignmentName = assignmentName;
        this.grade = grade;
        this.category = category;
    }

    public int getCategory() {
        return category;
    }

    public double getGrade() {
        return grade;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }
}
