package learning;

class Fraction {
    private int numerator;
    private int denominator;
     
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    int getNumerator(){
        return numerator;
    }
    
    int getDenominator(){
        return denominator;
    }
    
    void setNumerator(int numerator){
        this.numerator = numerator;
    }
    
    void setDenominator(int denominator){
        this.denominator = denominator;
    }
    
    String display(){
        return numerator + "/" + denominator + "\n";
    }
    
    void add(Fraction fraction){
        numerator = (numerator * fraction.getDenominator()) + (denominator * fraction.getNumerator());
        denominator = denominator * fraction.getDenominator(); 
    }   
    
    
}

public class NewClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,4);
        Fraction f2 = new Fraction(2,3);
        Fraction f3 = new Fraction(1,4);
        
        f3.add(f2);
        System.out.println(f3.display());
    }
}
