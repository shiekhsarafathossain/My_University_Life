package lab3problem;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of the Students: ");
        int numofstudent = input.nextInt();
        
        
        int[] student;
        student = new int[numofstudent];
        
        
        System.out.printf("Enter %d Scores: ",numofstudent);
        for(int i=0;i<numofstudent;i++){
        student[i] = input.nextInt();
        }
        
        int best = student[0];
        for(int i=1;i< numofstudent;i++){
            if(best<student[i]){
                best = student[i];
            }
        }
        
        for(int i=0;i<numofstudent;i++){
            if(best-10 <= student[i]){
                System.out.printf("Student %d score is %d and grade is A\n",(i+1),student[i]);  
            }
            else if(best-20 <= student[i]){
                System.out.printf("Student %d score is %d and grade is B\n",(i+1),student[i]);  
            }
            else if(best-30 <= student[i]){
                System.out.printf("Student %d score is %d and grade is C\n",(i+1),student[i]);  
            }
            else if(best-40 <= student[i]){
                System.out.printf("Student %d score is %d and grade is D\n",(i+1),student[i]);  
            }
            else{
                System.out.printf("Student %d score is %d and grade is D\n",(i+1),student[i]);
            }
                    
            
        }
    }
    
}
