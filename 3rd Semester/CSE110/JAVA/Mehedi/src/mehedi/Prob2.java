/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mehedi;
import java.io.*;
/**
 *
 * @author saraf
 */
public class Prob2 {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream input = new DataOutputStream(new FileOutputStream("Lab08_02.dat", true));)
        {
            for (int i = 0; i < 100; i++)
                input.writeInt((int)(Math.random() * 10000));
        }
    }
}
