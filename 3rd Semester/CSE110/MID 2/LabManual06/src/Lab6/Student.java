package Lab6;

import java.util.ArrayList;

class Student {
    int studentId;
    String studentName;
    double studentCGPA;
    
    Student(){
        
    }
    
    Student(int studentId, String studentName, double studentCGPA){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCGPA = studentCGPA;
    }
    Course coursedetails = new Course();
    
    void addCourse(String courseId, String courseTitle, double credit){
        coursedetails.courseId = courseId;
        coursedetails.courseTitle = courseTitle;
        coursedetails.credit = credit;
    }
    ArrayList <Course> courselist = new ArrayList <Course>();
    
    void addStudentCourse(Course coursedetails){
        
    }
    void display(){
        System.out.println(studentId+"\n"+studentName+"\n"+studentCGPA+"\n");
    }
}
