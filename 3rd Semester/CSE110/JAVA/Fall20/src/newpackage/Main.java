package newpackage;

class Shape<T> {

    private T shapeInfo;
    private double area;
    private double volume;

    public Shape() {

    }

    public Shape(T shapeInfo, double area, double volume) {
        this.shapeInfo = shapeInfo;
        this.area = area;
        this.volume = volume;
    }

    public T getShapeInfo() {
        return shapeInfo;
    }

    public void setShapeInfo(T shapeInfo) {
        this.shapeInfo = shapeInfo;
    }

    public double getArea() throws NegativeValueException {

        if (area > 0) {
            return area;
        } else {
            NegativeValueException e1 = new NegativeValueException("NegativeValueException");
            throw e1;
        }
    }

    public void setArea(double area) throws NegativeValueException {

        if (area > 0) {
            this.area = area;
        } else {
            NegativeValueException e1 = new NegativeValueException("NegativeValueException");
            throw e1;
        }
    }

    public double area() throws NegativeValueException {
        if (getArea() > 0) {
            return getArea();
        } else {
            NegativeValueException e1 = new NegativeValueException("NegativeValueException");
            throw e1;
        }

    }

    public double getVolume() throws NegativeValueException {
        if (volume > 0) {
            return volume;
        } else {
            NegativeValueException e1 = new NegativeValueException("NegativeValueException");
            throw e1;
        }
    }

    public void setVolume(double volume) throws NegativeValueException {
        if (volume > 0) {
            this.volume = volume;
        } else {
            NegativeValueException e1 = new NegativeValueException("NegativeValueException");
            throw e1;
        }
    }

    @Override
    public String toString() {
        String str = "Shape Information: " + shapeInfo + "\nArea: " + area + "\nVolume: " + volume;

        return str;
    }
}

class NegativeValueException extends Exception {

    NegativeValueException(String str) {
        super(str);
    }
}

public class Main {

    public static void main(String[] args) throws NegativeValueException {

        try {
            Shape<Integer> s1 = new Shape(5,0,0);
            s1.getArea();
            s1.getVolume();
          
            System.out.println(s1.toString());
          //  s1.setArea(-9999);
         //   s1.setVolume(-88);
            
        } catch (NegativeValueException e1) {
            System.out.println(e1);
        }
    }
}
