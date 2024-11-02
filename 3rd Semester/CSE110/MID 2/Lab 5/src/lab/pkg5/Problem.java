
package lab.pkg5;

import java.util.Scanner;
class icecream {

    private String ictype, iccompany;
    private double pr;
    String type;

    icecream() {
    }

    icecream(String type, String company, double price) {
        ictype = type;
        iccompany = company;
        pr = price;
    }

    public void setictype(String type) {
        ictype = type;
    }

    public void seticcompany(String company) {
        iccompany = company;
    }

    public void setpr(double price) {
        pr = price;
    }

    public String getictype() {
        return ictype;
    }

    public String geticcompany() {
        return iccompany;
    }

    public double getpr() {
        return pr;
    }

    public String display() {
        String ans = ("icecream type :" + ictype + "icecrem company :" + iccompany + " icecrem price :" + pr);
        return ans;
    }
}
public class Problem {
    public static void main(String[] args) {
        icecream[] icecreams = new icecream[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < icecreams.length; i++) {
            icecreams[i]= new icecream();
            System.out.println("Enter ice cream type:");
            String ictype = input.next();

            System.out.println("Enter ice cream company:");
            String iccompany = input.next();

            System.out.println("Enter ice cream price:");
            double price = input.nextDouble();

            icecreams[i] = new icecream(ictype, iccompany, price);

            System.out.println("Enter a company name to search for:");
//            String searchcompany = input.next();
            System.out.println(icecreams[i].display());
        }
    }
}
