
import java.util.Scanner;

public class swapingRows {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[4][4];
        int i, j, k;
        System.out.println("Put Numbers: ");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array is: ");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
            for (j = 0; j < 4; j++) {

                k = mat[1][j];
                mat[1][j] = mat[3][j];
                mat[3][j] = k;
            }
        
        System.out.println("Matrix after swaping: ");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
