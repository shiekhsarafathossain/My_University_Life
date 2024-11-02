package newpackage;

import java.io.*;
import java.util.*;
public class NewClass {
    public static void main(String[] args) throws IOException, Exception{
        
        
        FileInputStream e = new FileInputStream("radgdya.dat");
        
        ObjectInputStream b = new ObjectInputStream(e);
        
        while(b.available() > 0){
            String x = b.readUTF();
            System.out.println(x);
        }
        b.close();
        
        
        
        
        
        
        
    }
}
