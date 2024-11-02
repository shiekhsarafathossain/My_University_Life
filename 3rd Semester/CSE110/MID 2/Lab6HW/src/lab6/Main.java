package lab6;

import java.util.Scanner;
import java.util.Objects;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Course> clist = new ArrayList<Course>();
        ArrayList<Student> slist = new ArrayList<Student>();
        ArrayList<Faculty> flist = new ArrayList<Faculty>();
        boolean f = false;
        while (true) {
            System.out.println("1. Add: ");
            System.out.println("2. Delete: ");
            System.out.println("3. Update: ");
            System.out.println("4. Print: ");
            System.out.println("5. Search: ");
            System.out.println("6. Exit: ");
            System.out.print("Enter choice: ");
            int i = inp.nextInt();
            switch (i) {
                case (1): {
                    System.out.println("11. Add Student: ");
                    System.out.println("12. Add Course: ");
                    System.out.println("13. Add Faculty: ");
                    System.out.println("14. Add Student to course: ");
                    System.out.println("15. Add course to student: ");
                    System.out.println("16. Add Faculty to course; ");
                    System.out.print("Enter choice: ");
                    int j = inp.nextInt();
                    switch (j) {
                        case (11): {
                            System.out.print("Enter Student id: ");
                            int id = inp.nextInt();
                            inp.nextLine();
                            System.out.print("Enter Student name: ");
                            String name = inp.nextLine();
                            System.out.print("Enter CGPA: ");
                            double cg = inp.nextDouble();
                            slist.add(new Student(id, name, cg));
                            break;
                        }
                        case (12): {
                            inp.nextLine();
                            System.out.print("Enter Course Id: ");
                            String cid = inp.nextLine();
                            System.out.print("Enter Course name: ");
                            String cname = inp.nextLine();
                            System.out.print("Enter credit: ");
                            double cr = inp.nextDouble();
                            clist.add(new Course(cid, cname, cr));
                            break;
                        }
                        case (13): {
                            System.out.print("Enter Faculty Id: ");
                            int sid = inp.nextInt();
                            inp.nextLine();
                            System.out.print("Enter Faculty name: ");
                            String sname = inp.nextLine();
                            System.out.print("Enter position: ");
                            String pos = inp.nextLine();
                            flist.add(new Faculty(sid, sname, pos));
                            break;
                        }
                        case (14): {
                            System.out.print("Enter Student ID to add course: ");
                            int id = inp.nextInt();
                            for (int ii = 0; ii < slist.size(); ii++) {
                                if (slist.get(ii).getid() == id) {
                                    System.out.print("Enter Course ID: ");
                                    inp.nextLine();
                                    String cid = inp.nextLine();
                                    for (int jj = 0; jj < clist.size(); jj++) {
                                        if (Objects.equals(clist.get(jj).getcode(), cid)) {
                                            f = true;
                                            slist.get(ii).slist.add(clist.get(jj));
                                            clist.get(jj).addStudent(slist.get(ii));
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                            if (f) {
                                System.out.println("Course added successfully");
                            } else {
                                System.out.println("Unsuccessful Attempt");
                            }
                            f = false;
                            break;
                        }
                        case (15): {
                            System.out.print("Enter course ID to add  Student: ");
                            String course = inp.nextLine();
                            for (int r = 0; r < clist.size(); r++) {
                                if (Objects.equals(clist.get(r).getcode(), course)) {
                                    System.out.print("Enter student id: ");
                                    int id = inp.nextInt();
                                    for (int y = 0; y < slist.size(); y++) {
                                        if (id == slist.get(i).getid()) {
                                            f = true;
                                            clist.get(r).addStudent(slist.get(y));
                                            slist.get(y).clist.add(clist.get(r));
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                            }
                            if (f) {
                                System.out.println("Student added successfully");
                            } else {
                                System.out.println("Unsuccessful Attempt");
                            }
                            f = false;
                            break;
                        }
                        case (16): {
                            System.out.print("Enter course ID to add faculty: ");
                            inp.nextLine();
                            String course = inp.nextLine();
                            for (int r = 0; r < clist.size(); r++) {
                                if (Objects.equals(clist.get(r).getcode(), course)) {
                                    System.out.print("Enter faculty id: ");
                                    int id = inp.nextInt();
                                    for (int y = 0; y < clist.size(); y++) {
                                        if (id == flist.get(y).getfacid()) {
                                            f = true;
                                            clist.get(r).addFaculty(flist.get(y));
                                            flist.get(y).fcrs.add(clist.get(r));
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
                case (2): {
                    System.out.println("21. Delete Student: ");
                    System.out.println("22. Delete Course: ");
                    System.out.println("23. Delete Faculty: ");
                    System.out.print("Enter Choice: ");
                    int p = inp.nextInt();
                    switch (p) {
                        case (21): {
                            System.out.print("Enter Student ID: ");
                            int dsid = inp.nextInt();

                            for (int j = 0; j < slist.size(); j++) {
                                if (slist.get(j).getid() == dsid) {
                                    slist.remove(j);
                                    f = true;
                                    break;
                                }
                            }
                            for (int g = 0; g < clist.size(); g++) {
                                clist.get(g).dropStudent(dsid);
                            }

                            if (f) {
                                System.out.println("Student removed successfully.");
                            } else {
                                System.out.println("Unsuccessful attempt. Student not found.");
                            }
                            f = false;
                            break;
                        }
                        case (22): {
                            System.out.print("Enter course ID: ");
                            inp.nextLine();
                            String dcid = inp.nextLine();
                            for (int j = 0; j < slist.size(); j++) {
                                if (Objects.equals(clist.get(j).getcode(), dcid)) {
                                    clist.remove(j);
                                    f = true;
                                    break;
                                }
                            }
                            for (int u = 0; u < slist.size(); u++) {
                                slist.get(u).drop(dcid);
                            }
                            for (int u = 0; u < flist.size(); u++) {
                                flist.get(u).dropc(dcid);
                            }

                            if (f) {
                                System.out.println("Course removed successfully.");
                            } else {
                                System.out.println("Unsuccessful attempt. Course not found.");
                            }
                            f = false;
                            break;
                        }
                        case (23): {
                            System.out.print("Enter Faculty ID: ");
                            int dfid = inp.nextInt();
                            for (int j = 0; j < slist.size(); j++) {
                                if (flist.get(j).getfacid() == dfid) {
                                    flist.remove(j);
                                    f = true;
                                    break;
                                }
                            }
                            for (int j = 0; j < clist.size(); j++) {
                                if (clist.get(j).CgetFacultyId() == dfid) {
                                    clist.get(i).dropFaculty();
                                }
                            }
                            if (f) {
                                System.out.println("Course removed successfully.");
                            } else {
                                System.out.println("Unsuccessful attempt. Course not found.");
                            }
                            f = false;
                            break;
                        }
                    }
                    break;
                }
                case (3): {
                    System.out.println("31. Update Student: ");
                    System.out.println("32. Update Course: ");
                    System.out.println("33. Update Faculty: ");
                    System.out.print("Enter Choice: ");
                    int u = inp.nextInt();
                    inp.nextLine();
                    switch (u) {
                        case (31): {
                            System.out.print("Enter Student id: ");
                            int ssid = inp.nextInt();
                            for (int e = 0; e < slist.size(); e++) {
                                if (slist.get(e).getid() == ssid) {
                                    f = true;
                                    System.out.println("311. Update Id");
                                    System.out.println("312. Update Name ");
                                    System.out.println("313. Update CGPA");
                                    System.out.print("Enter Choice: ");
                                    int choice = inp.nextInt();
                                    switch (choice) {
                                        case (311): {
                                            System.out.print("Enter Id: ");
                                            slist.get(e).setid(inp.nextInt());
                                            break;
                                        }
                                        case (312): {
                                            System.out.print("Enter Name: ");
                                            inp.nextLine();
                                            slist.get(e).setname(inp.nextLine());
                                            break;
                                        }
                                        case (313): {
                                            System.out.print("Enter CGPA: ");
                                            slist.get(e).setcgpa(inp.nextDouble());
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                            if (f) {
                                System.out.println("Updated Successfully");
                            } else {
                                System.out.println("Unsuccessful attempt. Student not found.");
                            }
                            f = false;
                            break;
                        }
                        case (32): {
                            System.out.print("Enter course id: ");
                            inp.nextLine();
                            String ccid = inp.nextLine();
                            for (int e = 0; e < slist.size(); e++) {
                                if (Objects.equals(clist.get(e).getcode(), ccid)) {
                                    f = true;
                                    System.out.println("321. Update Id");
                                    System.out.println("322. Update Title ");
                                    System.out.println("323. Update credit");
                                    int choice = inp.nextInt();
                                    switch (choice) {
                                        case (321): {
                                            System.out.print("Enter Id: ");
                                            inp.nextLine();
                                            clist.get(e).setcode(inp.nextLine());
                                            break;
                                        }
                                        case (322): {
                                            System.out.print("Enter Title: ");
                                            inp.nextLine();
                                            clist.get(e).settitle(inp.nextLine());
                                            break;
                                        }
                                        case (323): {
                                            System.out.print("Enter Credit: ");
                                            clist.get(e).setcredit(inp.nextDouble());
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                            if (f) {
                                System.out.println("Updated Successfully");
                            } else {
                                System.out.println("Unsuccessful attempt. course not found.");
                            }
                            f = false;
                            break;
                        }
                        case (33): {
                            System.out.println("Enter faculty id: ");
                            int ffid = inp.nextInt();
                            for (int e = 0; e < slist.size(); e++) {
                                if (flist.get(i).getfacid() == ffid) {
                                    f = true;
                                    System.out.println("321. Update Id");
                                    System.out.println("322. Update Title ");
                                    System.out.println("333. Update Position");
                                    System.out.print("Enter Choice: ");
                                    int choice = inp.nextInt();
                                    switch (choice) {
                                        case (331): {
                                            System.out.print("Enter Id: ");
                                            flist.get(e).setfacid(inp.nextInt());
                                            break;
                                        }
                                        case (332): {
                                            System.out.print("Enter Name: ");
                                            inp.nextLine();
                                            flist.get(e).setfacname(inp.nextLine());
                                            break;
                                        }
                                        case (333): {
                                            System.out.print("Enter Position: ");
                                            inp.nextLine();
                                            flist.get(e).setfacposition(inp.nextLine());
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                            if (f) {
                                System.out.println("Updated Successfully");
                            } else {
                                System.out.println("Unsuccessful attempt. course not found.");
                            }
                            f = false;
                            break;
                        }
                    }
                    break;
                }
                case (4): {
                    System.out.println("41. Print all Student: ");
                    System.out.println("42. print all Course: ");
                    System.out.println("43. print all Faculties: ");
                    System.out.println("44. Print information of a student: ");
                    System.out.println("45. Print information of a course: ");
                    System.out.println("46. Print information of a faculty: ");
                    System.out.println("47. Print faculty information and student list: ");
                    System.out.println("48. print courses taken by student: ");
                    System.out.print("Enter Choice: ");
                    int cho = inp.nextInt();
                    switch (cho) {
                        case (41): {
                            System.out.println("All Students: ");
                            for (int bb = 0; bb < slist.size(); bb++) {
                                slist.get(bb).display();
                            }

                            break;
                        }
                        case (42): {
                            System.out.println("All Courses: ");
                            for (int cc = 0; cc < clist.size(); cc++) {
                                clist.get(cc).display();
                            }

                            break;
                        }
                        case (43): {
                            System.out.println("All Faculties: ");
                            for (int ff = 0; ff < flist.size(); ff++) {
                                flist.get(ff).display();
                            }

                            break;
                        }
                        case (44): {
                            System.out.print("Enter student Id: ");
                            int id = inp.nextInt();
                            for (int e = 0; e < slist.size(); e++) {
                                if (slist.get(e).getid() == id) {
                                    f = true;
                                    slist.get(e).display();
                                    break;
                                }
                            }
                            if (!f) {
                                System.out.println("Unsuccessful attempt.");
                            }
                            f = false;
                            break;
                        }
                        case (45): {
                            System.out.print("Enter Course Id: ");
                            inp.nextLine();
                            String id = inp.nextLine();
                            for (int e = 0; e < clist.size(); e++) {
                                if (Objects.equals(clist.get(e).getcode(), id)) {
                                    f = true;
                                    clist.get(e).display();
                                    break;
                                }
                            }
                            if (!f) {
                                System.out.println("Unsuccessful attempt.");
                            }
                            f = false;
                            break;
                        }
                        case (46): {
                            System.out.print("Enter faculty Id: ");
                            int id = inp.nextInt();
                            for (int e = 0; e < flist.size(); e++) {
                                if (flist.get(e).getfacid() == id) {
                                    f = true;
                                    flist.get(e).display();
                                    break;
                                }
                            }
                            if (!f) {
                                System.out.println("Unsuccessful attempt.");
                            }
                            f = false;
                            break;
                        }
                    }
                }
            }
        }
    }
}
