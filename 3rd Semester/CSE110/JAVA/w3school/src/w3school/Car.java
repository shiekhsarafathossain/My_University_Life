package w3school;

public class Car {
    String color;
    double maxspeed;
 
    
    Car(String color,double maxspeed){
        this.color = color;
        this.maxspeed = maxspeed;
    }
    
    void carinfo(){
        System.out.println("Car Color: "+color);
        System.out.println("Car Max Speed: "+maxspeed);
    }
}
