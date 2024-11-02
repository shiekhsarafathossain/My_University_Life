package lab09_problem03;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Lab09_Problem03 {

    public static void main(String[] args) {
        
        String dir = "Enter Your Directory";
        
        try {
            File f = new File(dir + "input.txt");
            PrintWriter w = new PrintWriter(f);
            w.println("A");
            w.println("B");
            w.println("C");
            w.println("D");
            w.println("E");
            w.close();
            
            FileInputStream textInput = new FileInputStream(f);
            BufferedReader textReader = new BufferedReader(new InputStreamReader(textInput));

            FileOutputStream binaryOutput = new FileOutputStream(dir +"\\output.dat");
            DataOutputStream binaryWriter = new DataOutputStream(binaryOutput);

            String line;
            while ((line = textReader.readLine()) != null) {
                binaryWriter.writeUTF(line);
            }
            textReader.close();
            textInput.close();
            binaryWriter.close();
            binaryOutput.close();

            // Print a success message
            System.out.println("Text to binary conversion successful.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }//main() ends
    
}//class ends
