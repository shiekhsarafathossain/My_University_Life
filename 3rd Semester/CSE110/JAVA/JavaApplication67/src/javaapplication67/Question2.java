package javaapplication67;

class Calculator<T extends Number> {

    private T input1;
    private T input2;

    Calculator(T input1, T input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    public T getInput1() {
        return input1;
    }

    public T getInput2() {
        return input2;
    }

    public void setInput1(T input1) {
        this.input1 = input1;
    }

    public void setInput2(T input2) {
        this.input2 = input2;
    }

    <T> void DisplayResult(T element) {
        System.out.println("Result = " + element);
    }

    public T add() {
        if (getInput1() instanceof Integer && getInput2() instanceof Integer) {
            return (T) (Integer) (getInput1().intValue() + getInput2().intValue());
        } else {
            return (T) (Double) (getInput1().doubleValue() + getInput2().doubleValue());
        }
    }

    public T subtract() {
        if (getInput1() instanceof Integer && getInput2() instanceof Integer) {
            return (T) (Integer) (getInput1().intValue() - getInput2().intValue());
        } else {
            return (T) (Double) (getInput1().doubleValue() - getInput2().doubleValue());
        }
    }

    public T multiply() {
        if (getInput1() instanceof Integer && getInput2() instanceof Integer) {
            return (T) (Integer) (getInput1().intValue() * getInput2().intValue());
        } else {
            return (T) (Double) (getInput1().doubleValue() * getInput2().doubleValue());
        }
    }

    public T division() {
        if (getInput1() instanceof Integer && getInput2() instanceof Integer) {
            return (T) (Integer) (getInput1().intValue() / getInput2().intValue());
        } else {
            return (T) (Double) (getInput1().doubleValue() / getInput2().doubleValue());
        }
    }

}

public class Question2 {

    public static void main(String[] args) {
        Calculator<Integer> c1 = new Calculator(5, 5);

        c1.add();
        c1.DisplayResult(c1.add());

        Calculator<Double> c2 = new Calculator(5.5, 6.5);

        c2.multiply();
        c1.DisplayResult(c2.multiply());

    }
}
