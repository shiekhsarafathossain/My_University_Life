
package newpackage;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class Faculty {
    private int facultyId;
	private String facultyName;
	private String facultyPosition;
	ArrayList<Course>crs=new ArrayList<Course>();
	public Faculty(){}
	public Faculty(int facultyId,String facultyName,String facultyPosition)
	{
		this.facultyId=facultyId;
		this.facultyName=facultyName;
		this.facultyPosition=facultyPosition;
	}
	public String to_string()
	{
		return "Faculty id: "+facultyId+"\nfaculty name: "+facultyName+"\nFaculty Position: "+facultyPosition+"\n";
	}
	public void courseList()
	{
		for(int i=0;i<crs.size();i++)
		{
			System.out.println(crs.get(i).to_string());
		}
	}
	public void dropc(String  str)
	{
		for(int i=0;i<crs.size();i++)
		{
			if(Objects.equals(crs.get(i).getCourseID(), str))
				crs.remove(i);
		}

	}
	public int getFacultyId(){return facultyId;}
	public String getFacultyName(){return facultyName;}
	public String getFacultyPosition(){return facultyPosition;}
	public void setFacultyId(int facultyId){this.facultyId=facultyId;}
	public void setFacultyName(String facultyName){this.facultyName=facultyName;}
	public void setFacultyPosition(String facultyPosition){this.facultyPosition=facultyPosition;}
}
