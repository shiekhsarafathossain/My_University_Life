package chatgpt;

public class Course {
    private String courseId;
    private String courseTitle;
    private double credit;
    private Student[] studentList;
    private int numberOfStudents;
    private Faculty faculty;

    public Course() {
        // Default constructor
    }

    public Course(String courseId, String courseTitle, double credit) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
        this.studentList = new Student[100]; // Assuming a maximum of 100 students per course
        this.numberOfStudents = 0;
    }

    public void addStudent(Student student) {
        if (numberOfStudents < 100) {
            studentList[numberOfStudents++] = student;
        } else {
            System.out.println("Maximum student limit reached for this course.");
        }
    }

    public void dropStudent(int studentId) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (studentList[i].studentId == studentId) {
                // Shift the remaining elements in the array to remove the student
                for (int j = i; j < numberOfStudents - 1; j++) {
                    studentList[j] = studentList[j + 1];
                }
                numberOfStudents--;
                break;
            }
        }
    }

    public void addFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void dropFaculty() {
        this.faculty = null;
    }

    @Override
    public String toString() {
        return "Course ID: " + courseId + "\nTitle: " + courseTitle + "\nCredit: " + credit;
    }

    public void printStudentList() {
        if (numberOfStudents > 0) {
            System.out.println("Students enrolled in " + courseTitle + ":");
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.println(studentList[i]);
            }
        } else {
            System.out.println("No students enrolled in this course.");
        }
    }
}
