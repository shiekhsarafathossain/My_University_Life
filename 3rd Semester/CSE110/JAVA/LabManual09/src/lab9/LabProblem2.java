package lab9;

import java.io.*;

public class LabProblem2 {

    public static void main(String[] args) throws IOException, Exception {

        try (FileOutputStream file = new FileOutputStream("Lab08_02.dat")) {
            DataOutputStream output = new DataOutputStream(file);
            
            for (int i = 0; i < 100; i++) {
                output.writeInt((int) (Math.random() * 100));
                output.writeUTF(" ");
                
            }
            //output.close();
        }catch(Exception e){
            System.out.println(e);
        }

        
        try (FileInputStream f = new FileInputStream("Lab08_02.dat")) {
            DataInputStream d = new DataInputStream(f);
            while(d.available() > 0){
                int a = d.readInt();
                String r = d.readUTF();
                System.out.print(a+r);
            }
            d.close();
        }catch(Exception e){
                    System.out.println(e);
                    }
         
    }
}
