package chatgpt;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[100];
        int studentCount = 0;

        Course[] courses = new Course[50];
        int courseCount = 0;

        Faculty[] faculties = new Faculty[20];
        int facultyCount = 0;

        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("a. Add");
            System.out.println("b. Delete");
            System.out.println("c. Update");
            System.out.println("d. Print");
            System.out.println("e. Search");
            System.out.println("f. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            if (choice.equals("a")) {
                System.out.println("\nAdd Menu:");
                System.out.println("a. Add a Student");
                System.out.println("b. Add a Course");
                System.out.println("c. Add a Faculty");
                System.out.print("Enter your choice: ");
                String addChoice = scanner.nextLine();

                if (addChoice.equals("a")) {
                    // Add a Student
                    System.out.print("Enter student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter student CGPA: ");
                    double studentCGPA = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character

                    Student student = new Student(studentId, studentName, studentCGPA);
                    students[studentCount++] = student;
                } else if (addChoice.equals("b")) {
                    // Add a Course
                    System.out.print("Enter course ID: ");
                    String courseId = scanner.nextLine();
                    System.out.print("Enter course title: ");
                    String courseTitle = scanner.nextLine();
                    System.out.print("Enter credit: ");
                    double credit = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character

                    Course course = new Course(courseId, courseTitle, credit);
                    courses[courseCount++] = course;
                } else if (addChoice.equals("c")) {
                    // Add a Faculty
                    System.out.print("Enter faculty ID: ");
                    int facultyId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter faculty name: ");
                    String facultyName = scanner.nextLine();
                    System.out.print("Enter faculty position: ");
                    String facultyPosition = scanner.nextLine();

                    Faculty faculty = new Faculty(facultyId, facultyName, facultyPosition);
                    faculties[facultyCount++] = faculty;
                } else {
                    System.out.println("Invalid choice.");
                }
            } else if (choice.equals("b")) {
                System.out.println("\nDelete Menu:");
                System.out.println("a. Delete a Student");
                System.out.println("b. Delete a Course");
                System.out.println("c. Delete a Faculty");
                System.out.print("Enter your choice: ");
                String deleteChoice = scanner.nextLine();

                // Implement delete options here (similar to add options)
                // Remember to handle invalid choices appropriately
            } else if (choice.equals("c")) {
                System.out.println("\nUpdate Menu:");
                // Implement update options here
                // Remember to handle invalid choices appropriately
            } else if (choice.equals("d")) {
                System.out.println("\nPrint Menu:");
                // Implement print options here
                // Remember to handle invalid choices appropriately
            } else if (choice.equals("e")) {
                System.out.println("\nSearch Menu:");
                // Implement search options here
                // Remember to handle invalid choices appropriately
            } else if (choice.equals("f")) {
                System.out.println("Exiting the application. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
