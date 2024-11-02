package w3school;

public class Engine {

    int engine;

    Engine(int engine) {
        this.engine = engine;
    }

    void isOn() {
        if (engine == 1) {
            System.out.println("Engine ON");
        } else {
            System.out.println("Engine OFF");
        }
    }

}
