package myLab;

import java.util.ArrayList;

public class Student {

    private int studentId;
    private String studentName;
    private double studentCGPA;

    Student() {

    }

    Student(int StudentId, String studentName, double studentCGPA) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCGPA = studentCGPA;
    }

    public int getStudentid() {
        return studentId;
    }

    public String getStudentname() {
        return studentName;
    }

    public double getStudentcgpa() {
        return studentCGPA;
    }

    public void setStudentid(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentname(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentcgpa(double studentCGPA) {
        this.studentCGPA = studentCGPA;
    }

    private ArrayList<Course> clist = new ArrayList<Course>();

    public ArrayList<Course> getClist() {
        return clist;
    }

    public void setClist(ArrayList<Course> clist) {
        this.clist = clist;
    }

    private int numberofCourse = 0;

    public int getNumberofcourse() {
        return numberofCourse;
    }

    public void setNumberofcourse(int numberofCourse) {
        this.numberofCourse = numberofCourse;
    }

    @Override
    public String toString() {
        String str = "Student ID: " + studentId + "\n"
                + "Student Name: " + studentName + "\n"
                + "Student CGPA: " + studentCGPA + "\n";
        return str;
    }
    
    public void toStringCourse(){
        for (int i = 0; i < clist.size(); i++) {
            System.out.println(clist.get(i).toString());
        }
    }

}
