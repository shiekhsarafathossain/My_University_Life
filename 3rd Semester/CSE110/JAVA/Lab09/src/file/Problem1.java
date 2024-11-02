package file;

import java.io.*;
import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("file.txt");

        if (!file.exists()) {
            PrintWriter write = new PrintWriter(file);
            for (int i = 0; i < 100; i++) {
                int a = (int) (Math.random() * 100);
                write.print(a);
                write.print(" ");
            }
            write.close();
        }

        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            String x = sc.nextLine();
            System.out.println(x);
        }

    }
}
