package lab3;

import java.util.Scanner;

public class LabProblem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        int[] array = new int[10];
        int[] temp = new int[10];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();
            array[i] = num;
            int multi = Isdistinct(array[i], temp, count);
            if (multi == 0) {
                temp[count] = array[i];
                count++;
            }
        }

        System.out.println("Unique inputs: ");
        for (int i = 0; i < count; i++) {
            if (temp[i] != 0) {
                System.out.print(temp[i] + " ");
            }
        }
        System.out.print("\n");
    }

    
    public static int Isdistinct(int num, int[] temp, int count) {
        for (int k = 0; k < count; k++) {
            if (num == temp[k]) {
                return 1;
            }
        }
        return 0;
    }
    
}
