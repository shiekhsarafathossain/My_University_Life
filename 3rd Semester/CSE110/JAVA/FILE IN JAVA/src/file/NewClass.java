package file;

import java.io.*;
import java.util.Scanner;
        
public class NewClass {
    public static void main(String[] args) throws Exception {
        
        File f = new File("score.txt");
        
        Scanner r = new Scanner(f);
        
        while(r.hasNext()){
            String x = r.next();
            int i = r.nextInt();
            System.out.println(x+" "+i);
        }
            r.close();
        
    }
}
