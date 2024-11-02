package lab3;

import java.util.Scanner;

public class LabProblem1 {
    public static void main(String[] args) {
        int i,n,best;
        int[] array;
        System.out.println("Enter the number of students:");
        Scanner input = new Scanner(System.in);
        
        n=input.nextInt();
        
        System.out.printf("Enter Scores of %d students:",n);
        array=new int[n];
        for(i=0;i<n;i++){
            array[i]=input.nextInt();
        }
         best=0;
        for(i=0;i<n;i++){
            if(array[i]>best){
                best=array[i];
            }
        } 
        System.out.println("Best score :"+best);
        for(i=0;i<n;i++){
            if((best-10)<= array[i]){
                System.out.printf("Student(%d) grade:A\n",i);
            }
            else if((best-20) <= array[i]){
                 System.out.printf("Student(%d) grade:B\n",i);
            }
            else if((best-30) <= array[i]){
                 System.out.printf("Student(%d) grade:C\n",i);
            }
            else if((best-40)<= array[i]){
                 System.out.printf("Student(%d) grade:D\n",i);
            }
            else{
                 System.out.printf("Student(%d) grade:F",i);
            }
        }  
    }
}
