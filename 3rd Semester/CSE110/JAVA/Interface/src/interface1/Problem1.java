package interface1;
import java.lang.*;
interface Shape{
    public abstract double getarea();
}

class Rectangle implements Shape{
    double r,p;
    Rectangle(double r,double p){
        this.r = r;
        this.p = p;
    }
    @Override
    public double getarea(){
        return r*p*Math.PI;
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5.5,10.5);
        System.out.println(r1.getarea());
        
    }
}
