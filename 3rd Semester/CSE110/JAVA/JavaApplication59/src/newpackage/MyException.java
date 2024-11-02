package newpackage;

public class MyException extends Exception{

    private static int accno[] = {1001, 1002, 1003, 1004};
    private static String name[] = {"Nish", "Shubh" ,"Sush", "Abhi", "Akash"};
    
    private static double bal[] = {1000.00,12000.00,5600.00,999.00,1100.55};
    
    MyException(){
    }
    
    MyException(String str){
        super(str);
    }
    
    
}
