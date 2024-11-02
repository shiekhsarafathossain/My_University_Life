package codeforce;

import java.util.Scanner;

public class ATeam {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int n, count = 0, sup = 0;

        n = input.nextInt();
        int arr[][] = new int[3][n];
        for (int col = 0; col < n; col++) {
            
            for (int row = 0; row < 3; row++) {
                arr[row][col] = input.nextInt();
                
                count = count + arr[row][col];
            }
            if (count > 1) {
                sup++;
                
            }
            count=0;
            
        }

        System.out.println(sup);

    }
}
