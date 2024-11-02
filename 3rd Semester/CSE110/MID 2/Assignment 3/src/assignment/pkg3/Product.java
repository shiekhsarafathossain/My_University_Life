package assignment.pkg3;

import java.util.Scanner;
public class Product {
    
    public static void main(String args []){
    int [] array = new int[5];
    int i, temp;
    System.out.print("Enter the values: ");
    Scanner input=new Scanner(System.in);
    for(i=0;i<array.length;i++){
        array[i]=input.nextInt();
    }
    //all good
    
    
    
//problem
    temp=array[4];
 
    for(i=0;i<4;i++){
        array[i+1]=array[i+1];
            for(i=1;i<5 ;i++){
        System.out.printf("%d = %d\n",i,array[i]);
    }
    }//problem
    array[0]=temp;
        System.out.printf("%d = %d\n",i, array[0]);
    
    
    //priniting 
    ///all goood

 }
    
}
