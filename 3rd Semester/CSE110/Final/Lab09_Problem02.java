package lab09_problem02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Lab09_Problem02 {

    public static void main(String[] args) throws FileNotFoundException {
        String dir = "Enter Your Directory";
        
//Attempt 1=====================================================================
/*      try {
            FileOutputStream f = new FileOutputStream(dir + "\\Lab09_02.dat");
            
            int max = 999;
            int min = 100;
            int range = max - min + 1;
            
            for(int i = 0; i < 100; i++) {
                int randomNum = (int) (Math.random() * range) + min;
                System.out.println(randomNum);
                f.write(randomNum);
            }
            System.out.println("END=========================================");
            f.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            FileInputStream i = new FileInputStream(dir + "\\Lab09_02.dat");
            int value;
            while((value = i.read()) != -1) {
                System.out.println(value);
            }
            i.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
//Attempt 1 ends================================================================


        try {
            FileOutputStream fos = new FileOutputStream(dir + "\\Lab09_02.dat");
            DataOutputStream dos = new DataOutputStream(fos);

            for (int i = 1; i <= 100; i++) {
                int randInt = (int) (Math.random() * (999 - 101) + 100);
                dos.writeInt(randInt);
                System.out.println(randInt);
            }
            System.out.println("END===========================================");
            dos.close();
            fos.close();

            System.out.println("Successfully wrote to the file.");

            FileInputStream fis = new FileInputStream(dir + "\\Lab09_02.dat");
            DataInputStream dis = new DataInputStream(fis);

            System.out.println("\nContents of the file:");
            for (int i = 0; i < 100; i++) {
                int num = dis.readInt();
                System.out.println((i+1) + ") " + num);
            }

            dis.close();
            fis.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }//main() ends

}//class ends

