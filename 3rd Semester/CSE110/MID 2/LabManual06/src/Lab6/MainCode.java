package Lab6;

import java.util.ArrayList;

public class MainCode {
    public static void main(String[] args) {
         
        //Student part start
        
        ArrayList <Student> studentlist = new ArrayList <Student>();
        Student student1 = new Student(2555, "abgjhh",3.66);
        Student student2 = new Student(9897, "kcvccvvc",4.66);
        
        studentlist.add(student1);
        studentlist.add(student2);

        for(int i=0;i<studentlist.size();i++){
            studentlist.get(i).display();
        }
        
        //student part end
        
        //faculty part start
        
        ArrayList <Faculty> facultylist = new ArrayList <Faculty>();
        
        Faculty faculty1 = new Faculty(202234,"Joshim","Peon");
        Faculty faculty2 = new Faculty(6969,"Sala","Cleaner");
        
        facultylist.add(faculty1);
        facultylist.add(faculty2);
        
        for(int i=0;i<studentlist.size();i++){
            facultylist.get(i).display();
        }
        
        //faculty part end
        
        
        //course part start
        
        ArrayList <Course> courselist = new ArrayList <Course>();
        
        Course course1 = new Course("CSE 106","Discrete Mathematics",3.0);
        Course course2 = new Course("MAT 102","Mathematics",4.5);
        
        courselist.add(course1);
        courselist.add(course2);
        
        for(int i=0;i<studentlist.size();i++){
            courselist.get(i).display();
        }
        
        //course part end
    }
}
