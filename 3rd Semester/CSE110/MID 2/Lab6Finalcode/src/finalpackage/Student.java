package finalpackage;

import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private int studentId;
    private String studentName;
    private double studentCGPA;

    ArrayList<Course> courses = new ArrayList<Course>();

    public Student() {

    }

    public Student(int studentId, String studentName, double studentCGPA, Course c) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCGPA = studentCGPA;
        courses.add(c);
    }

    public Student(int studentId, String studentName, double studentCGPA) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCGPA = studentCGPA;
    }

    public void dropCourse(String str) {
        for (int i = 0; i < courses.size(); i++) {
            if (Objects.equals(courses.get(i).getCourseID(), str)) {
                courses.remove(i);
                break;
            }
        }
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudentCGPA() {
        return studentCGPA;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentCGPA(double studentCGPA) {
        this.studentCGPA = studentCGPA;
    }

    @Override
    public String toString() {
        String str = "Student id: " + studentId + "\nStudent name: " + studentName + "\nCGPA: " + studentCGPA + "\n";
        return str;
    }

    public void Course() {
        System.out.println(toString());
        for (int i = 0; i < courses.size(); i++) {
            courses.get(i).toString();
        }
    }
}