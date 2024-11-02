package arrayhw;

public class Problem3 {
    public static void main(String[] args) {
        
        int[] arr;
        int i;
    
        arr = new int[10];
    
        for(i=0; i<arr.length ; i++){
            arr[i] = (int) (Math.random() * 100);
        }
        
        for (i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
