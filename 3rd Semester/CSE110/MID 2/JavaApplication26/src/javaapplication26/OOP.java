package javaapplication26;

import java.util.Scanner;

class Student {
    private int studentId;
    private String studentName;
    private double studentCGPA;

    public Student() {
    }

    public Student(int studentId, String studentName, double studentCGPA) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCGPA = studentCGPA;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId +
               ", Name: " + studentName +
               ", CGPA: " + studentCGPA;
    }
}


class Course {
    private String courseId;
    private String courseTitle;
    private double credit;
    private Student[] studentList;
    private int numberOfStudents;
    private Faculty faculty;

    public Course() {
        studentList = new Student[100]; // Assuming a maximum of 100 students per course
        numberOfStudents = 0;
    }

    public Course(String courseId, String courseTitle, double credit) {
        this();
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Course ID: " + courseId +
               ", Title: " + courseTitle +
               ", Credit: " + credit;
    }

    public void addStudent(Student student) {
        if (numberOfStudents < 100) {
            studentList[numberOfStudents] = student;
            numberOfStudents++;
        } else {
            System.out.println("Maximum number of students reached for this course.");
        }
    }

    public void dropStudent(int studentId) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (studentList[i].studentId == studentId) {
                studentList[i] = studentList[numberOfStudents - 1];
                numberOfStudents--;
                System.out.println("Student with ID " + studentId + " dropped from the course.");
                return;
            }
        }
        System.out.println("Student with ID " + studentId + " not found in the course.");
    }

    public void addFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void dropFaculty() {
        this.faculty = null;
    }

    public void printStudentList() {
        System.out.println("Student list for course " + courseTitle + ":");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(studentList[i].toString());
        }
    }
}


class Faculty {
    private int facultyId;
    private String facultyName;
    private String facultyPosition;

    public Faculty() {
    }

    public Faculty(int facultyId, String facultyName, String facultyPosition) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyPosition = facultyPosition;
    }

    @Override
    public String toString() {
        return "Faculty ID: " + facultyId +
               ", Name: " + facultyName +
               ", Position: " + facultyPosition;
    }
}



public class OOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CourseManagementSystem courseManagementSystem = new CourseManagementSystem();

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("-------- Menu --------");
            System.out.println("a. Add");
            System.out.println("b. Delete");
            System.out.println("c. Update");
            System.out.println("d. Print");
            System.out.println("e. Search");
            System.out.println("f. Exit");
            System.out.print("Enter your choice: ");
            char choice = scanner.next().charAt(0);

            switch (choice) {
                case 'a':
                    showAddOptions(scanner, courseManagementSystem);
                    break;
                case 'b':
                    showDeleteOptions(scanner, courseManagementSystem);
                    break;
                case 'c':
                    showUpdateOptions(scanner, courseManagementSystem);
                    break;
                case 'd':
                    showPrintOptions(scanner, courseManagementSystem);
                    break;
                case 'e':
                    showSearchOptions(scanner, courseManagementSystem);
                    break;
                case 'f':
                    isRunning = false;
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void showAddOptions(Scanner scanner, CourseManagementSystem courseManagementSystem) {
        System.out.println("-------- Add Options --------");
        System.out.println("a. Add a Student");
        System.out.println("b. Add a Course");
        System.out.println("c. Add a Faculty");
        System.out.print("Enter your choice: ");
        char choice = scanner.next().charAt(0);

        switch (choice) {
            case 'a':
                // Implement logic to add a student
                break;
            case 'b':
                // Implement logic to add a course
                break;
            case 'c':
                // Implement logic to add a faculty
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void showDeleteOptions(Scanner scanner, CourseManagementSystem courseManagementSystem) {
        System.out.println("-------- Delete Options --------");
        System.out.println("a. Delete a Student");
        System.out.println("b. Delete a Course");
        System.out.println("c. Delete a Faculty");
        System.out.print("Enter your choice: ");
        char choice = scanner.next().charAt(0);

        switch (choice) {
            case 'a':
                // Implement logic to delete a student
                break;
            case 'b':
                // Implement logic to delete a course
                break;
            case 'c':
                // Implement logic to delete a faculty
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void showUpdateOptions(Scanner scanner, CourseManagementSystem courseManagementSystem) {
        System.out.println("-------- Update Options --------");
        System.out.println("a. Update a Student");
        System.out.println("b. Update a Course");
        System.out.println("c. Update a Faculty");
        System.out.print("Enter your choice: ");
        char choice = scanner.next().charAt(0);

        switch (choice) {
            case 'a':
                // Implement logic to update a student
                break;
            case 'b':
                // Implement logic to update a course
                break;
            case 'c':
                // Implement logic to update a faculty
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void showPrintOptions(Scanner scanner, CourseManagementSystem courseManagementSystem) {
        System.out.println("-------- Print Options --------");
        System.out.println("a. Print all students");
        System.out.println("b. Print all courses");
        System.out.println("c. Print all faculties");
        System.out.println("d. Print information of a student");
        System.out.println("e. Print information of a course");
        System.out.println("f. Print information of a faculty");
        System.out.println("g. Print student list and faculty information of a course");
        System.out.println("h. Print courses taken by a student");
        System.out.print("Enter your choice: ");
        char choice = scanner.next().charAt(0);

        switch (choice) {
            case 'a':
                // Implement logic to print all students
                break;
            case 'b':
                // Implement logic to print all courses
                break;
            case 'c':
                // Implement logic to print all faculties
                break;
            case 'd':
                // Implement logic to print information of a student
                break;
            case 'e':
                // Implement logic to print information of a course
                break;
            case 'f':
                // Implement logic to print information of a faculty
                break;
            case 'g':
                // Implement logic to print student list and faculty information of a course
                break;
            case 'h':
                // Implement logic to print courses taken by a student
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void showSearchOptions(Scanner scanner, CourseManagementSystem courseManagementSystem) {
        System.out.println("-------- Search Options --------");
        System.out.println("a. Search a Student");
        System.out.println("b. Search a Course");
        System.out.println("c. Search a Faculty");
        System.out.println("d. Search whether a student takes a course");
        System.out.println("e. Search whether a faculty teaches a course");
        System.out.println("f. Search courses taken by a student");
        System.out.println("g. Search courses taught by a faculty");
        System.out.print("Enter your choice: ");
        char choice = scanner.next().charAt(0);

        switch (choice) {
            case 'a':
                // Implement logic to search a student
                break;
            case 'b':
                // Implement logic to search a course
                break;
            case 'c':
                // Implement logic to search a faculty
                break;
            case 'd':
                // Implement logic to search whether a student takes a course
                break;
            case 'e':
                // Implement logic to search whether a faculty teaches a course
                break;
            case 'f':
                // Implement logic to search courses taken by a student
                break;
            case 'g':
                // Implement logic to search courses taught by a faculty
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
