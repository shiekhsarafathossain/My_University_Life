/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem3.newpackage;
abstract class Number {
    protected int[] digits;
    protected int base;

    public Number(int[] digits, int base) {
        this.digits = digits;
        this.base = base;
    }

    public abstract int ConvertToDec();

    public abstract int[] DecToBase(int number);
}

class BinaryNumber extends Number {
    public BinaryNumber(int[] digits) {
        super(digits, 2);
    }

    @Override
    public int ConvertToDec() {
        int decimal = 0;
        int power = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            decimal += digits[i] * Math.pow(2, power);
            power++;
        }

        return decimal;
    }

    @Override
    public int[] DecToBase(int number) {
        int[] binaryArray = new int[32]; // Assuming a maximum of 32 bits for binary representation

        int index = 0;
        while (number > 0) {
            binaryArray[index] = number % 2;
            number /= 2;
            index++;
        }

        int[] binaryResult = new int[index];
        for (int i = index - 1; i >= 0; i--) {
            binaryResult[index - 1 - i] = binaryArray[i];
        }

        return binaryResult;
    }
}

class OctalNumber extends Number {
    public OctalNumber(int[] digits) {
        super(digits, 8);
    }

    @Override
    public int ConvertToDec() {
        int decimal = 0;
        int power = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            decimal += digits[i] * Math.pow(8, power);
            power++;
        }

        return decimal;
    }

    @Override
    public int[] DecToBase(int number) {
        int[] octalArray = new int[11]; // Assuming a maximum of 11 digits for octal representation

        int index = 0;
        while (number > 0) {
            octalArray[index] = number % 8;
            number /= 8;
            index++;
        }

        int[] octalResult = new int[index];
        for (int i = index - 1; i >= 0; i--) {
            octalResult[index - 1 - i] = octalArray[i];
        }

        return octalResult;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] binaryDigits = { 1, 0, 1, 0 }; // Binary representation of 10 in decimal
        BinaryNumber binaryNumber = new BinaryNumber(binaryDigits);
        System.out.println("Binary to Decimal: " + binaryNumber.ConvertToDec());

        int decimalValue = 18; // Decimal value to convert to binary
        int[] binaryResult = binaryNumber.DecToBase(decimalValue);
        System.out.print("Decimal to Binary: ");
        for (int digit : binaryResult) {
            System.out.print(digit);
        }
        System.out.println();

        int[] octalDigits = { 2, 3, 5 }; // Octal representation of 173 in decimal
        OctalNumber octalNumber = new OctalNumber(octalDigits);
        System.out.println("Octal to Decimal: " + octalNumber.ConvertToDec());

        decimalValue = 99; // Decimal value to convert to octal
        int[] octalResult = octalNumber.DecToBase(decimalValue);
        System.out.print("Decimal to Octal: ");
        for (int digit : octalResult) {
            System.out.print(digit);
        }
        System.out.println();
    }
}
