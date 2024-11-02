package problem3;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int[][] std = new int[30][4];
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter Student ID: ");
                std[i][j] = sc.nextInt();
                System.out.print("Enter Mid 1 Result: ");
                std[i][j] = sc.nextInt();
                System.out.println("Enter MId 2 Result: ");
                std[i][j] = sc.nextInt();
                System.out.println("Enter Final Result: ");
                std[i][j] = sc.nextInt();
            }
        }
        
    }
    
}
