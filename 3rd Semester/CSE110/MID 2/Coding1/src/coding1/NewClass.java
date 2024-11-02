package coding1;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int num;

        System.out.print("Enter day number (1-7) : ");
        num = input.nextInt();

        for (int i = 0; i < weeks.length; i++) {
            if (num-1 == i ) {
                System.out.println(weeks[i]);
            }
            else if((num-1) > 7 || (num-1) > 7)
            {
                System.out.println("invalid");
                break;
            }
        }
       
    }
}
