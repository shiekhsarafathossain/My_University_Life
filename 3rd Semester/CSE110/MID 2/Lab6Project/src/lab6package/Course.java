
package lab6package;

import java.util.ArrayList;

public class Course {
    private String courseID;
	private String courseTitle;
	private double credit;
	ArrayList<Student> studentList=new ArrayList<Student>();
	private int numberOfStudent=studentList.size();
	private Faculty faculty=new Faculty();
	public Course(){}
	public Course(String courseID,String courseTitle, double credit)
	{
		this.courseID=courseID;
		this.courseTitle=courseTitle;
		this.credit=credit;
	}
	public String to_string()
	{
		return "Course id: "+courseID+"\nCourse name: "+courseTitle+"\nCredit: "+credit+"\n"+"\nNumber of student: "
				+numberOfStudent;
	}
	public void addStudent(Student s)
	{
		studentList.add(s);
	}
	public void dropStudent(int studentId)
	{
		for(int i=0;i<studentList.size();i++)
		{
			if(studentList.get(i).getStudentId()==studentId)
			{
				studentList.remove(i);
				break;
			}
		}
	}
	public void addFaculty(Faculty f)
	{
		this.faculty=f;
	}
	public void dropFaculty()
	{
		faculty= null;
	}
	public int CgetFacultyId()
	{
		return faculty.getFacultyId();
	}
	public void printStudentList()
	{
		System.out.println(to_string());
		System.out.println(faculty.to_string());
		for(int i=0;i<studentList.size();i++)
		{
			studentList.get(i).to_String();
		}
	}
	public String getCourseID(){return courseID;}
	public String getCourseTitle(){return courseTitle;}
	public double getCredit(){return credit;}
	public void setCourseID(String courseID){this.courseID=courseID;}
	public void setCourseTitle(String courseTitle){this.courseTitle=courseTitle;}
	public void setCredit(double credit){this.credit=credit;}
}
