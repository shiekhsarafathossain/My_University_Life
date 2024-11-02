package two.d.arrayhw;
import java.util.Scanner;
public class PrintingArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array;
        int n,m;
        
        System.out.print("Enter Array Dimension: ");
        n = input.nextInt();
        m = input.nextInt();
        
        array = new int[n][m];
        
        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                array[row][col] = input.nextInt();
            }
        }
        
        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                System.out.printf("Array [%d][%d] = %d\t",row,col,array[row][col]);
                
            }
            System.out.print("\n");
        }
    }
    
}
