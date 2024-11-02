package javaapplication59;

public class NewClass {

    public static void main(String[] args) {

        try {
            int a[] = new int[2];

            a[0] = 1;
            a[1] = 2;
            
            System.out.println("Access element three :" + a[3]);
            throw new ArrayIndexOutOfBoundsException("Exception"); 
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println(e1);
        }
        System.out.println("Out of the block");
    }
}
