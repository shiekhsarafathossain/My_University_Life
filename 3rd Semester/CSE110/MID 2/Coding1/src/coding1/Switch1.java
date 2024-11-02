package coding1;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        int l = 5;
        int k = 5;
        
        int result = NewClass2.Add(l, k);
        System.out.println("Result = "+result);
        
        String myMessage = "Hello World!";
        printMessage(myMessage);
        
        double[] myList = new double[4];
        myList[0] = 1.9;
        myList[1] = 2.9;
        myList[5] = 6;
        
        System.out.println(myList[0]+" "+myList[1]+" "+myList[5]);
    }
    public static void printMessage(String a)
    {
        for(int i=1;i<=5;i++){
            System.out.println(a);
        }
        
    }
    
    
    
}
