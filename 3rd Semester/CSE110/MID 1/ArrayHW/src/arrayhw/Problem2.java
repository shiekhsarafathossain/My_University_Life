package arrayhw;

public class Problem2 {
    public static void main(String[] args) {
        
        int[] arr;
        int i;
    
        arr = new int[10];
    
        for(i=0; i<arr.length ; i++){
            arr[i] = (int) (Math.random() * 100);
        }  
    }
    
}
