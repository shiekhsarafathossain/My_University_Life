package arraylearning;

import java.util.Scanner;

public class Arraylearning2D {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        int[][] arr2D;
        
        arr2D = new int [3][3];
        //inpuiting
        System.out.print("Enter 3X3 Array element: ");
        for(int row=0;row<3;row++){
            {
                for(int col=0;col<3;col++){
                arr2D[row][col] = i.nextInt();
                }
                System.out.print("\n");
            }
            
            
        
        }
        
        //printing
        System.out.println("Array element: ");
        for(int row=0;row<3;row++){
            {
                for(int col=0;col<3;col++){
                    System.out.print(arr2D[row][col]);
                }
                System.out.print("\n");
            }
            
            
        
        }
        
        
        
        
        System.out.println(arr2D.length);
    }
    
}
