package finalpackage;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Course> courseList = new ArrayList<Course>();
        ArrayList<Student> studentList = new ArrayList<Student>();
        ArrayList<Faculty> facultyList = new ArrayList<Faculty>();
        boolean swit = false, loop = true;
        while (loop) {
            System.out.println("a. Add \nb. Delete\nc. Update\nd. Print\ne. Search\n0. Exit");
            System.out.print("Enter choice: ");
            char i = inp.next().charAt(0);
            switch (i) {
                case 'a': {
                    System.out.println("a. Add Student: ");
                    System.out.println("b. Add Course: ");
                    System.out.println("c. Add Faculty: ");
                    System.out.println("d. Add Student to course: ");
                    System.out.println("e. Add course to student: ");
                    System.out.println("f. Add Faculty to course; ");
                    System.out.print("Enter choice: ");
                    char main = inp.next().charAt(0);
                    switch (main) {
                        case 'a': {
                            System.out.print("Enter Student id: ");
                            int id = inp.nextInt();
                            inp.nextLine();
                            System.out.print("Enter Student name: ");
                            String name = inp.nextLine();
                            System.out.print("Enter CGPA: ");
                            double cg = inp.nextDouble();
                            studentList.add(new Student(id, name, cg));
                            break;
                        }
                        case 'b': {
                            inp.nextLine();
                            System.out.print("Enter Course Id: ");
                            String cid = inp.nextLine();
                            System.out.print("Enter Course name: ");
                            String cname = inp.nextLine();
                            System.out.print("Enter credit: ");
                            double cr = inp.nextDouble();
                            courseList.add(new Course(cid, cname, cr));
                            break;
                        }
                        case 'c': {
                            System.out.print("Enter Faculty Id: ");
                            int sid = inp.nextInt();
                            inp.nextLine();
                            System.out.print("Enter Faculty name: ");
                            String sname = inp.nextLine();
                            System.out.print("Enter position: ");
                            String pos = inp.nextLine();
                            facultyList.add(new Faculty(sid, sname, pos));
                            break;
                        }
                        case 'd': {
                            System.out.print("Enter Student ID to add course: ");
                            int id = inp.nextInt();
                            for (int ii = 0; ii < studentList.size(); ii++) {
                                if (studentList.get(ii).getStudentId() == id) {
                                    System.out.print("Enter Course ID: ");
                                    inp.nextLine();
                                    String cid = inp.nextLine();
                                    for (int jj = 0; jj < courseList.size(); jj++) {
                                        if (Objects.equals(courseList.get(jj).getCourseID(), cid)) {
                                            swit = true;
                                            studentList.get(ii).courses.add(courseList.get(jj));
                                            courseList.get(jj).addStudent(studentList.get(ii));
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                            if (swit) {
                                System.out.println("Course added successfully");
                            } else {
                                System.out.println("Unsuccessful Attempt");
                            }
                            swit = false;
                            break;
                        }
                        case 'e': {
                            System.out.print("Enter course ID to add  Student: ");
                            String course = inp.nextLine();
                            for (int r = 0; r < courseList.size(); r++) {
                                if (Objects.equals(courseList.get(r).getCourseID(), course)) {
                                    System.out.print("Enter student id: ");
                                    int id = inp.nextInt();
                                    for (int y = 0; y < studentList.size(); y++) {
                                        if (id == studentList.get(i).getStudentId()) {
                                            swit = true;
                                            courseList.get(r).addStudent(studentList.get(y));
                                            studentList.get(y).courses.add(courseList.get(r));
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                            }
                            if (swit) {
                                System.out.println("Student added successfully");
                            } else {
                                System.out.println("Unsuccessful Attempt");
                            }
                            swit = false;
                            break;
                        }
                        case 'f': {
                            System.out.print("Enter course ID to add faculty: ");
                            inp.nextLine();
                            String course = inp.nextLine();
                            for (int r = 0; r < courseList.size(); r++) {
                                if (Objects.equals(courseList.get(r).getCourseID(), course)) {
                                    System.out.print("Enter faculty id: ");
                                    int id = inp.nextInt();
                                    for (int y = 0; y < courseList.size(); y++) {
                                        if (id == facultyList.get(y).getFacultyId()) {
                                            swit = true;
                                            courseList.get(r).addFaculty(facultyList.get(y));
                                            facultyList.get(y).crs.add(courseList.get(r));
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
                case 'b': {
                    System.out.println("a. Delete Student: ");
                    System.out.println("b. Delete Course: ");
                    System.out.println("c. Delete Faculty: ");
                    System.out.print("Enter Choice: ");
                    char p = inp.next().charAt(0);
                    switch (p) {
                        case 'a': {
                            System.out.print("Enter Student ID: ");
                            int deleteid = inp.nextInt();

                            for (int j = 0; j < studentList.size(); j++) {
                                if (studentList.get(j).getStudentId() == deleteid) {
                                    studentList.remove(j);
                                    swit = true;
                                    break;
                                }
                            }
                            for (int g = 0; g < courseList.size(); g++) {
                                courseList.get(g).dropStudent(deleteid);
                            }

                            if (swit) {
                                System.out.println("Student removed successfully.");
                            } else {
                                System.out.println("Unsuccessful attempt. Student not found.");
                            }
                            swit = false;
                            break;
                        }
                        case 'b': {
                            System.out.print("Enter course ID: ");
                            inp.nextLine();
                            String deletcid = inp.nextLine();
                            for (int j = 0; j < studentList.size(); j++) {
                                if (Objects.equals(courseList.get(j).getCourseID(), deletcid)) {
                                    courseList.remove(j);
                                    swit = true;
                                    break;
                                }
                            }
                            for (int u = 0; u < studentList.size(); u++) {
                                studentList.get(u).dropCourse(deletcid);
                            }
                            for (int u = 0; u < facultyList.size(); u++) {
                                facultyList.get(u).dropCourse(deletcid);
                            }

                            if (swit) {
                                System.out.println("Course removed successfully.");
                            } else {
                                System.out.println("Unsuccessful attempt. Course not found.");
                            }
                            swit = false;
                            break;
                        }
                        case 'c': {
                            System.out.print("Enter Faculty ID: ");
                            int dfid = inp.nextInt();
                            for (int j = 0; j < studentList.size(); j++) {
                                if (facultyList.get(j).getFacultyId() == dfid) {
                                    facultyList.remove(j);
                                    swit = true;
                                    break;
                                }
                            }
                            for (int j = 0; j < courseList.size(); j++) {
                                if (courseList.get(j).CgetFacultyId() == dfid) {
                                    courseList.get(i).dropFaculty();
                                }
                            }
                            if (swit) {
                                System.out.println("Course removed successfully.");
                            } else {
                                System.out.println("Unsuccessful attempt. Course not found.");
                            }
                            swit = false;
                            break;
                        }
                    }
                    break;
                }
                case 'c': {
                    System.out.println("a. Update Student: ");
                    System.out.println("b. Update Course: ");
                    System.out.println("c. Update Faculty: ");
                    System.out.print("Enter Choice: ");
                    char u = inp.next().charAt(0);
                    inp.nextLine();
                    switch (u) {
                        case 'a': {
                            System.out.print("Enter Student id: ");
                            int ssid = inp.nextInt();
                            for (int e = 0; e < studentList.size(); e++) {
                                if (studentList.get(e).getStudentId() == ssid) {
                                    swit = true;
                                    System.out.println("Update Name ");
                                    System.out.print("Enter New Name: ");
                                    inp.nextLine();
                                    studentList.get(e).setStudentName(inp.nextLine());
                                    break;
                                }
                            }
                            if (swit) {
                                System.out.println("Updated Successfully");
                            } else {
                                System.out.println("Unsuccessful attempt. Student not found.");
                            }
                            swit = false;
                            break;
                        }
                        case 'b': {
                            System.out.print("Enter course id: ");
                            String ccid = inp.nextLine();
                            for (int e = 0; e < courseList.size(); e++) {
                                if (Objects.equals(courseList.get(e).getCourseID(), ccid)) {
                                    swit = true;
                                    System.out.println("Update Title ");
                                    System.out.print("Enter New Title: ");
                                    String aaa = inp.nextLine();
                                    courseList.get(e).setCourseTitle(aaa);
                                    break;
                                }
                            }
                            if (swit) {
                                System.out.println("Updated Successfully");
                            } else {
                                System.out.println("Unsuccessful attempt. course not found.");
                            }
                            swit = false;
                            break;
                        }
                        case 'c': {
                            System.out.println("Enter faculty id: ");
                            int ffid = inp.nextInt();
                            for (int e = 0; e < facultyList.size(); e++) {
                                if (facultyList.get(e).getFacultyId() == ffid) {
                                    swit = true;
                                    System.out.println("Update Name ");
                                    System.out.print("Enter New Name: ");
                                    inp.nextLine();
                                    facultyList.get(e).setFacultyName(inp.nextLine());
                                    break;
                                }
                            }
                            if (swit) {
                                System.out.println("Updated Successfully");
                            } else {
                                System.out.println("Unsuccessful attempt. course not found.");
                            }
                            swit = false;
                            break;
                        }
                    }
                    break;
                }
                case 'd': {
                    System.out.println("a. Print all Students: ");
                    System.out.println("b. print all course: ");
                    System.out.println("c. print all faculties: ");
                    System.out.println("d. Print information of a student: ");
                    System.out.println("e. Print information of a course: ");
                    System.out.println("f. Print information of a faculty: ");
                    System.out.println("g. Print faculty information and student list: ");
                    System.out.println("h. print courses taken by student: ");
                    System.out.print("Enter Choice: ");
                    char cho = inp.next().charAt(0);
                    switch (cho) {
                        case 'a': {
                            System.out.println("All Students: ");
                            for (int bb = 0; bb < studentList.size(); bb++) {
                                System.out.println(studentList.get(bb).toString());
                            }
                            break;
                        }
                        case 'b': {
                            System.out.println("All Courses: ");
                            for (int cc = 0; cc < courseList.size(); cc++) {
                                System.out.println(courseList.get(cc).toString());
                            }

                            break;
                        }
                        case 'c': {
                            System.out.println("All Faculties: ");
                            for (int ff = 0; ff < facultyList.size(); ff++) {
                                System.out.println(facultyList.get(ff).toString());
                            }

                            break;
                        }
                        case 'd': {
                            System.out.print("Enter student Id: ");
                            int id = inp.nextInt();
                            for (int e = 0; e < studentList.size(); e++) {
                                if (studentList.get(e).getStudentId() == id) {
                                    swit = true;
                                    System.out.println(studentList.get(e).toString());
                                    break;
                                }
                            }
                            if (!swit) {
                                System.out.println("Unsuccessful attempt.");
                            }
                            swit = false;
                            break;
                        }
                        case 'e': {
                            System.out.print("Enter Course Id: ");
                            inp.nextLine();
                            String id = inp.nextLine();
                            for (int e = 0; e < courseList.size(); e++) {
                                if (Objects.equals(courseList.get(e).getCourseID(), id)) {
                                    swit = true;
                                    System.out.println(courseList.get(e).toString());
                                    break;
                                }
                            }
                            if (!swit) {
                                System.out.println("Unsuccessful attempt.");
                            }
                            swit = false;
                            break;
                        }
                        case 'f': {
                            System.out.print("Enter faculty Id: ");
                            int id = inp.nextInt();
                            for (int e = 0; e < facultyList.size(); e++) {
                                if (facultyList.get(e).getFacultyId() == id) {
                                    swit = true;
                                    System.out.println(facultyList.get(e).toString());
                                    break;
                                }
                            }
                            if (!swit) {
                                System.out.println("Unsuccessful attempt.");
                            }
                            swit = false;
                            break;
                        }
                        case 'g': {
                            System.out.print("Enter Course Id to see student list & faculty information: ");
                            inp.nextLine();
                            String id = inp.nextLine();
                            for (int e = 0; e < courseList.size(); e++) {
                                if (Objects.equals(courseList.get(e).getCourseID(), id)) {
                                    swit = true;
                                    courseList.get(e).printStudentList();
                                    break;
                                }
                            }
                            if (!swit) {
                                System.out.println("Unsuccessful attempt.");
                            }
                            swit = false;
                            break;
                        }
                        case 'h': {
                            System.out.print("Enter student Id: ");
                            int id = inp.nextInt();
                            for (int e = 0; e < studentList.size(); e++) {
                                if (studentList.get(e).getStudentId() == id) {
                                    swit = true;
                                    studentList.get(e).Course();
                                    break;
                                }
                            }
                            if (!swit) {
                                System.out.println("Unsuccessful attempt.");
                            }
                            swit = false;
                            break;
                        }
                    }
                    break;
                }
                case 'e': {
                    System.out.println("a. Search a Student.");
                    System.out.println("b. Search a Course.");
                    System.out.println("c. Search a Faculty.");
                    System.out.println("d. Search whether a student takes a course.");
                    System.out.println("e. Search whether a faculty teaches a course.");
                    System.out.println("f. Search courses taken by a student.");
                    System.out.println("g. Search courses taught by a faculty.");
                    System.out.print("Enter Choice: ");
                    char co = inp.next().charAt(0);
                    switch (co) {
                        case 'a': {
                            System.out.print("Enter student Id: ");
                            int id = inp.nextInt();
                            for (int e = 0; e < studentList.size(); e++) {
                                if (studentList.get(e).getStudentId() == id) {
                                    swit = true;
                                    System.out.println(studentList.get(e).toString());
                                    break;
                                }
                            }
                            if (!swit) {
                                System.out.println("Unsuccessful attempt. Student not found.");
                            }
                            swit = false;
                            break;
                        }
                        case 'b': {
                            System.out.print("Enter Course Id: ");
                            inp.nextLine();
                            String id = inp.nextLine();
                            for (int e = 0; e < courseList.size(); e++) {
                                if (Objects.equals(courseList.get(e).getCourseID(), id)) {
                                    swit = true;
                                    System.out.println(courseList.get(e).toString());
                                    break;
                                }
                            }
                            if (!swit) {
                                System.out.println("Unsuccessful attempt. Course not found.");
                            }
                            swit = false;
                            break;
                        }
                        case 'c': {
                            System.out.print("Enter faculty Id: ");
                            int id = inp.nextInt();
                            for (int e = 0; e < facultyList.size(); e++) {
                                if (facultyList.get(e).getFacultyId() == id) {
                                    swit = true;
                                    System.out.println(facultyList.get(e).toString());
                                    break;
                                }
                            }
                            if (!swit) {
                                System.out.println("Unsuccessful attempt. Faculty not found.");
                            }
                            swit = false;
                            break;
                        }
                        case 'd': {
                            System.out.println("Enter Student ID: ");
                            int id = inp.nextInt();
                            for (int ii = 0; ii < studentList.size(); ii++) {
                                if (studentList.get(ii).getStudentId() == id) {
                                    System.out.print("Enter Course ID: ");
                                    inp.nextLine();
                                    String cid = inp.nextLine();
                                    for (int io = 0; i < studentList.get(ii).courses.size(); io++) {
                                        if (Objects.equals(studentList.get(ii).courses.get(io).getCourseID(), cid)) {
                                            swit = true;
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                            if (swit) {
                                System.out.println("YES");
                            } else {
                                System.out.println("Unsuccessful Attempt.");
                            }
                            swit = false;
                            break;
                        }
                        case 'e': {
                            System.out.print("Enter faculty id: ");
                            int id = inp.nextInt();
                            for (int k = 0; k < facultyList.size(); k++) {
                                if (facultyList.get(k).getFacultyId() == id) {
                                    System.out.print("Enter course id: ");
                                    inp.nextLine();
                                    String ifd = inp.nextLine();
                                    for (int kk = 0; kk < facultyList.get(k).crs.size(); kk++) {
                                        if (Objects.equals(facultyList.get(k).crs.get(kk).getCourseID(), ifd)) {
                                            swit = true;
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                            if (swit) {
                                System.out.println("YES");
                            } else {
                                System.out.println("Unsuccessful Attempt.");
                            }
                            swit = false;
                            break;
                        }
                        case 'f': {
                            System.out.print("Enter student Id: ");
                            int id = inp.nextInt();
                            for (int e = 0; e < studentList.size(); e++) {
                                if (studentList.get(e).getStudentId() == id) {
                                    swit = true;
                                    studentList.get(e).Course();
                                    break;
                                }
                            }
                            if (!swit) {
                                System.out.println("Unsuccessful attempt. Student not found");
                            }
                            swit = false;
                            break;
                        }
                        case 'g': {
                            System.out.println("Enter faculty id: ");
                            int id = inp.nextInt();
                            for (int i4 = 0; i4 < courseList.size(); i4++) {
                                if (facultyList.get(i4).getFacultyId() == id) {
                                    swit = true;
                                    facultyList.get(i4).courseList();
                                }
                            }
                            if (!swit) {
                                System.out.println("Unsuccessful attempt. Faculty not found");
                            }
                            swit = false;
                            break;
                        }
                    }
                    break;
                }
                case '0': {
                    loop = false;
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
