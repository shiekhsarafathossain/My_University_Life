package chatgpt;


public class Faculty {
     private int facultyId;
    private String facultyName;
    private String facultyPosition;

    public Faculty() {
        // Default constructor
    }

    public Faculty(int facultyId, String facultyName, String facultyPosition) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyPosition = facultyPosition;
    }

    @Override
    public String toString() {
        return "Faculty ID: " + facultyId + "\nName: " + facultyName + "\nPosition: " + facultyPosition;
    }
}
