package newpackage;

public class NewClass {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            int x = i;
            for (int j = 1; i <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print( x);
                    int numca = i - j;

                    x = x + (numca * 2);
                } else {
                    System.out.print(x);
                    int numcb = n - 1;
                    x = x + ((numcb * 2) + 1);
                }
                System.out.println("");
            }
            System.out.print("\n");
            System.out.println("");
        }
    }
}
