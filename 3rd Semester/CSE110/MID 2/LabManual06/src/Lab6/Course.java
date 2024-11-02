package Lab6;

import java.util.ArrayList;

class Course {
    String courseId;
    String courseTitle;
    double credit;
    
    Course(){
        
    }
    
    Course(String courseId, String courseTitle, double credit){
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
    }
    
    //searching teacher
    void search(){
        ArrayList <Faculty> facultylist = new ArrayList <Faculty>();
    
    int[] array = new int[facultylist.size()];
    int i;
    for(i=0; i < array.length ; i++){
        
    }
    }
    
    void display(){
        System.out.println(courseId+"\n"+courseTitle+"\n"+credit+"\n");
    }
}
