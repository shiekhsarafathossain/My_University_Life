package lab09_problem01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Lab09_Problem01 {

    public static void main(String[] args) {
        
        String directory = "Enter Your Directory";
        File f = new File(directory + "\\Lab09_01.txt");
        
        try {
            // Create the file if it does not exist
            if (f.createNewFile()) {
                System.out.println("File created successfully.");
                writeOnFile(f);
            } else {
                System.out.println("File already exists.");
                writeOnFile(f);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }//main() ends
    
    static void writeOnFile(File f) throws FileNotFoundException {
        PrintWriter w = new PrintWriter(f);
        for(int i = 0; i < 100; i++) {
        w.println((i+1) + ") " + genRandomNumbers());
        }
        w.close();
    }//writeOnFile() ends
    
    static int genRandomNumbers() {
        return (int) (Math.random() * (999 - 100 + 1)) + 100;
    }//genRandomNumbers() ends
    
}//class ends
