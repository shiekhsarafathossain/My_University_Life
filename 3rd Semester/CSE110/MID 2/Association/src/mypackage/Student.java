package mypackage;

public class Student {
    private int sid;
    private String sname;
    private double scgpa;
    
    public Student(){
        
    }
    
    public Student(int sid, String sname, double scgpa){
        this.sid = sid;
        this.sname = sname;
        this.scgpa = scgpa;
    }
    
    public int getSid(){
        return sid;
    }
    
    public String getSname(){
        return sname;
    }
    
    public double getCgpa(){
        return scgpa;
    }
    
    public void setSid(int sid){
        this.sid = sid;
    }
    
    public void setSname(String sname){
        this.sname = sname;
    }
    
    public void setCgpa(double scgpa){
        this.scgpa = scgpa;
    }
    
    
    @Override
    public String toString(){
        return sid + ", " + sname + ", " + scgpa;
    }
    
    
}
