/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatgpts;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author saraf
 */
public class NewClass {
    public static void main(String[] args) {
        String fileName = "Lab08_01.txt";
        
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(fileName, true)); // 'true' for append mode
            
            for (int i = 0; i < 100; i++) {
                int randomInt = generateRandomInteger();
                writer.print(randomInt);
                
                // Add a comma after each integer except the last one
                if (i < 99) {
                    writer.print(",");
                } else {
                    writer.println(); // Move to the next line after the last integer
                }
            }
            
            writer.close();
            System.out.println("Data has been written to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Function to generate a random integer between 1 and 1000
    private static int generateRandomInteger() {
        Random rand = new Random();
        return rand.nextInt(1000) + 1;
    }
    
}
