
package lab6;

import java.util.ArrayList;

public class Student {
    private int studentId;
    private String studentName;
    private double studentCGPA;
    private ArrayList <Course> clist = new <Course> ArrayList();
    
    Student(){
        
    }
    
    Student(int studentId, String studentName, double studentCGPA){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCGPA = studentCGPA;
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
    
    public String toString(){
        String str = "Student ID: "+studentId+"\nStudent Name: "+studentName+"\nStudent CGPA: "+studentCGPA;
        return str;
    }
}
