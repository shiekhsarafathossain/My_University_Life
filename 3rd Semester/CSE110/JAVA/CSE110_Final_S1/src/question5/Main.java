package question5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException,Exception {
        
           Patient p1 = new Patient(102,"Umaira",17834,"Bangladesh",11,"Female",202);
           Doctor d1 = new Doctor(500,"Kamrul","Pharma","Eye",23324,"Labaid");
          
           FileOutputStream f = new FileOutputStream("new.dat");
  
           ObjectOutputStream w = new ObjectOutputStream(f);
           w.writeObject(p1);
           w.close();
                  
        
           FileInputStream b = new FileInputStream("new.dat");
           ObjectInputStream a = new ObjectInputStream(b);
          
           
           Patient fa = (Patient) a.readObject();
           System.out.println(fa.Name);
          
           
    }
}
