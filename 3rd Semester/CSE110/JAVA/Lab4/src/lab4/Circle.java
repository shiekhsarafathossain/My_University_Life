package lab4;

public class Circle {
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    Operation op = new Operation();
    
    double pi = 3.14;
    
    public double area(){
        return pi*op.square(radius);
    }
    
}
