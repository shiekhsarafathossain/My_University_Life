package lab6;

import java.util.ArrayList;

public class Course {
    private String courseId;
    private String courseTitle;
    private double credit;
    private ArrayList <Student> slist = new <Student> ArrayList();
    private ArrayList <Faculty> flist = new <Faculty> ArrayList();
    private int numberofstudents = 0;
    
    Course(){
        
    }
    
    Course(String courseId, String courseTitle, double credit){
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public double getCredit() {
        return credit;
    }
    
     public ArrayList <Student> getSlist() {
        return slist;
    }

    public int getNumberofstudents() {
        return numberofstudents;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
    
    public void setSlist(ArrayList <Student> slist) {
        this.slist = slist;
    }
    
    public void addStudent(Student s){
        slist.add(s);
        numberofstudents++;
    }
    
    public void dropStudent(int studentId){
        for(int i =0; i<slist.size();i++){
            if(slist.get(i).getStudentId() == studentId){
                slist.remove(i);
                numberofstudents--;
                break;
            }
        }
    }
    
    public void addFaculty(Faculty f){
        
    }
    
    public String toString(){
        String str = "Course ID: "+courseId+"\nCourse Title: "+courseTitle+"\nCourse Credit: "+credit;
        return str;
    }

    public ArrayList <Faculty> getFlist() {
        return flist;
    }

    public void setFlist(ArrayList <Faculty> flist) {
        this.flist = flist;
    }

   

    
}
