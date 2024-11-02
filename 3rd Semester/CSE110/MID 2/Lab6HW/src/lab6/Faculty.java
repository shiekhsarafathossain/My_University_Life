package lab6;

import java.util.ArrayList;
import java.util.Objects;

public class Faculty {
    private int facid;
   private String facname;
   private String facposition; 
   
   ArrayList<Course>fcrs=new ArrayList<Course>();

  public  Faculty(){}
  public  Faculty(int fid,String fn,String fp){
        facid=fid;
        facname=fn;
        facposition=fp;
    }
    
     public void setfacid(int fid){
                 facid=fid;

     }
     public void setfacname(String fn){
                 facname=fn;

     }
     public void setfacposition(String fp){
                 facposition=fp;

     }
     public int getfacid(){
         return facid; 
     }
     public String getfacname(){
         return facname;
     }
     public String getfacposition(){
         return facposition;
     }  
void display(){
    System.out.println("Faculty- Name: "+facname+"  Id:"+facid+" Position: "+facposition);
}
public void courseList()
	{
		for(int i=0;i<fcrs.size();i++)
		{
		fcrs.remove(i).display();
		}
	}
	public void dropc(String  str)
	{
		for(int i=0;i<fcrs.size();i++)
		{
			if(Objects.equals(fcrs.get(i).getcode(), str))
				fcrs.remove(i);
		}

	}
}
