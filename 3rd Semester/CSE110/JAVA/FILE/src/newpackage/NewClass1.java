/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author saraf
 */
public class NewClass1 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("javafile.txt");
        if (!f.exists()) {
            try (PrintWriter a = new PrintWriter(f)) {
                a.print(2022);
                a.print(" ");
                a.print("Rijia");

            }
        }
        try (Scanner r = new Scanner(f)) {
            while (r.hasNext()) {
               // String name = r.next();
                int id = r.nextInt();
                String s= r.next();
                System.out.println(id+" "+s );
            }
        }
    }
}
