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
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num =input.nextInt();
        
        for(int i=2; i<num; i++){
            if(num%i==0){
                System.out.println("Not Prime number");
                break;
            }
            else{
                System.out.println("Prime number");
                break;
            }
        }
    }
}
