package mypackage;

import java.util.Scanner;
import java.util.ArrayList;
public class Course {

    private String cid;
    private String ctitle;
    private double credit;
    private int numberofStudents;
    
    private Student[] studentList = new Student[40];
    private Faculty faculty;
    public Course() {

    }

    public Course(String cid, String ctitle, double credit) {
        this.cid = cid;
        this.ctitle = ctitle;
        this.credit = credit;

    }

    public String getCid() {
        return cid;
    }
    
    public String getCtitle(){
        return ctitle;
    }
    
    public double getCredit(){
        return credit;
    }
    
    public int getnumberofStudents(){
        return numberofStudents;
    }
    
    public Faculty getFaculty(){
        return faculty;
    }
    
    public void setCid(String cid) {
        this.cid = cid;
    }
    
    public void setCtitle(String ctitle){
        this.ctitle = ctitle;
    }
    
    public void setCredit(double credit){
        this.credit = credit;
    }
    
    @Override
    public String toString(){
        return cid + ", " + ctitle + ", " + credit + ", " + numberofStudents;
    }
    
 /*   public void toString(Course obj){
        System.out.println(cid + ", " + ctitle + ", " + credit + ", " + numberofStudents);
    } */
     
    public void addStudent(Student s){
        if(numberofStudents <= 40){
        studentList[numberofStudents] =  s;
        numberofStudents++;
            System.out.println("Added! ");
        }
        else{
            System.out.println("No Vacancy! ");
        }
    }
    
    public void dropStudent(int id){
        for(int i = 0; i<studentList.length; i++){
            if(studentList[i] == null){
                continue;
            }
            else {
                if(id == studentList[i].getSid()){
                for(int j = i; j <studentList.length -1 ;j++){
                    studentList[j] = studentList[j+1];
                }
            }
        }
        studentList[39] = null;
        numberofStudents--;          
    }
    }
    
    public void addFaculty(Faculty f){
        faculty = f;
    }
    
    public void dropFaculty(){
        faculty = null;
    }
    
    public void printStudentList(){
        System.out.println("Entered! ");
     
        for(int i =0; i< studentList.length ; i++){
            if(studentList[i]== null){
                break;
            }
            else
            System.out.println(studentList[i].toString());
        }
     /*   int i=0;
        while(studentList[i]!= null){
            studentList[i].toString();
            System.out.println();
            i++;
        } */
    
    }

}
