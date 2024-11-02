/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem4;

import java.util.Arrays;



class account implements Comparable<account> {

    String accname;
    double withdraw;
    double deposite;

    account() {
    }

    account(String accname, double withdraw, double deposite) {
        this.accname = accname;
        this.withdraw = withdraw;
        this.deposite = deposite;
    }

//    @Override
    public int compareTo(account a) {
        return Double.compare(deposite, a.deposite);
    }
    public String toString(){
        String str = "Account Name: "+accname+" "+withdraw+" "+deposite;
        return str;
    }
    @Override
    public int compareTo(account tt){
            return this.accname.compareTo(tt.accname);
        }
 
}

public class Problem {

    public static void main(String[] args) {
        account[] acc = new account[5];
        acc[1] = new account("aaf", 510, 4.5);
        acc[4] = new account("byhn", 50, 5);
        acc[2] = new account("cye", 500, 0.5);
        acc[3] = new account("dukh", 1000, 49);
        acc[0] = new account("eact", 500, 59);
    
        
      //  System.out.println(acc[0].compareTo(acc[1]));
        Arrays.sort(acc);
        for(int i=0;i<5;i++){
        System.out.println(acc[i].toString());
        }
        
        System.out.println("\nSorted by Account Name:");
        for (account account : acc) {
            System.out.println(account);
        }
    }
}