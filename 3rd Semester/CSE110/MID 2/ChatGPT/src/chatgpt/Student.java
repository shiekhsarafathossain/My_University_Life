
package chatgpt;

public class Student {
    
    int studentId;
    private String studentName;
    private double studentCGPA;

    public Student() {
        // Default constructor
    }

    public Student(int studentId, String studentName, double studentCGPA) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCGPA = studentCGPA;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + "\nName: " + studentName + "\nCGPA: " + studentCGPA;
    }
}
