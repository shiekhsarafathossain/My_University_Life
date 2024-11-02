
package codeforce;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ci=0;
        int cj=0;
        int arr[][] = new int[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(arr[i][j] == 1){
                    if(i>2 && j >2){
                        while(i == 2 && j ==2 ){
                            ci++;
                            cj++;
                            i--;
                            j--;
                        }
                    }
                }
            }
        }
        
        System.out.println(ci+cj);
    }
}
