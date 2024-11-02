package arrayhw;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        
        int[] arr;
        int i,n;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        n = input.nextInt();
        
        arr = new int[n];
        System.out.println("Enter the element: ");
        for(i=0; i<n ; i++){
            arr[i] = input.nextInt();
        }
    }
    
}
