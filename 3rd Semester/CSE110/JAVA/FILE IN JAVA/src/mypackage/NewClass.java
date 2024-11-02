package mypackage;

import java.io.*;
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) throws IOEception, Exception {
        
        File file = new File("sarafat.txt");
        
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(0);
        }
        
        PrintWriter output = new PrintWriter(file);
        
        output.print("vbvb ");
        output.print(90);
        output.print("vbvbvbbv ");
        output.print(85);
        
        output.close();
        
        Scanner read = new Scanner(file);
        
        while(read.hasNext()){
            String s1 = read.next();
            int i1 = read.nextInt();
            System.out.println(s1 + " "+ i1);
            read.close();
        }
        
    }
}
