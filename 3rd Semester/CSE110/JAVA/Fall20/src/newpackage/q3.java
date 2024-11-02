package newpackage;

import java.io.*;
import java.util.ArrayList;

abstract class Car {

    double price;
    int year;

    public Car() {

    }

    public Car(double price, int year) {
        this.price = price;
        this.year = year;
    }

    abstract double calculateSalePrice();

}

class ClassicCar extends Car {

    public ClassicCar(double price, int year) {
        super(price, year);
    }

    @Override
    double calculateSalePrice() {
        return 10000;
    }
}

class SportsCar extends Car {

    public SportsCar(double price, int year) {
        super(price, year);
    }

    @Override
    double calculateSalePrice() {
        if (year > 2000) {
            return 0.75 * price;
        } else if (year > 1995) {
            return 0.5 * price;
        } else {
            return 0.25 * price;
        }
    }
}

public class q3 {

    public static void main(String[] args) throws Exception {
        ArrayList<Car> slist = new ArrayList();

        slist.add(new SportsCar(20000, 1995));
        slist.add(new SportsCar(50000, 2002));
        slist.add(new ClassicCar(1000, 2000));
        slist.add(new ClassicCar(5000, 1966));

        for (Car c1 : slist) {
            // System.out.println(c1.calculateSalePrice());

            System.out.println(c1.toString());
        }

        FileOutputStream f = new FileOutputStream("scars.dat");

        DataOutputStream d = new DataOutputStream(f);
        for (int i = 0; i < slist.size(); i++) {
            d.writeDouble(slist.get(i).price);
            d.writeInt(slist.get(i).year);
            d.writeDouble(slist.get(i).calculateSalePrice());
            d.writeUTF(slist.get(i).toString());

        }
        d.close();

        FileInputStream f1 = new FileInputStream("scars.dat");

        DataInputStream d1 = new DataInputStream(f1);
        while (d1.available() > 0) {
            double a = d1.readDouble();
            int b = d1.readInt();
            double a1 = d1.readDouble();
            String s = d1.readUTF();
            System.out.println(a + " " + b + " " + a1 + " " + s);

        }
        d1.close();
        f1.close();
    }

}
