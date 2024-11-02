package inheritancepackage;

class Vehicle{
    
    void drive(){
        System.out.println("Repairing a vehicle");
    }
}

class Car{
    void drive(){
        System.out.println("Repairing a car");
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        
        Vehicle veh1 = new Vehicle();
        veh1.drive();
        
        Car car1 = new Car();
        
        car1.drive();
        
        
    }
}
