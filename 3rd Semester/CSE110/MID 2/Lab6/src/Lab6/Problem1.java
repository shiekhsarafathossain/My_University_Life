package Lab6;

import java.util.ArrayList;
import java.util.Scanner;

class student {

    int id;
    String name;
    //   course[] clist= new course[5];
    int coursecount = 0;

    ArrayList<course> clist = new ArrayList<course>();

    student() {

    }

    student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void addcourse(course c) {
        // clist[coursecount]=c;
        clist.add(c);
        System.out.println(clist.size());
        //  coursecount++;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    void displaywithcourse() {
        System.out.println(id + " " + name);
        for (int i = 0; i < clist.size(); i++) {
            //  clist[i].display();
            clist.get(i).display();
        }
    }
}

class course {

    String title;
    String code;
    double credit;

    course(String t, String c, double cr) {
        title = t;
        code = c;
        credit = cr;
    }

    void display() {
        System.out.println(title + " " + code + " " + credit);
    }
}

class faculty {

    int facultyId;
    String facultyName;
    String facultyPosition;

    faculty() {
    }

    faculty(int id, String name, String position) {
        facultyId = id;
        facultyName = name;
        facultyPosition = position;
    }

    void display() {
        System.out.println(facultyId + " " + facultyName + " " + facultyPosition);
    }

}

public class Problem1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*  student s1 = new student(1, "xy");
        student s2 = new student(2, "ab");
        student s3 = new student(3, "cd");
        course c1 = new course("oop", "cse110", 4.5);
        course c2 = new course("sp", "cse106", 4.5);
        course c3 = new course("math", "math102", 3);
        faculty f1 = new faculty(2022,"Tonni Mitra","Senior Lecturer");
        faculty f2 = new faculty(2023,"Raya Maya","Junior Clark");
        s1.display();
        
        
        s1.addcourse(c1);
        s1.addcourse(c2);
        
        s2.addcourse(c3);
        
        
        
        s1.displaywithcourse();
        
        f1.display();
        f2.display();
         */

        System.out.print("\t\t\tMenu\n\n\n");

        System.out.print("a. Add\nb. Delete\nc.Update\nd.Print\ne. Search\n");

        char ch;
        System.out.print("Enter Options: ");
        ch = input.next().charAt(0);
        if (ch == 'a') {
            System.out.print("a. Add a Student\nb. Add a Course\nc. Add a Faculty");
            char c1;
            c1 = input.next().charAt(0);
            switch (c1) {
                case 'a':
                     ArrayList<student> studentlist = new ArrayList<student>(); 
        //             student.add(2022,"sarafat");
                     break;
            }

        } else if (ch == 'b') {
            System.out.print("a. Delete a Student\nb. Delete a Course\nc. Delete a Faculty");
        } else if (ch == 'c') {
            System.out.print("a. Update a Student\nb. Update a Course\nc. Update a Faculty");
        } else if (ch == 'd') {
            System.out.print("a. Print a Student\nb. Print a Course\nc. Print a Faculty");
        } else if (ch == 'e') {
            System.out.print("a. Search a Student\nb. Search a Course\nc. Search a Faculty");
        } else {
            System.out.println("Invalid Input");
        }

    }
}
