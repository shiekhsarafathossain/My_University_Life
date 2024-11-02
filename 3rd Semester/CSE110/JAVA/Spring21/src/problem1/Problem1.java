package problem1;

abstract class Number{
    int digit[];
    int base;
    
    abstract void ConvertToDec();
    abstract void DecToBase(int number);
}

class BinaryNumber extends Number{
    
    
    public void ConvertToDec(){
        int total =0;
        digit = new int[5];
        digit[0] = 8;
        digit[1] = 3;
        digit[2] = 6;
        digit[3] = 2;
        digit[4] = 9;
        for (int i = 0; i < digit.length-1 ; i++) {
            int res=0;
            
            for (int j = 0; j < i+1; j++) {
                 res = (digit[i]*5)*j;
            }
            total = total+res;
           // System.out.println(total);
            
        }
        System.out.println(total);
    }
    public void DecToBase(int number){
        
    }
}

public class Problem1 {
    public static void main(String[] args) {
        BinaryNumber b1 = new BinaryNumber();
        b1.ConvertToDec();
    }
}
