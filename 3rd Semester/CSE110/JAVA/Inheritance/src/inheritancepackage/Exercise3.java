package inheritancepackage;

class Shape{
    double getArea(){
        return 0.0;
    }
}

class Rectangel extends Shape{
    double length;
    double width;
    Rectangel(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    double getArea(){
        return length*width;
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Rectangel r1 = new Rectangel(2,3);
        System.out.println(r1.getArea());
    }
}
