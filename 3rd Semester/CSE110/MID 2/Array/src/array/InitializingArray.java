package array;

import java.util.Scanner;

public class InitializingArray {
    public static void main(String[] args) {
        
        int[] arr;
        int n;
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter the number of element: ");
        n = input.nextInt();
            
        arr = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0 ; i<n ; i++){
            arr[i] = input.nextInt();
        }
         
            for (int i=0; i<arr.length ; i++) 
            {
            System.out.print(arr[i] + " ");
            }
        
    }
    
}
