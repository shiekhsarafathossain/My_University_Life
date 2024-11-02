package association;

import java.util.ArrayList;

public class Student {

    private int studentId;
    private String studentName;
    private double studentCGPA;
    private ArrayList<Course> clist = new ArrayList<Course>();
    private int numberOfCourses = 0;

    public Student() {

    }

    public Student(int Sid, String Sname, double Scgpa) {
        studentId = Sid;
        studentName = Sname;
        studentCGPA = Scgpa;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getStudentCGPA() {
        return studentCGPA;
    }

    public void setStudentCGPA(double studentCGPA) {
        this.studentCGPA = studentCGPA;
    }

    public ArrayList<Course> getClist() {
        return clist;
    }

    public void setClist(ArrayList<Course> clist) {
        this.clist = clist;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    public void display() {
        System.out.println(studentId + " " + studentName + " " + studentCGPA);
    }

    public void displayassign() {
        for (Course c : clist) {
            System.out.println();
            c.displayCourse();
        }
    }

    public void addCourse(Course c) {
        clist.add(c);
        numberOfCourses++;
    }

    public void dropCourse(String coursedrop) {
        for (int i = 0; i < clist.size(); i++) {
            if (clist.get(i).getCourseId().equals(coursedrop)) {
                clist.remove(i);
                numberOfCourses--;
                break;
            }
        }
    }
}
