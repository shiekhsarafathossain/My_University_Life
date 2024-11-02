package coding1;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 32;
        int b = 12;
        int c;
        
        
        c = a & b;
        System.out.println("a & b = "+c);
        
        c = a | b;
        System.out.println("a | b = "+c);
        
        c = a ^ b;
        System.out.println("a ^ b = "+c);
        
        c = a>>2;
        System.out.println("a>>2 = "+c); //8
        
        c = a<<2;
        System.out.println("a<<2 = "+c); //128
        
    }
    
}
