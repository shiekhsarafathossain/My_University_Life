package lab9;

import java.io.*;
import java.util.Scanner;

public class LabProblem1 {

    public static void main(String[] args) throws IOException, Exception {

        File file = new File("Lab08_01.txt");

        if (!file.exists()) {
            PrintWriter w = new PrintWriter(file);

            for (int i = 0; i < 100; i++) {
                w.print((int) (Math.random() * 100));
                w.print(" ");
            }
            w.close();
        }
        /*
        Scanner r = new Scanner(file);
        try {
            while (r.hasNext()) {
                int x = r.nextInt();
                String y = r.nextLine();
                System.out.print(x+y);
            }
            r.close();
        } catch (Exception e) {
            System.out.println(e);

        } */
    }
}
