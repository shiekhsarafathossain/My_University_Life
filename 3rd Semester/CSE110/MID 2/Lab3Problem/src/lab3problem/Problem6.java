package lab3problem;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        int[] score;
        String[] name;
        int i, j, number, temp;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        number = input.nextInt();

        score = new int[number];
        name = new String[10];
        
        for (i = 0; i < number; i++) {
            System.out.println("Enter Name and Score of student " + (i + 1)+ "): ");
            input.nextLine();
            name[i] = input.nextLine();
            score[i] = input.nextInt();
        }
        
        for (i = 0; i < number; i++) {

            for (j = i + 1; j < number; j++) {
                if (score[i] < score[j]) {
                    temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                    
                    String temp2 = name[i];
                    name[i] = name[j];
                    name[j] = temp2;
                    
                }
                
            }
            System.out.print("Name: "+name[i]+"\t\t Marks: "+score[i]);
            System.out.print("\n");
            
        }
        System.out.print("\n ");
    }
    
}
