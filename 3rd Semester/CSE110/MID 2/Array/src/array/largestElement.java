package array;

import java.util.Scanner;

public class largestElement {
    public static void main(String[] args) {
        
        
        int[] arr;
        int i,n,max;
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter the number of element: ");
        n = input.nextInt();
            
        arr = new int[n];
        System.out.println("Enter the element: ");
        for(i=0 ; i<n ; i++){
            arr[i] = input.nextInt();
        }
            
        for (i=0; i<n ; i++) {
            System.out.println(arr[i]);
        }
        
        max = arr[0];
        for(i=1 ; i<n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest Element: "+max);
    }
    
}