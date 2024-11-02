package arrayhw;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        
        
        int[] arr;
        int i,n,max,small;
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter the number of element: ");
        n = input.nextInt();
            
        arr = new int[n];
        System.out.println("Enter the element: ");
        for(i=0 ; i<n ; i++){
            arr[i] = input.nextInt();
        }
            
        for (i=0; i<n ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        
        max = arr[0];
        small = 0;
        for(i=1 ; i<n ; i++){
            if(arr[i] > max){
                max = arr[i];
                small = i;
            }
        }
        System.out.println("Largest Element: "+max);
        System.out.println("Smallest index of the largest element: " +small);
    }
    
}
