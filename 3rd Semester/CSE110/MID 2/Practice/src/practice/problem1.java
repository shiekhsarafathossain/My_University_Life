/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author saraf
 */
public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ente a number: ");
        
        int num = input.nextInt();
        
        if(num%2==0 && num%3==0){
            System.out.println("False");
        }
        else if(num%2==0 || num%3==0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
