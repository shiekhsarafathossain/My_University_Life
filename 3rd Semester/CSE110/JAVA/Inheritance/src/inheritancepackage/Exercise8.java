package inheritancepackage;

class Shape{
    double pie = 3.1416;
    double getPerimeter(){
        return 0.0;
    }
    
    double getArea(){
        return 0.0;
    }
    
}

class Circle extends Shape{
    double radius;
    
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    double getPerimeter(){
        return (2*pie*radius);
    }
    @Override
    double getArea(){
        return (pie*(radius*radius));
    }
    
}

public class Exercise8 {
    public static void main(String[] args) {
        Shape sh = new Shape();
        
        System.out.println("Value of Pie is "+sh.pie);
        
        Circle c1 = new Circle(6);
        System.out.println("Circle 1 Perimeter = "+c1.getPerimeter());
        System.out.println("Circle 1 Area = "+c1.getArea());
        Circle c2 = new Circle(10);
        System.out.println("Circle 2 Perimeter = "+c2.getPerimeter());
        System.out.println("Circle 2 Area = "+c2.getArea());
        
    }
}
