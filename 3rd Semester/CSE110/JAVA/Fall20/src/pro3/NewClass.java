
package pro3;

import java.io.File;
import java.util.Scanner;

class Student{
    private int id;
    private int mid1;
    private int mid2;
    private int finalexam;
    
    Student(){
        
    }
    
    Student(int id,int mid1, int mid2, int finalexam){
        this.id = id;
        this.mid1 = mid1;
        this.mid2 = mid2;
        this.finalexam = finalexam;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public int getMid1() {
        return mid1;
    }

    public void setMid1(int mid1) {
        this.mid1 = mid1;
    }

    public int getMid2() {
        return mid2;
    }

    public void setMid2(int mid2) {
        this.mid2 = mid2;
    }

    public int getFinalexam() {
        return finalexam;
    }

    public void setFinalexam(int finalexam) {
        this.finalexam = finalexam;
    }
    
    public String toString(){
        return id+","+mid1+","+mid2+","+finalexam+",";
    }
    
}

public class NewClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
    //    try{
            File file = new File("student.txt");
            if(file.exists()){
                
       //     }
        }
    }
}
