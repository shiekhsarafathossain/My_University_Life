
package newpackage2;

interface Vehicle{
    
    public abstract int changeGear(int a);
    public abstract int speedUp(int a);
    public abstract int applyBreaks(int a);
    
}

class Bicycle implements Vehicle{
    int speed;
    int gear;
     public int changeGear(int a){
         return gear=a;
     }
     public int speedUp(int a){
         return speed=a;
     }
     public int applyBreaks(int a){
         return speed=a;
     }
     
}

class Bike implements Vehicle{
    int speed;
    int gear;
     public int changeGear(int a){
         return gear=a;
     }
     public int speedUp(int a){
         return speed=speed+a;
     }
     public int applyBreaks(int a){
         return speed=speed-a;
     }
     
}



public class NewClass {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.changeGear(4);
        System.out.println(b1.gear);
        b1.speedUp(120);
        System.out.println(b1.speed);
        b1.applyBreaks(60);
        System.out.println(b1.speed);
        
        Bicycle b2 = new Bicycle();
        b2.changeGear(2);
        System.out.println(b2.gear);
        b2.speedUp(30);
        
        System.out.println(b2.speed);
        b2.applyBreaks(5);
        System.out.println(b2.speed);
    }
}
