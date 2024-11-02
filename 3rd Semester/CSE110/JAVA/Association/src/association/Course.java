package association;

import java.util.ArrayList;

public class Course {

    private String courseId, courseTitle;
    private double credit;
    private ArrayList<Student> slist = new ArrayList<Student>();
    private ArrayList<Faculty> flist = new ArrayList<Faculty>();
    private int numberOfStudents = 0;

    public Course() {

    }

    public Course(String Cid, String Ct, double Ccr) {
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

    public void displayCourse() {
        System.out.print(courseId + " " + courseTitle + " " + credit);
    }

    public void addStudent(Student s) {
        if (numberOfStudents <= 40) {
            slist.add(s);
            numberOfStudents++;
        } else {
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



    public ArrayList<Faculty> getFlist() {
        return flist;
    }

    public void setFlist(ArrayList<Faculty> flist) {
        this.flist = flist;
    }
}
