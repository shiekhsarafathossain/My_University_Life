package javaapplication15;

import java.util.Scanner;
import java.util.ArrayList;



class Student{
    
    private int studentId;
    private String studentName;
    private double studentCGPA;
    private ArrayList<Course> clist = new ArrayList<Course>();
    private int numberOfCourses = 0;
   
    
    public Student(){
        
    }
    
    public Student(int Sid, String Sname, double Scgpa){
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

    public void display(){
        System.out.println(studentId+" "+studentName+" "+studentCGPA);
    }
    
    public void addCourse(Course c){
        clist.add(c);
    }
        
    public void dropCourse(String coursedrop) {
        for (int i = 0; i < clist.size(); i++) {
            if (clist.get(i).getCourseId() == coursedrop) {
                clist.remove(i);
                numberOfCourses--;
                break;
            }
        }
    }

    
}




class Faculty {

    private int facultyId;
    private String facultyName, facultyPosition;
    private ArrayList<Course> clist = new ArrayList<Course>();
    private int numberOfCourses = 0;
    
    public Faculty(){
    
    }
    
    public Faculty(int Fid, String Fname, String Fp){
        facultyId = Fid;
        facultyName = Fname;
        facultyPosition = Fp;
    
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyPosition() {
        return facultyPosition;
    }

    public void setFacultyPosition(String facultyPosition) {
        this.facultyPosition = facultyPosition;
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
    
    String display(){
        String show = facultyId+" "+facultyName+" "+facultyPosition;
        return show;
    }
    
    public void addCourse(Course c){
        clist.add(c);
    }
        
    public void dropCourse(String coursedrop) {
        for (int i = 0; i < clist.size(); i++) {
            if (clist.get(i).getCourseId() == coursedrop) {
                clist.remove(i);
                numberOfCourses--;
                break;
            }
        }
    }

}




class Course{
    
    private String courseId,courseTitle;
    private double credit;
    private ArrayList<Student> slist = new ArrayList<Student>();
    private int numberOfStudents = 0;
    private Faculty faculty;
    
    public Course(){
        
    }    
        
    public Course(String Cid,String Ct, double Ccr){
        courseId = Cid;
        courseTitle = Ct;
        credit = Ccr;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
    
    public ArrayList<Student> getSlist() {
        return slist;
    }

    public void setSlist(ArrayList<Student> slist) {
        this.slist = slist;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
    
    public void display(){
        System.out.print(courseId + " "+ courseTitle + " "+credit);
    }
    
    public void addStudent(Student s){
        if(numberOfStudents <=40){
            slist.add(s);
        }
        else {
            System.out.println("Student capacity reached maximum");
        }
    }
    public void dropStudent(int studentId) {
        for (int i = 0; i < slist.size(); i++) {
            if (slist.get(i).getStudentId() == studentId) {
                slist.remove(i);
                numberOfStudents--;
                break;
            }
        }
    }
    public void addFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void dropFaculty() {
        this.faculty = null;
    }
    
    
}
public class Homework5 {

    public static void main(String[] args) {
        
        }
    }