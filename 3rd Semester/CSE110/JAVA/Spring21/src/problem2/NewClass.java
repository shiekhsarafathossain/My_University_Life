package problem2;

class Rectangle<T extends Number> {

    private T length;
    private T width;
    private T height;

    Rectangle() {

    }

    Rectangle(T length, T width, T height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public T getLength() {
        return (T) length;
    }

    public T getWidth() {
        return (T) width;
    }

    public T getHeight() {
        return (T) height;
    }

    void DisplayResult() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
    public T Perimeter() {
        if (length instanceof Integer && width instanceof Integer) {
            return (T) (Integer) (2*(width.intValue() * length.intValue()));
        } else {
            return (T) (Double) (height.doubleValue() * width.doubleValue());
        }
    }
    
    public T Area() {
        if (length instanceof Integer && width instanceof Integer) {
            return (T) (Integer) (height.intValue() * width.intValue());
        } else {
            return (T) (Double) (height.doubleValue() * width.doubleValue());
        }
    }
    
    public T volume() {
        if (length instanceof Integer && width instanceof Integer) {
            return (T) (Integer) (height.intValue() * width.intValue());
        } else {
            return (T) (Double) (height.doubleValue() * width.doubleValue());
        }
    }
}

public class NewClass {

    public static void main(String[] args) {

    }
}
