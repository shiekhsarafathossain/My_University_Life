/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg3;

import java.util.Scanner;

/**
 *
 * @author saraf
 */
public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        int i;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = inp.nextInt();
        
        for ( i = 1; i <= n; i++) {
            fact = fact*i;
        }
        System.out.printf("%d factorial = %d\n",n,fact);
        
    }
}
