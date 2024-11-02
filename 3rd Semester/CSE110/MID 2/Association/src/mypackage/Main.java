package mypackage;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student( 1001,"S1",3.5);
        Student s2 = new Student( 1002,"S2",2.5);
        Student s3 = new Student( 1003,"S3",3.4);
        
        Course c1 = new Course("CSE110","Java programming", 4.5);
        Course c2 = new Course("CSE103","C programming", 4);
        
        Faculty f1 = new Faculty(2001,"F1","Prof.");
        
        c1.addFaculty(f1);
        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);
        c1.printStudentList();
        
        System.out.println("");
        System.out.println("");
        
        c1.dropStudent(1002);
        c1.printStudentList();
        System.out.println(c1.getFaculty().toString());
        c1.dropFaculty();
        System.out.println(c1.getFaculty());
        System.out.println(c1.getnumberofStudents());
        
    }
}
