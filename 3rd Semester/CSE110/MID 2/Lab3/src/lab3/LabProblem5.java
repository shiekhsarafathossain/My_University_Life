package lab3;

public class LabProblem5 {
    
    public static void Big(int[] array){
        int max = array[0]; 
        int count = 0;
        int i;
        for (i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                count = i;
            }
        }
        System.out.println("The highest value is "+max+ " which is in "+count+"th position ");
        }
    
    
    public static void Small(int[] array){
        int min = array[0];
        int count = 0;
        int i;
        for (i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                count = i;
            }
        }
        System.out.println("The highest value is "+min+ " which is in "+count+"th position ");
        }
    
       
    
    public static void main(String[] args) {
        
        int[] array = new int[100];
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("\n");
        Big(array);
        Small(array);
    }
    
}
