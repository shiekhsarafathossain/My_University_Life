package interface1;

interface addsub{
    double add(double a,double b);
    double sub(double a,double b);
}
interface div{
    double a();
    double dd();
}


interface calculator extends addsub{
    void Result(double result);
}

class myCalculator implements calculator,div{
    double a,b;
    public double a(){
        return 0.0;
    }
    public double dd(){
        return 0.0;
    }
    myCalculator(double a,double b){
        this.a = a;
        this.b = b;
    }
    double result;
    @Override
    public double add(double a,double b){
        result = a+b;
        return a+b;
        
    }
    @Override
    public void Result(double result){
        System.out.println("Result: "+result);
    }
    
    
    @Override
    public double sub(double a,double b){
        return a-b;
    }
    
    
}

public class Problem2 {
    public static void main(String[] args) {
        myCalculator c1 = new myCalculator(5.5,4.0);
        
        c1.add(5, 5);
        c1.Result(c1.result);
    }
}
