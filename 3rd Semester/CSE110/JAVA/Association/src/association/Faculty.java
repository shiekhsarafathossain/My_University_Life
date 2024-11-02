package association;

import java.util.ArrayList;

public class Faculty {

    private int facultyId;
    private String facultyName, facultyPosition;
    private ArrayList<Course> clist = new ArrayList<Course>();
    private int numberOfCourses = 0;

    public Faculty() {

    }

    public Faculty(int Fid, String Fname, String Fp) {
        facultyId = Fid;
        facultyName = Fname;
        facultyPosition = Fp;

    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyPosition() {
        return facultyPosition;
    }

    public void setFacultyPosition(String facultyPosition) {
        this.facultyPosition = facultyPosition;
    }

    public ArrayList<Course> getClist() {
        return clist;
    }

    public void setClist(ArrayList<Course> clist) {
        this.clist = clist;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    String display() {
        String show = facultyId + " " + facultyName + " " + facultyPosition;
        return show;
    }

    public void addCourse(Course c) {
        clist.add(c);
        numberOfCourses++;
    }

    public void dropCourse(String coursedrop) {
        for (int i = 0; i < clist.size(); i++) {
            if (clist.get(i).getCourseId().equals(coursedrop)) {
                clist.remove(i);
                numberOfCourses--;
                break;
            }
        }
    }
}
