
import java.util.*;

public class LexicographicalSort {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = inp.nextInt();
        String[] array = new String[n];
        inp.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Words: ");
            array[i] = inp.nextLine();
        }
        Arrays.sort(array);
        for (String x : array) {
            System.out.println(x);
        }
    }
}
