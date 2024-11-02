package lab6;

import java.util.ArrayList;
import java.util.Objects;

class Student {
    private int id;
    private String name;
    private double cgpa;

    private Course carr=new Course();
    private ArrayList<Course>clist=new ArrayList<Course>();
    private int coursecount=0;
    
    public Student() {}
    
    public Student(int i, String n, double cg) {
        id = i;
        name = n;
        cgpa = cg;
    //  clist.add(c);

    }

    public void setid(int i) {
        id = i;
    }

    public void setname(String n) {
        name = n;
    }

    public void setcgpa(double cg) {
        cgpa = cg;

    }
    public     ArrayList<Course> getClist() {
        return clist;
    }

    public void setClist(ArrayList<Course> clist) {
        this.clist = clist;
    }

    public int getNumberOfCourses() {
        return coursecount;
    }

      public int getid (){
    return id;
}
      public String getname(){
    return name;
}      
      public double getcgpa(){
    return cgpa;
}
    void display() {
        System.out.println("Student- Name: " + name + " Id:" + id + " CGPA: " + cgpa);
    }
    public void drop(String str)
	{
		for(int i=0;i<clist.size();i++)
		{
			if(Objects.equals(clist.get(i).getcode(), str))
			{
				clist.remove(i);
				break;
			}
		}
	}
}
