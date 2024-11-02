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
public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int min = input.nextInt();
        
        int hour = min/60;
        int days = hour/24;
        int year = days/365;
        int day = days%365;
        
        System.out.println(year+" years "+day+" days");
    }
    
}
