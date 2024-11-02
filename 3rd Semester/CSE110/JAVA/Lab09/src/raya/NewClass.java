package raya;

import java.io.*;

public class NewClass {
    public static void main(String[] args) throws IOException,Exception{
         
        //Binary File
        
        //InputStream  --> to show the output 
        //OutputStream --> to get input 
       
            FileInputStream f = new FileInputStream("raya.dat");
            
            DataInputStream d = new DataInputStream(f);
            
            String x = d.readUTF();
            int y = d.readInt();
            System.out.println(x+" "+y);
            d.close();
            f.close();
            
        
        
        
        
    }
}
