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
public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("0) Usd to bdt\n1) Bdt to usd : ");
        
        int n = input.nextInt();
        int money;
        
        if(n==0){
            System.out.print("Enter Amount USD: ");
            int usd = input.nextInt();
            money = usd * 108;
            System.out.printf("%d usd = %d taka\n",usd,money);
        }
        
        else if(n==1){
            System.out.print("Enter Amount BDT: ");
            int taka = input.nextInt();
            money = taka / 108;
            System.out.printf("%d usd = %d taka\n",taka,money);
        }
        else{
            System.out.println("Invalid input");
        }
        
    }
}
