package lab9;

import java.io.*;
import java.util.Scanner;

public class LabProblem3 {

    public static void main(String[] args) throws IOException, Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter File Name With Extension: ");
        String filename = input.nextLine();

        File f = new File(filename);

        if (f.exists()) {
            Scanner sc = new Scanner(f);

            FileOutputStream file = new FileOutputStream("textfile.dat");
            DataOutputStream d = new DataOutputStream(file);

            while (sc.hasNext()) {
                String str = sc.nextLine();
                d.writeUTF(str);
            }
            d.close();
            sc.close();
        } else {
            System.out.println("File Not Found! ");
        }
        /*
        FileInputStream file1 = new FileInputStream("textfile.dat");
        DataInputStream d1 = new DataInputStream(file1);
        
        while(d1.available() >0){
            String x = d1.readUTF();
            System.out.print(x);
        }
        d1.close();
         */

    }
}
