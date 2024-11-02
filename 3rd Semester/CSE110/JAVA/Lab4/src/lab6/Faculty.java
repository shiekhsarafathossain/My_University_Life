package lab6;

import java.util.ArrayList;

public class Faculty {

    private int facultyId;
    private String facultyName;
    private String facultyPosition;

    private ArrayList<Course> clist = new <Course> ArrayList();
    private int numberofcourses = 0;

    Faculty() {

    }

    Faculty(int facultyId, String facultyName, String facultyPosition) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyPosition = facultyPosition;
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

    public ArrayList<Course> getClist() {
        return clist;
    }

    public int getNumberofcourses() {
        return numberofcourses;
    }

    public void setClist(ArrayList<Course> clist) {
        this.clist = clist;
    }

    public String toString() {
        String str = "Faculty ID: " + facultyId + "\nFaculty Name: " + facultyName + "\nCFaculty Position: " + facultyPosition;
        return str;
    }

    public void addCourse(Course c) {
        clist.add(c);
        numberofcourses++;
    }

    public void dropCourse(String courseId) {
        for (int i = 0; i < clist.size(); i++) {
            if (clist.get(i).getCourseId() == courseId) {
                clist.remove(i);
                numberofcourses--;
            }
        }
    }

}
