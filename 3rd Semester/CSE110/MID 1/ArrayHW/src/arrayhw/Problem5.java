package arrayhw;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        
        int[] arr;
        int i,n,max;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        n = input.nextInt();
        
        arr = new int[n];
        System.out.println("Enter the element: ");
        for(i=0; i<n ; i++){
            arr[i] = input.nextInt();
        }
        
        for (i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        
        max = arr[0];
        for(i=1 ; i<n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.printf("Largest Element: %d\n",max);
        
    }
}
