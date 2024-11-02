package w3school;

public class Maruti extends Car {

    String company;
    String model;
    int year;
    Engine e1;

    Maruti(String color, double maxspeed, String Company, String model, int year, int engine) {
        super(color, maxspeed);
        this.company = Company;
        this.model = model;
        this.year = year;
        e1 = new Engine(engine);
    }

    void display() {
        super.carinfo();
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        e1.isOn();
    }

}
