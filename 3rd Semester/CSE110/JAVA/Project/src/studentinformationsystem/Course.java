package studentinformationsystem;

import java.util.ArrayList;

public class Course {

    private String courseId, courseTitle;
    private double credit;
    private ArrayList<Student> studentList = new ArrayList<Student>();
    private int numberOfStudent = 0;
    private Faculty faculty;

    public Course() {
    }

    public Course(String courseId, String courseTitle, double credit) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
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

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

 //   public void setNumberOfStudent(int numberOfStudent) {
   //     this.numberOfStudent = numberOfStudent;
   // }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public String display() {

        return "Course Id: " + courseId
                + "\nCourse Title : " + courseTitle
                + "\nCourse Credit : " + credit;

    }

    public void addStudent(Student s) {
        if (numberOfStudent <= 40) {
            studentList.add(s);
            numberOfStudent++;
        } else {
            System.out.println("Student capacity reached maximum number.\n"
                    + "Cant add more");
        }
    }

    public void dropStudent(int studentId) {
        int i;
        for (i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == studentId){// && numberOfStudent > 40) {
                studentList.remove(i);
                numberOfStudent--;
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
    
    public void printStudentList(){
        for(Student s: studentList){
            s.display();
        }
    }

}