package codeforce;

import java.util.Scanner;

public class problem2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int c = input.nextInt();
        input.nextLine();
        for (int i = 1; i <= c; i++) {
            String w = input.nextLine();

        if (w.length() <= 10) {
            System.out.print(w);
        } else {
            System.out.printf("%c%d%c", w.charAt(0), (w.length() - 2), w.charAt(w.length() - 1));
        }
            System.out.println();
        }
        

    }
}
