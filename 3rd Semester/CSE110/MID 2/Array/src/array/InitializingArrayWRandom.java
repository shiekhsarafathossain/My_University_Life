package array;

import java.util.Random;

public class InitializingArrayWRandom {
    public static void main(String[] args) {
        int n = 10; 

        int[] arr = new int[n];
        Random random = new Random(); 

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
    }
}
