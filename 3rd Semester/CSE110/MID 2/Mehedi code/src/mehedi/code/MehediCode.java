package mehedi.code;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class MehediCode {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Course> clist = new ArrayList<Course>();
        ArrayList<Student> slist = new ArrayList<Student>();
        ArrayList<Faculty> flist = new ArrayList<Faculty>();
        boolean f = false, ret = true;
        while (ret) {
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
                                if (slist.get(ii).getStudentId() == id) {
                                    System.out.print("Enter Course ID: ");
                                    inp.nextLine();
                                    String cid = inp.nextLine();
                                    for (int jj = 0; jj < clist.size(); jj++) {
                                        if (Objects.equals(clist.get(jj).getCourseID(), cid)) {
                                            f = true;
                                            slist.get(ii).courses.add(clist.get(jj));
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
                                if (Objects.equals(clist.get(r).getCourseID(), course)) {
                                    System.out.print("Enter student id: ");
                                    int id = inp.nextInt();
                                    for (int y = 0; y < slist.size(); y++) {
                                        if (id == slist.get(i).getStudentId()) {
                                            f = true;
                                            clist.get(r).addStudent(slist.get(y));
                                            slist.get(y).courses.add(clist.get(r));
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
                                if (Objects.equals(clist.get(r).getCourseID(), course)) {
                                    System.out.print("Enter faculty id: ");
                                    int id = inp.nextInt();
                                    for (int y = 0; y < clist.size(); y++) {
                                        if (id == flist.get(y).getFacultyId()) {
                                            f = true;
                                            clist.get(r).addFaculty(flist.get(y));
                                            flist.get(y).crs.add(clist.get(r));
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
                        }
                        case (22): {
                            System.out.print("Enter course ID: ");
                            inp.nextLine();
                            String dcid = inp.nextLine();
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
                        }
                        case (23): {
                            System.out.print("Enter Faculty ID: ");
                            int dfid = inp.nextInt();
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
                                if (slist.get(e).getStudentId() == ssid) {
                                    f = true;
                                    System.out.println("311. Update Id");
                                    System.out.println("312. Update Name ");
                                    System.out.println("313. Update CGPA");
                                    System.out.print("Enter Choice: ");
                                    int choice = inp.nextInt();
                                    switch (choice) {
                                        case (311): {
                                            System.out.print("Enter Id: ");
                                            slist.get(e).setStudentId(inp.nextInt());
                                            break;
                                        }
                                        case (312): {
                                            System.out.print("Enter Name: ");
                                            inp.nextLine();
                                            slist.get(e).setStudentName(inp.nextLine());
                                            break;
                                        }
                                        case (313): {
                                            System.out.print("Enter CGPA: ");
                                            slist.get(e).setStudentCGPA(inp.nextDouble());
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
                                if (Objects.equals(clist.get(e).getCourseID(), ccid)) {
                                    f = true;
                                    System.out.println("321. Update Id");
                                    System.out.println("322. Update Title ");
                                    System.out.println("323. Update credit");
                                    int choice = inp.nextInt();
                                    switch (choice) {
                                        case (321): {
                                            System.out.print("Enter Id: ");
                                            inp.nextLine();
                                            clist.get(e).setCourseID(inp.nextLine());
                                            break;
                                        }
                                        case (322): {
                                            System.out.print("Enter Title: ");
                                            inp.nextLine();
                                            clist.get(e).setCourseTitle(inp.nextLine());
                                            break;
                                        }
                                        case (323): {
                                            System.out.print("Enter Credit: ");
                                            clist.get(e).setCredit(inp.nextDouble());
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
                                if (flist.get(i).getFacultyId() == ffid) {
                                    f = true;
                                    System.out.println("321. Update Id");
                                    System.out.println("322. Update Title ");
                                    System.out.println("333. Update Position");
                                    System.out.print("Enter Choice: ");
                                    int choice = inp.nextInt();
                                    switch (choice) {
                                        case (331): {
                                            System.out.print("Enter Id: ");
                                            flist.get(e).setFacultyId(inp.nextInt());
                                            break;
                                        }
                                        case (332): {
                                            System.out.print("Enter Name: ");
                                            inp.nextLine();
                                            flist.get(e).setFacultyName(inp.nextLine());
                                            break;
                                        }
                                        case (333): {
                                            System.out.print("Enter Position: ");
                                            inp.nextLine();
                                            flist.get(e).setFacultyPosition(inp.nextLine());
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
                                System.out.println(slist.get(bb).to_String());
                            }

                            break;
                        }
                        case (42): {
                            System.out.println("All Courses: ");
                            for (int cc = 0; cc < clist.size(); cc++) {
                                System.out.println(clist.get(cc).to_string());
                            }

                            break;
                        }
                        case (43): {
                            System.out.println("All Faculties: ");
                            for (int ff = 0; ff < flist.size(); ff++) {
                                System.out.println(flist.get(ff).to_string());
                            }

                            break;
                        }
                        case (44): {
                            System.out.print("Enter student Id: ");
                            int id = inp.nextInt();
                            for (int e = 0; e < slist.size(); e++) {
                                if (slist.get(e).getStudentId() == id) {
                                    f = true;
                                    System.out.println(slist.get(e).to_String());
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
                                if (Objects.equals(clist.get(e).getCourseID(), id)) {
                                    f = true;
                                    System.out.println(clist.get(e).to_string());
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
                                if (flist.get(e).getFacultyId() == id) {
                                    f = true;
                                    System.out.println(flist.get(e).to_string());
                                    break;
                                }
                            }
                            if (!f) {
                                System.out.println("Unsuccessful attempt.");
                            }
                            f = false;
                            break;
                        }
                        case (47): {
                            System.out.print("Enter Course Id to see student list & faculty information: ");
                            inp.nextLine();
                            String id = inp.nextLine();
                            for (int e = 0; e < clist.size(); e++) {
                                if (Objects.equals(clist.get(e).getCourseID(), id)) {
                                    f = true;
                                    clist.get(e).printStudentList();
                                    break;
                                }
                            }
                            if (!f) {
                                System.out.println("Unsuccessful attempt.");
                            }
                            f = false;
                            break;
                        }
                        case (48): {
                            System.out.print("Enter student Id: ");
                            int id = inp.nextInt();
                            for (int e = 0; e < slist.size(); e++) {
                                if (slist.get(e).getStudentId() == id) {
                                    f = true;
                                    slist.get(e).cour();
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
                    break;
                }
                case (5): {
                    System.out.println("51. Search a student.");
                    System.out.println("52. Search a course.");
                    System.out.println("53. Search a Faculty.");
                    System.out.println("54. Search whether a student takes a course.");
                    System.out.println("55. Search whether a faculty teaches a course.");
                    System.out.println("56. Search courses taken by a student.");
                    System.out.println("57. Search courses taught by a faculty.");
                    System.out.print("Enter Choice: ");
                    int co = inp.nextInt();
                    switch (co) {
                        case (51): {
                            System.out.print("Enter student Id: ");
                            int id = inp.nextInt();
                            for (int e = 0; e < slist.size(); e++) {
                                if (slist.get(e).getStudentId() == id) {
                                    f = true;
                                    System.out.println(slist.get(e).to_String());
                                    break;
                                }
                            }
                            if (!f) {
                                System.out.println("Unsuccessful attempt. Student not found.");
                            }
                            f = false;
                            break;
                        }
                        case (52): {
                            System.out.print("Enter Course Id: ");
                            inp.nextLine();
                            String id = inp.nextLine();
                            for (int e = 0; e < clist.size(); e++) {
                                if (Objects.equals(clist.get(e).getCourseID(), id)) {
                                    f = true;
                                    System.out.println(clist.get(e).to_string());
                                    break;
                                }
                            }
                            if (!f) {
                                System.out.println("Unsuccessful attempt. Course not found.");
                            }
                            f = false;
                            break;
                        }
                        case (53): {
                            System.out.print("Enter faculty Id: ");
                            int id = inp.nextInt();
                            for (int e = 0; e < flist.size(); e++) {
                                if (flist.get(e).getFacultyId() == id) {
                                    f = true;
                                    System.out.println(flist.get(e).to_string());
                                    break;
                                }
                            }
                            if (!f) {
                                System.out.println("Unsuccessful attempt. Faculty not found.");
                            }
                            f = false;
                            break;
                        }
                        case (54): {
                            System.out.println("Enter Student ID: ");
                            int id = inp.nextInt();
                            for (int ii = 0; ii < slist.size(); ii++) {
                                if (slist.get(ii).getStudentId() == id) {
                                    System.out.print("Enter Course ID: ");
                                    inp.nextLine();
                                    String cid = inp.nextLine();
                                    for (int io = 0; i < slist.get(ii).courses.size(); io++) {
                                        if (Objects.equals(slist.get(ii).courses.get(io).getCourseID(), cid)) {
                                            f = true;
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                            if (f) {
                                System.out.println("YES");
                            } else {
                                System.out.println("Unsuccessful Attempt.");
                            }
                            f = false;
                            break;
                        }
                        case (55): {
                            System.out.print("Enter faculty id: ");
                            int id = inp.nextInt();
                            for (int k = 0; k < flist.size(); k++) {
                                if (flist.get(k).getFacultyId() == id) {
                                    System.out.print("Enter course id: ");
                                    inp.nextLine();
                                    String ifd = inp.nextLine();
                                    for (int kk = 0; kk < flist.get(k).crs.size(); kk++) {
                                        if (Objects.equals(flist.get(k).crs.get(kk).getCourseID(), ifd)) {
                                            f = true;
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                            if (f) {
                                System.out.println("YES");
                            } else {
                                System.out.println("Unsuccessful Attempt.");
                            }
                            f = false;
                            break;
                        }
                        case (56): {
                            System.out.print("Enter student Id: ");
                            int id = inp.nextInt();
                            for (int e = 0; e < slist.size(); e++) {
                                if (slist.get(e).getStudentId() == id) {
                                    f = true;
                                    slist.get(e).cour();
                                    break;
                                }
                            }
                            if (!f) {
                                System.out.println("Unsuccessful attempt. Student not found");
                            }
                            f = false;
                            break;
                        }
                        case (57): {
                            System.out.println("Enter faculty id: ");
                            int id = inp.nextInt();
                            for (int i4 = 0; i4 < clist.size(); i4++) {
                                if (flist.get(i4).getFacultyId() == id) {
                                    f = true;
                                    flist.get(i4).courseList();
                                }
                            }
                            if (!f) {
                                System.out.println("Unsuccessful attempt. Faculty not found");
                            }
                            f = false;
                            break;
                        }
                    }
                    break;
                }
                case (6): {
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

class Student {

    private int studentId;
    private String studentName;
    private double studentCGPA;
    ArrayList<Course> courses = new ArrayList<Course>();

    public Student() {
    }

    public Student(int studentId, String studentName, double studentCGPA, Course c) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCGPA = studentCGPA;
        courses.add(c);
    }

    public Student(int studentId, String studentName, double studentCGPA) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCGPA = studentCGPA;
    }

    public void drop(String str) {
        for (int i = 0; i < courses.size(); i++) {
            if (Objects.equals(courses.get(i).getCourseID(), str)) {
                courses.remove(i);
                break;
            }
        }
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudentCGPA() {
        return studentCGPA;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentCGPA(double studentCGPA) {
        this.studentCGPA = studentCGPA;
    }

    public String to_String() {
        return "Student id: " + studentId + "\nStudent name: " + studentName + "\nCGPA: " + studentCGPA + "\n";
    }

    public void cour() {
        System.out.println(to_String());
        for (int i = 0; i < courses.size(); i++) {
            courses.get(i).to_string();
        }
    }
}

class Course {

    private String courseID;
    private String courseTitle;
    private double credit;
    ArrayList<Student> studentList = new ArrayList<Student>();
    private int numberOfStudent = studentList.size();
    private Faculty faculty = new Faculty();

    public Course() {
    }

    public Course(String courseID, String courseTitle, double credit) {
        this.courseID = courseID;
        this.courseTitle = courseTitle;
        this.credit = credit;
    }

    public String to_string() {
        return "Course id: " + courseID + "\nCourse name: " + courseTitle + "\nCredit: " + credit + "\n" + "\nNumber of student: "
                + numberOfStudent;
    }

    public void addStudent(Student s) {
        studentList.add(s);
    }

    public void dropStudent(int studentId) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentId() == studentId) {
                studentList.remove(i);
                break;
            }
        }
    }

    public void addFaculty(Faculty f) {
        this.faculty = f;
    }

    public void dropFaculty() {
        faculty = null;
    }

    public int CgetFacultyId() {
        return faculty.getFacultyId();
    }

    public void printStudentList() {
        System.out.println(to_string());
        System.out.println(faculty.to_string());
        for (int i = 0; i < studentList.size(); i++) {
            studentList.get(i).to_String();
        }
    }

    public String getCourseID() {
        return courseID;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public double getCredit() {
        return credit;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

}

class Faculty {

    private int facultyId;
    private String facultyName;
    private String facultyPosition;
    ArrayList<Course> crs = new ArrayList<Course>();

    public Faculty() {
    }

    public Faculty(int facultyId, String facultyName, String facultyPosition) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyPosition = facultyPosition;
    }

    public String to_string() {
        return "Faculty id: " + facultyId + "\nfaculty name: " + facultyName + "\nFaculty Position: " + facultyPosition + "\n";
    }

    public void courseList() {
        for (int i = 0; i < crs.size(); i++) {
            System.out.println(crs.get(i).to_string());
        }
    }

    public void dropc(String str) {
        for (int i = 0; i < crs.size(); i++) {
            if (Objects.equals(crs.get(i).getCourseID(), str)) {
                crs.remove(i);
            }
        }

    }

    public int getFacultyId() {
        return facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getFacultyPosition() {
        return facultyPosition;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public void setFacultyPosition(String facultyPosition) {
        this.facultyPosition = facultyPosition;
    }
}
