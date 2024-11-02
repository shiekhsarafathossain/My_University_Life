package studentinformationsystem;

import java.util.Scanner;
import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<Student>();
        ArrayList<Faculty> facultyList = new ArrayList<Faculty>();
        ArrayList<Course> CourseList = new ArrayList<Course>();
        ArrayList<Club> clubList = new ArrayList<Club>();
        ArrayList<Department> departmentList = new ArrayList<Department>();

        boolean res = true;
        while (res) {
            System.out.println("a. Student Panel: ");
            System.out.println("b. Admin & Faculty Panel: ");
            System.out.println("0. Exit: ");
            char mainfunction = sc.next().charAt(0);
            switch (mainfunction) {
                //case a started
                case 'a': {
                    boolean stp = true;
                    while (stp) {
                        System.out.println("\t\t\t\t-------------");
                        System.out.println("\t\t\t\tStudent Panel");
                        System.out.println("\t\t\t\t-------------");
                        System.out.println("a. Add: "); //done
                        System.out.println("b. Drop: "); //done
                        System.out.println("c. Search: ");
                        System.out.println("d. Print: "); //done
                        System.out.println("e. Back: "); //done
                        char studentpanel = sc.next().charAt(0);
                        switch (studentpanel) {
                            case 'a': { //add 
                                boolean sp = true;
                                while (sp) {
                                    System.out.println("a. Add a Student: "); //done
                                    System.out.println("b. Add Student to Course: "); //done
                                    System.out.println("c. Add Student to Club: "); //done
                                    System.out.println("d. Add Student to Department: "); //done
                                    System.out.println("e. Back: "); //done
                                //    System.out.println("f. Back To Main Menu: "); //done
                                    //Student
                                    char student = sc.next().charAt(0);
                                    switch (student) {

                                        case 'a': {
                                            System.out.print("Enter Student ID: ");
                                            int sid = sc.nextInt();
                                            sc.nextLine();
                                            System.out.print("Enter Student Name: ");
                                            String sname = sc.nextLine();
                                            System.out.print("Enter Student Email:");
                                            String semail = sc.nextLine();
                                            System.out.print("Enter Student CGPA: ");
                                            double scgpa = sc.nextDouble();
                                            studentList.add(new Student(sid, sname, semail, scgpa));
                                            System.out.println("Student Added Successfully!");
                                            break;
                                        }
                                        case 'b': {
                                            System.out.print("Enter Student ID: ");
                                            int sid = sc.nextInt();
                                            sc.nextLine();

                                            System.out.print("Enter Course ID: ");
                                            String cid = sc.nextLine();
                                            Student std = new Student();
                                            for (Student i : studentList) {
                                                if (sid == i.getId()) {
                                                    std = i;
                                                }
                                            }
                                            Course cr = new Course();
                                            for (Course i : CourseList) {
                                                if (cid == i.getCourseId()) {
                                                    cr = i;
                                                }
                                            }
                                            cr.addStudent(std);
                                            //  studentList.add(std);
                                            //    CourseList.add(cr);
                                            std.addCourse(cr);
                                            System.out.println("Added Successfully!");
                                            break;
                                        }

                                        case 'c': {
                                            System.out.print("Enter Student ID: ");
                                            int sid = sc.nextInt();
                                            sc.nextLine();

                                            System.out.print("Enter Club Name: ");
                                            String cname = sc.nextLine();
                                            Student std = new Student();
                                            for (Student i : studentList) {
                                                if (sid == i.getId()) {
                                                    std = i;
                                                }
                                            }
                                            Club cc = new Club();

                                            for (Club i : clubList) {
                                                if (cname == i.getClubName()) {
                                                    cc = i;
                                                }
                                            }
                                            //   clubList.add(cc);
                                            std.addClub(cc);
                                            break;
                                        }

                                        case 'd': {
                                            System.out.print("Enter Student ID: ");
                                            int sid = sc.nextInt();
                                            sc.nextLine();

                                            System.out.print("Enter Department Name: ");
                                            String dname = sc.nextLine();
                                            Student std = new Student();
                                            for (Student i : studentList) {
                                                if (sid == i.getId()) {
                                                    std = i;
                                                }
                                            }

                                            Department dd = new Department();
                                            for (Department i : departmentList) {
                                                if (dname == i.getDepartmentName()) {
                                                    dd = i;
                                                }
                                            }

                                            std.addDepartment(dd);
                                            break;
                                        }

                                     

                                        case 'e': { //back
                                            sp = false;
                                            break;
                                        }
                                     

                                        default: {
                                            System.out.println("Invalid Input!");
                                            sp = true;
                                            stp =true;
                                            break;
                                        }
                                    }

                                } //add while end
                                break;
                            } // a case end
                            case 'b': { //drop b case started
                                boolean sp = true;
                                while (sp) {
                                    System.out.println("a. Drop Course: ");
                                    System.out.println("b. Back: ");
                                    System.out.println("0. Back to Main Panel: ");
                                    
                                    char drop = sc.next().charAt(0);
                                    switch (drop) {
                                        case 'a': {
                                            System.out.print("Enter Student ID: ");
                                            int sid = sc.nextInt();
                                            sc.nextLine();

                                            System.out.print("Enter Course ID: ");
                                            String cid = sc.nextLine();
                                            Student std = new Student();
                                            for (Student i : studentList) {
                                                if (sid == i.getId()) {
                                                    std = i;
                                                }
                                            }
                                            Course cr = new Course();
                                            for (Course i : CourseList) {
                                                if (cid == i.getCourseId()) {
                                                    cr = i;
                                                }
                                            }
                                            CourseList.remove(cr);

                                        }

                                        case 'b': {
                                            sp = false;
                                            break;
                                        }

                                        case '0': {
                                            sp = false;
                                            stp = false;
                                            break;
                                        }

                                        default: {
                                            System.out.println("Invalid Input");
                                            sp = true;
                                            break;
                                        }
                                    }

                                }
                                break;
                            }
                            
                            case 'c': { //search
                                
                                boolean sp = true; 
                                while(sp){
                                System.out.println("a. Search Course: ");
                                System.out.println("b. Search Faculty: ");
                                System.out.println("c. Search Club: ");
                                System.out.println("d. Search Department: ");
                                System.out.println("e. Search Result: ");
                                System.out.println("f. Back: ");
                                System.out.println("g. Back to Main Panel: ");
                                char sr = sc.next().charAt(0);
                                switch(sr){
                                    case 'a' :
                                }
                                }
                                
                                break;
                            }
                            case 'd': { //print
                                boolean sp = true; 
                                while(sp){
                                System.out.println("a. Print Student: ");
                                System.out.println("b. Print Course List: ");
                                System.out.println("c. Print Faculty List: ");
                                System.out.println("d. Back: ");
                                System.out.println("e. Main Menu: ");
                                char ps = sc.next().charAt(0);
                                switch (ps) {
                                    case 'a': {
                                        for (Student i : studentList) {
                                            System.out.println(i.display());
                                            i.displayAssignDepartment();
                                            i.displayAssignCourse();
                                            i.displayAssignExamResult();
                                            i.displayAssignClub();
                                        }
                                    }
                                    
                                    case 'b': {
                                        for(Course i: CourseList){
                                            System.out.println(i.display());
                                        }
                                            break;
                                        }
                                    
                                    case 'c': {
                                        for(Faculty i: facultyList){
                                            System.out.println(i.display());
                                        }
                                            break;
                                        }
                                    case 'd': {
                                            sp = false;
                                            break;
                                        }

                                        case 'e': {
                                            sp = false;
                                            stp = false;
                                            break;
                                        }
                                    default: {
                                        System.out.println("Invalid Input Please Try Again!");
                                        break;
                                    }
                                }
                            }
                                break;
                            }
                            
                            case 'e': { //back
                                stp = false;
                                break;
                            }

                            case '0': { // exit
                                stp = false;
                                res = false;
                                break;
                            }

                            default: {
                                System.out.println("Invalid Input Please Try Again!");
                                stp = true;
                                break;
                            }
                        }
                    } //student panel while loop ends
                    break;
                }
                //case a ended

                //case b started (Admin & Faculty Panel)
                case 'b': {
                    boolean stp = true;
                    while (stp) {
                        System.out.println("\t\t\t\t---------------------");
                        System.out.println("\t\t\t\tAdmin & Faculty Panel");
                        System.out.println("\t\t\t\t---------------------");
                        System.out.println("a. Add: ");
                        System.out.println("b. Drop: ");
                        System.out.println("c. Update: ");
                        System.out.println("d. Search: ");
                        System.out.println("e. Print: ");
                        System.out.println("0. Exit: ");
                        char adminpanel = sc.next().charAt(0);

                        switch (adminpanel) {
                            case 'a': {
                                System.out.println("a. Add Course: "); //done
                                System.out.println("b. Add Faculty: "); //done
                                System.out.println("c. Add Faculty to Course: ");
                                System.out.println("d. Add Faculty to Club: ");
                                System.out.println("e. Add Faculty to Department: ");
                                System.out.println("f. Add Result: ");
                                System.out.println("0. Main Menu: ");
                                char aa = sc.next().charAt(0);
                                switch (aa) {
                                    case 'a': { //add course
                                        System.out.println("Enter Course ID: ");
                                        String cid = sc.nextLine();
                                        System.out.println("Enter Course Title: ");
                                        String ct = sc.nextLine();
                                        System.out.println("Enter Course Credit: ");
                                        double cc = sc.nextDouble();
                                        sc.nextLine();
                                        CourseList.add(new Course(cid, ct, cc));
                                        break;
                                    }

                                    case 'b': { //add faculty
                                        System.out.print("Enter Faculty ID: ");
                                        int fid = sc.nextInt();
                                        sc.nextLine();
                                        System.out.print("Enter Faculty Name: ");
                                        String fname = sc.nextLine();
                                        System.out.print("Enter Faculty Email: ");
                                        String femail = sc.nextLine();
                                        System.out.print("Enter Faculty Position: ");
                                        String fpos = sc.nextLine();
                                        facultyList.add(new Faculty(fid, fname, femail, fpos));
                                        break;
                                    }
                                    case 'c': {
                                        System.out.print("Enter Faculty ID: ");
                                        int fid = sc.nextInt();
                                        sc.nextLine();
                                        System.out.print("Enter Course ID: ");
                                        String cid = sc.nextLine();
                                        Faculty f = new Faculty();

                                        for (Faculty i : facultyList) {
                                            if (fid == i.getId()) {
                                                f = i;
                                            }
                                        }
                                        Course c = new Course();
                                        for (Course i : CourseList) {
                                            if (cid == i.getCourseId()) {
                                                c = i;
                                            }
                                        }

                                        // facultyList.
                                    }

                                }
                                break;
                            }
                            default: {
                                System.out.println("Invalid input!");
                                stp = true;
                                break;
                            }
                        }
                    }
                    break;
                }
                //case b ended

                //Case 0 started (Exit)
                case '0': {
                    res = false;
                    break;
                }
                //Case 0 Ended

                default: {
                    System.out.println("Invalid Input!");
                    res = true;
                    break;
                }

            } // main switch ended

            //main switch started
        }
    }
}
