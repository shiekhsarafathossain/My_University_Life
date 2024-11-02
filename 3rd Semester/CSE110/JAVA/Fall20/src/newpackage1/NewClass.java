package newpackage1;

import java.io.*;
import java.util.*;
import java.lang.*;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

class student {

    int id;
    int mid1;
    int mid2;
    int Final;

    student() {
    }

    student(int id, int mid1, int mid2, int Final) {

        this.id = id;
        this.mid1 = mid1;
        this.mid2 = mid2;
        this.Final = Final;
    }

    @Override
    public String toString() {
        return "Student :" + id + " " + mid1 + " " + mid2 + " " + Final;
    }

}

public class NewClass {
 
    public static void main(String[] args) throws IOException, Exception {

       File f = new File("student.txt");
ArrayList<student> slist = new ArrayList();
        int id,mid1,mid2,Final;

        for (int i = 0; i < slist.size(); i++) {

            id = 5655;
            mid1 = (int) (Math.random() * 15);
            mid2 = (int) (Math.random() * 17);
            Final = (int) (Math.random() * 20);
            slist.add(new student(id, mid1, mid2, Final));
            System.out.println(slist.get(0).id);
            System.out.println(slist.get(i).toString());
        }
        for (int i = 0; i < slist.size(); i++) {
            System.out.print(slist.get(i).toString());
        }

        if (!f.exists()) {
            try (PrintWriter p = new PrintWriter(f)) {
                for (int i = 0; i < slist.size(); i++) {
                    p.print(slist.get(i).toString());

                }
            }
        }

        ArrayList<student> topmid1 = new ArrayList<student>();
        ArrayList<student> topmid2 = new ArrayList<student>();
        ArrayList<student> topfinal = new ArrayList<student>();

        Scanner read = new Scanner(f);
        while (read.hasNext()) {
            String x = read.nextLine();

            int maxmid1 = 0;
            int maxmid2 = 0;
            int maxFinal = 0;

            for (student s : slist) {
                if (s.mid2 > maxmid1) {
                    maxmid1 = s.mid2;
                }
                if (s.mid2 > maxmid2) {
                    maxmid2 = s.mid2;
                }
                if (s.Final > maxFinal) {
                    maxFinal = s.Final;
                }
            }

            for (int i = 0; i < slist.size(); i++) {
                if (slist.get(i).mid1 == maxmid1) {
                    System.out.println(slist.get(i).toString());
                }
                if (slist.get(i).mid2 == maxmid2) {
                    System.out.println(slist.get(i).toString());
                }
                if (slist.get(i).Final == maxFinal) {
                    System.out.println(slist.get(i).toString());
                }
            }
        }
    }
}
