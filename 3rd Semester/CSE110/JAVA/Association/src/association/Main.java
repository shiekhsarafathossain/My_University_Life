package association;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> slist = new ArrayList<Student>();
        ArrayList<Course> clist = new ArrayList<Course>();
        ArrayList<Faculty> flist = new ArrayList<Faculty>();

        while (true) {

            System.out.println("\n------ University Management System -----");
            System.out.println("a. Add");
            System.out.println("b. Assign");
            System.out.println("c. Delete");
            System.out.println("d. Update");
            System.out.println("e. Print");
            System.out.println("f. Search");
            System.out.println("g. Exit");

            System.out.print("Enter your choice: ");
            String mainChoice = scanner.nextLine();

            switch (mainChoice.toLowerCase()) {

                case "a":
                    System.out.println("\nAdd Menu");
                    System.out.println("a. Add a Student");
                    System.out.println("b. Add a Course");
                    System.out.println("c. Add a Faculty");
                    System.out.print("Enter your choice: ");
                    String addChoice = scanner.nextLine();

                    switch (addChoice.toLowerCase()) {
                        case "a":

                            System.out.print("Enter Student ID: ");
                            int studentId = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter Student name: ");
                            String studentName = scanner.nextLine();
                            System.out.print("Enter Student CGPA: ");
                            double studentCGPA = scanner.nextDouble();
                            Student student = new Student(studentId, studentName, studentCGPA);
                            slist.add(student);

                            break;

                        case "b":

                            System.out.print("Enter Course ID: ");
                            String courseId = scanner.nextLine();
                            System.out.print("Enter Course title: ");
                            String courseTitle = scanner.nextLine();
                            System.out.print("Enter Credit: ");
                            double credit = scanner.nextDouble();
                            Course course = new Course(courseId, courseTitle, credit);
                            clist.add(course);

                            break;

                        case "c":

                            System.out.print("Enter Faculty ID: ");
                            int facultyId = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter Faculty name: ");
                            String facultyName = scanner.nextLine();
                            System.out.print("Enter Faculty position: ");
                            String facultyPosition = scanner.nextLine();
                            Faculty faculty = new Faculty(facultyId, facultyName, facultyPosition);
                            flist.add(faculty);

                            break;

                    }
                    break;

                case "b":

                    System.out.println("\nAssign Menu");
                    System.out.println("a. Assign a Student to a course");
                    System.out.println("b. Assing a Faculty to a Course");
                    System.out.print("Enter your choice: ");
                    String assignChoice = scanner.nextLine();

                    switch (assignChoice.toLowerCase()) {
                        case "a":

                            System.out.print("Enter Student ID: ");
                            int studentId = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Enter Course ID: ");
                            String courseId = scanner.nextLine();

                            Student student = new Student();
                            for (int i = 0; i < slist.size(); i++) {
                                if (slist.get(i).getStudentId() == studentId) {
                                    student = slist.get(i);

                                }
                            }

                            Course course = new Course();
                            for (int i = 0; i < clist.size(); i++) {
                                if (clist.get(i).getCourseId().equals(courseId)) {
                                    course = clist.get(i);

                                }
                            }

                            course.addStudent(student);
                            student.addCourse(course);

                            System.out.println("Course assigned to Student");

                            break;

                        case "b":

                            System.out.print("Enter Faculty ID: ");
                            int facultyId = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Enter Course ID: ");
                            String courseid = scanner.nextLine();

                            Faculty faculty = new Faculty();
                            for (int i = 0; i < flist.size(); i++) {
                                if (flist.get(i).getFacultyId() == facultyId) {
                                    faculty = flist.get(i);

                                }
                            }

                            Course cid = new Course();
                            for (int i = 0; i < clist.size(); i++) {
                                if (clist.get(i).getCourseId().equals(courseid)) {
                                    cid = clist.get(i);

                                }
                            }

                            
                            System.out.println("Course assigned to Faculty");

                            break;
                    }
                    break;

                case "c":

                    System.out.println("\nDelete Menu");
                    System.out.println("a. Delete a Student");
                    System.out.println("b. Delete a Course");
                    System.out.println("c. Delete a Faculty");
                    System.out.print("Enter your choice: ");
                    String deleteChoice = scanner.nextLine();

                    switch (deleteChoice.toLowerCase()) {
                        case "a":

                            System.out.print("Enter Student ID: ");
                            int studentId = scanner.nextInt();
                            scanner.nextLine();

                            for (int i = 0; i < slist.size(); i++) {
                                if (slist.get(i).getStudentId() == studentId) {
                                    slist.remove(i);
                                    break;
                                } else {
                                    System.out.println("Not found");
                                }

                            }
                            break;

                        case "b":

                            System.out.print("Enter Course ID: ");
                            String courseId = scanner.nextLine();
                            scanner.nextLine();

                            for (int i = 0; i < clist.size(); i++) {
                                if (clist.get(i).getCourseId().equals(courseId)) {
                                    clist.remove(i);
                                    break;
                                } else {
                                    System.out.println("Not found");
                                }

                            }
                            break;

                        case "c":

                            System.out.print("Enter Faculty ID: ");
                            int facultyId = scanner.nextInt();
                            scanner.nextLine();

                            for (int i = 0; i < flist.size(); i++) {
                                if (flist.get(i).getFacultyId() == facultyId) {
                                    flist.remove(i);
                                    break;
                                } else {
                                    System.out.println("Not found");
                                }

                            }
                            break;
                    }
                    break;

                case "d":

                    System.out.println("\nUpdate Menu");
                    System.out.println("a. Update a Student");
                    System.out.println("b. Update a Course");
                    System.out.println("c. Update a Faculty");
                    System.out.print("Enter your choice: ");
                    String updateChoice = scanner.nextLine();

                    switch (updateChoice.toLowerCase()) {

                        case "a":

                            System.out.print("Enter Student ID to update: ");
                            int studentId = scanner.nextInt();
                            scanner.nextLine();

                            for (int i = 0; i < slist.size(); i++) {
                                if (slist.get(i).getStudentId() == studentId) {
                                    System.out.print("Enter Student's new ID:");
                                    int sid = scanner.nextInt();
                                    slist.get(i).setStudentId(sid);
                                    System.out.println("ID successfully updated for: " + sid);
                                    break;
                                } else {
                                    System.out.println("Not found");
                                }
                            }
                            break;

                        case "b":

                            System.out.print("Enter Course ID to update: ");
                            String courseId = scanner.nextLine();

                            for (int i = 0; i < clist.size(); i++) {
                                if (clist.get(i).getCourseId().equals(courseId)) {
                                    System.out.print("Enter Course's new ID:");
                                    String cid = scanner.nextLine();
                                    clist.get(i).setCourseId(cid);
                                    System.out.println("ID successfully updated for: " + cid);
                                    break;
                                } else {
                                    System.out.println("Not found");
                                }
                            }
                            break;

                        case "c":

                            System.out.print("Enter Faculty ID to update: ");
                            int facultyId = scanner.nextInt();
                            scanner.nextLine();

                            for (int i = 0; i < flist.size(); i++) {
                                if (flist.get(i).getFacultyId() == facultyId) {
                                    System.out.print("Enter Faculty's new ID:");
                                    int fid = scanner.nextInt();
                                    flist.get(i).setFacultyId(fid);
                                    System.out.println("ID successfully updated for: " + fid);
                                    break;
                                } else {
                                    System.out.println("Not found");
                                }
                            }
                            break;

                    }
                    break;

                case "e":

                    System.out.println("\nPrint Menu");
                    System.out.println("a. Print Student list");
                    System.out.println("b. Print Course list");
                    System.out.println("c. Print Faculty list");
                    System.out.println("d. Print information of a student");
                    System.out.println("e. Print information of a course");
                    System.out.println("f. Print information of a faculty");
                    System.out.println("g. Print courses taken by a student ");
                    System.out.print("Enter your choice: ");
                    String printChoice = scanner.nextLine();

                    switch (printChoice.toLowerCase()) {

                        case "a":
                            System.out.println("All Student List: ");
                            for (int i = 0; i < slist.size(); i++) {
                                slist.get(i).display();
                            }
                            break;

                        case "b":
                            System.out.println("All Course List: ");
                            for (int i = 0; i < clist.size(); i++) {
                                clist.get(i).displayCourse();
                            }
                            break;

                        case "c":
                            System.out.println("All Faculty List: ");
                            for (int i = 0; i < flist.size(); i++) {
                                flist.get(i).display();
                            }
                            break;

                        case "d":
                            System.out.print("Enter Student ID: ");
                            int studentId = scanner.nextInt();
                            scanner.nextLine();

                            for (int i = 0; i < slist.size(); i++) {
                                if (slist.get(i).getStudentId() == studentId) {
                                    slist.get(i).display();
                                    break;

                                } else {
                                    System.out.println("Not found");
                                }
                            }
                            break;

                        case "e":

                            System.out.print("Enter Course ID: ");
                            String courseId = scanner.nextLine();
                            scanner.nextLine();

                            for (int i = 0; i < clist.size(); i++) {
                                if (clist.get(i).getCourseId().equals(courseId)) {
                                    clist.get(i).displayCourse();
                                    break;

                                } else {
                                    System.out.println("Not found");
                                }
                            }
                            break;

                        case "f":

                            System.out.print("Enter Faculty ID: ");
                            int facultyId = scanner.nextInt();
                            scanner.nextLine();

                            for (int i = 0; i < flist.size(); i++) {
                                if (flist.get(i).getFacultyId() == facultyId) {
                                    flist.get(i).display();
                                    break;

                                } else {
                                    System.out.println("Not found");
                                }
                            }
                            break;

                        case "g":

                            System.out.print("Enter Student ID: ");
                            int studentID = scanner.nextInt();
                            scanner.nextLine();

                            for (int i = 0; i < slist.size(); i++) {
                                if (slist.get(i).getStudentId() == studentID) {
                                    slist.get(i).displayassign();
                                    break;

                                } else {
                                    System.out.println("Not found");
                                }
                            }

                    }
                    break;

                case "f":

                    System.out.println("\nSearch Menu");
                    System.out.println("a. Search a Student");
                    System.out.println("b. Search a Course");
                    System.out.println("c. Search a Faculty");
                    String searchChoice = scanner.nextLine();

                    switch (searchChoice.toLowerCase()) {

                        case "a":

                            System.out.print("Enter Student ID: ");
                            int studentId = scanner.nextInt();
                            scanner.nextLine();

                            for (int i = 0; i < slist.size(); i++) {
                                if (slist.get(i).getStudentId() == studentId) {
                                    System.out.println("Found");
                                    break;
                                } else {
                                    System.out.println("Not found");
                                    break;
                                }

                            }
                            break;

                        case "b":

                            System.out.print("Enter Course ID: ");
                            String courseId = scanner.nextLine();
                            scanner.nextLine();

                            for (int i = 0; i < clist.size(); i++) {
                                if (clist.get(i).getCourseId().equals(courseId)) {
                                    System.out.println("Found");
                                    break;
                                } else {
                                    System.out.println("Not found");
                                    break;
                                }

                            }
                            break;

                        case "c":

                            System.out.print("Enter Faculty ID: ");
                            int facultyId = scanner.nextInt();
                            scanner.nextLine();

                            for (int i = 0; i < flist.size(); i++) {
                                if (flist.get(i).getFacultyId() == facultyId) {
                                    System.out.println("Found");
                                    break;
                                } else {
                                    System.out.println("Not found");
                                    break;
                                }

                            }
                            break;

                    }

            }
        }
    }
}
