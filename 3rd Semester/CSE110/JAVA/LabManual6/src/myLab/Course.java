package myLab;

import java.util.ArrayList;

public class Course {
    private int courseId;
    private String courseTitle;
    private double credit;
    
    Course(){
        
    }
    
    Course(int courseId, String courseTitle, double credit){
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
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
    
    private ArrayList <Student> slist = new ArrayList <Student> ();

    public ArrayList <Student> getSlist() {
        return slist;
    }

    public void setSlist(ArrayList <Student> slist) {
        this.slist = slist;
    }
    
    @Override
    public String toString() {
        String str = "Course ID: " + courseId + "\n"
                + "Course Title: " + courseTitle + "\n"
                + "Course Credit: " + credit + "\n";
        return str;
    }
    
    
    
    
    
    
}
