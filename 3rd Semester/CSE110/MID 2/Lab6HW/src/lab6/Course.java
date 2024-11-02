package lab6;

import java.util.ArrayList;

class Course {
    private String code;
       private String title;
       private double credit; 
       	ArrayList<Student> studentList=new ArrayList<Student>();
	private int numberOfStudent=studentList.size();
	private Faculty faculty=new Faculty();
  public Course(){}
  public Course(String c,String t,double cr){
         code=c;
         title=t;
         credit=cr;
}
   public void setcode(String c){
        code=c;
   }
    public void settitle(String t){
       title=t;
   }
     public void  setcredit(double cr){
      credit=cr;
   }
     public String getcode(){
       return code;
   }     
     public String gettitle(){
       return title;
   }
     public double getcredit(){
       return credit;
   }       
   void display(){
       System.out.println("Course- Code:"+code+" Title:" +title + " Credit:" +credit);
   }
   public void addStudent(Student s)
	{
		studentList.add(s);
	}
	public void dropStudent(int id)
	{
		for(int i=0;i<studentList.size();i++)
		{
			if(studentList.get(i).getid()==id)
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
		return faculty.getfacid();
	}
	public void printStudentList()
	{
		display();
		faculty.display();
		for(int i=0;i<studentList.size();i++)
		{
			studentList.get(i).display();
		}
	}

}
