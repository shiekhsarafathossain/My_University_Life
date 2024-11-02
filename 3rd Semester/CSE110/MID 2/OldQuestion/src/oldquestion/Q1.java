package oldquestion;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int wv;
        double t;
        
        System.out.print("The temperature in Fahrenheit: ");
        t = input.nextDouble();
        System.out.print("Wind speed in miles per hour: ");
        wv = input.nextInt();
        
        double vp = (Math.pow(wv,0.16));
        
        
        
        if( (t>-58 && t<41) && (wv>=2) ){
            double TWC = (  35.74 + ((0.6215*t)  - (35.75*vp)) );
            System.out.println("The wind chill index is "+TWC);
        }
        else
            System.out.println("The temperature is invalid");
    }
}
