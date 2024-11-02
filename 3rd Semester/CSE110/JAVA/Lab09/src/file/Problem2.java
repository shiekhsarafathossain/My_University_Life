package file;

import java.io.*;

public class Problem2 {

    public static void main(String[] args) throws IOException {
        
        DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
         output.writeUTF("kon");
         output.writeDouble(90.5);
        output.writeUTF("Susan");
        output.writeDouble(185.5);
        output.writeUTF("Kim");
        output.writeDouble(105.25);

        output.close();
        
        DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
        while(input.available() >=0){
            String str = input.readUTF();
            
        System.out.println(str);
       // System.out.println(input.readUTF() + " " + input.readDouble());
     //   System.out.println(input.readUTF() + " " + input.readDouble());
        }
    }
    
}
