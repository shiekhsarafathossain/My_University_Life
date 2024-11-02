package labmanual05;

import java.util.Scanner;

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    void add(Fraction fraction) {
        int newNumerator = this.numerator * fraction.denominator + fraction.numerator * this.denominator;
        int newDenominator = this.denominator * fraction.denominator;
        this.numerator = newNumerator;
        this.denominator = newDenominator;
        simplify();
    }

    void subtract(Fraction fraction) {
        int newNumerator = this.numerator * fraction.denominator - fraction.numerator * this.denominator;
        int newDenominator = this.denominator * fraction.denominator;
        this.numerator = newNumerator;
        this.denominator = newDenominator;
        simplify();
    }

    void multiply(Fraction fraction) {
        this.numerator *= fraction.numerator;
        this.denominator *= fraction.denominator;
        simplify();
    }

    void divide(Fraction fraction) {
        this.numerator *= fraction.denominator;
        this.denominator *= fraction.numerator;
        simplify();
    }

    private void simplify() {
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public String toString0() {
        return this.numerator + "/" + this.denominator;
    }
}

public class LabProblem3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the numerator for the 1st fraction: ");
        int n1 = inp.nextInt();
        System.out.print("Enter the denominator for the 1st fraction: ");
        int d1 = inp.nextInt();
        
        System.out.print("Enter the numerator for the 2nd fraction: ");
        int n2 = inp.nextInt();
        System.out.print("Enter the denominator for the 2nd fraction: ");
        int d2 = inp.nextInt();
        
        Fraction fraction1 = new Fraction(n1, d1);
        Fraction fraction2 = new Fraction(n2, d2);

        System.out.println("Fraction 1: " + fraction1.toString0());
        System.out.println("Fraction 2: " + fraction2.toString0());

        fraction1.add(fraction2);
        System.out.println("After addition: " + fraction1.toString0());

        Fraction fraction3 = new Fraction(n1, d1);
        Fraction fraction4 = new Fraction(n2, d2);
        fraction3.subtract(fraction4);
        System.out.println("After subtraction: " + fraction3.toString0());

        Fraction fraction5 = new Fraction(n1, d1);
        Fraction fraction6 = new Fraction(n2, d2);
        fraction5.multiply(fraction6);
        System.out.println("After multiplication: " + fraction5.toString0());

        Fraction fraction7 = new Fraction(n1, d1);
        Fraction fraction8 = new Fraction(n2, d2);
        fraction7.divide(fraction8);
        System.out.println("After division: " + fraction7.toString0());
    }
}
