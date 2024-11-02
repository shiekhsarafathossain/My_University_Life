package lab3problem;

public class Problem5 {
    
    public static void largest(int[] array){
        int max = array[0]; 
        int count = 0;
        for (int row = 1; row < array.length; row++) {
            if (array[row] > max) {
                max = array[row];
                count = row;
            }
        }
        System.out.println("The highest value is "+max+ " which is in "+count+"th position ");
        }
    
    
    public static void Smallest(int[] array){
        int min = array[0];
        int count = 0;
        for (int row = 0; row < array.length; row++) {
            if (min > array[row]) {
                min = array[row];
                count = row;
            }
        }
        System.out.println("The highest value is "+min+ " which is in "+count+"th position ");
        }
    
       
    
    public static void main(String[] args) {
        
        int[] array = new int[100];

        for (int row = 0; row < array.length; row++) {
            array[row] = (int) (Math.random() * 100);
        }
        for (int row = 0; row < array.length; row++) {
            System.out.print(array[row]+ " ");
        }
        System.out.println("\n");
        largest(array);
        Smallest(array);
    }
        
}
    

