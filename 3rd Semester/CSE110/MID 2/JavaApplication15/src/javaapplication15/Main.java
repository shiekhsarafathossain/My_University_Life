package javaapplication15;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Course> clist = new ArrayList<Course>();
        ArrayList<Student> slist = new ArrayList<Student>();
        ArrayList<Faculty> flist = new ArrayList<Faculty>();
        boolean f = false, ret = true;

        System.out.println("====================");
        System.out.print("\tMenu\n");
        System.out.println("====================");
        System.out.print("a. Add\nb. Delete\nc. Update\nd. Print \ne. Search\n");
        System.out.print("Enter choice: ");

        char main = input.next().charAt(0);
        while (ret) {
            switch (main) {
                case 'a':
                    System.out.println("a. Add Student: ");
                    System.out.println("b. Add Course: ");
                    System.out.println("c. Add Faculty: ");
                    System.out.print("Enter choice: ");

                    char add = input.next().charAt(0);

                    switch (add) {
                        case 'a':
                            System.out.print("Enter Student id: ");
                            int id = input.nextInt();
                            input.nextLine();
                            System.out.print("Enter Student name: ");
                            String name = input.nextLine();
                            System.out.print("Enter CGPA: ");
                            double cg = input.nextDouble();
                            slist.add(new Student(id, name, cg));
                            break;

                        case 'b':
                            input.nextLine();
                            System.out.print("Enter Course Id: ");
                            String cid = input.nextLine();
                            System.out.print("Enter Course name: ");
                            String cname = input.nextLine();
                            System.out.print("Enter credit: ");
                            double cr = input.nextDouble();
                            clist.add(new Course(cid, cname, cr));
                            break;
                        case 'c':
                            System.out.print("Enter Faculty Id: ");
                            int sid = input.nextInt();
                            input.nextLine();
                            System.out.print("Enter Faculty name: ");
                            String sname = input.nextLine();
                            System.out.print("Enter position: ");
                            String pos = input.nextLine();
                            flist.add(new Faculty(sid, sname, pos));
                            break;
                    }
                case 'b':
                    System.out.println("a. Delete Student: ");
                    System.out.println("b. Delete Course: ");
                    System.out.println("c. Delete Faculty: ");
                    System.out.print("Enter Choice: ");

                    char del = input.next().charAt(0);

                    switch (del) {
                        case 'a':
                            System.out.print("Enter Student ID: ");
                            int dsid = input.nextInt();

                            for (int j = 0; j < slist.size(); j++) {
                                if (slist.get(j).getStudentId() == dsid) {
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
                        case 'b':
                            System.out.print("Enter course ID: ");
                            input.nextLine();
                            String dcid = input.nextLine();
                            for (int j = 0; j < slist.size(); j++) {
                                if (Objects.equals(clist.get(j).getCourseID(), dcid)) {
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
                        case 'c':
                            System.out.print("Enter Faculty ID: ");
                            int dfid = input.nextInt();
                            for (int j = 0; j < slist.size(); j++) {
                                if (flist.get(j).getFacultyId() == dfid) {
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
                case 'c':
                    System.out.println("a. Update Student: ");
                    System.out.println("b. Update Course: ");
                    System.out.println("c. Update Faculty: ");
                    System.out.print("Enter Choice: ");
                    char update = input.next().charAt(0);
                    input.nextLine();
                    switch (update) {
                        case 'a':
                            System.out.print("Enter Student id: ");
                            int ssid = input.nextInt();
                            for (int e = 0; e < slist.size(); e++) {
                                if (slist.get(e).getStudentId() == ssid) {
                                    f = true;
                                    System.out.print("Enter Name: ");
                                    input.nextLine();
                                    slist.get(e).setStudentName(input.nextLine());
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
                        case 'b':
                            System.out.print("Enter course id: ");
                            input.nextLine();
                            String ccid = input.nextLine();
                            for (int e = 0; e < slist.size(); e++) {
                                if (Objects.equals(clist.get(e).getCourseID(), ccid)) {
                                    f = true;
                                    System.out.print("Enter Title: ");
                                    input.nextLine();
                                    clist.get(e).setCourseTitle(input.nextLine());
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
                        case 'c':
                            System.out.println("Enter faculty id: ");
                            int ffid = input.nextInt();
                            for (int e = 0; e < slist.size(); e++) {
                                if (flist.get(i).getFacultyId() == ffid) {
                                    f = true;
                                    System.out.print("Enter Name: ");
                                    input.nextLine();
                                    flist.get(e).setFacultyName(input.nextLine());
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
                case 'd':
                    System.out.println("41. Print all Student: ");
                    System.out.println("42. print all Course: ");
                    System.out.println("43. print all Faculties: ");
                    System.out.println("44. Print information of a student: ");
                    System.out.println("45. Print information of a course: ");
                    System.out.println("46. Print information of a faculty: ");
                    System.out.println("47. Print faculty information and student list: ");
                    System.out.println("48. print courses taken by student: ");
                    System.out.print("Enter Choice: ");
                    break;
                case 'e':
                    System.out.println("51. Search a student.");
                    System.out.println("52. Search a course.");
                    System.out.println("53. Search a Faculty.");
                    System.out.println("54. Search whether a student takes a course.");
                    System.out.println("55. Search whether a faculty teaches a course.");
                    System.out.println("56. Search courses taken by a student.");
                    System.out.println("57. Search courses taught by a faculty.");
                    System.out.print("Enter Choice: ");
                    break;
                case (6: {
                    ret = false;
                    break;
                }
                default: {
                    System.out.println("Wrong Keyword");
                    break;
                }
            }
        }
    }
}
