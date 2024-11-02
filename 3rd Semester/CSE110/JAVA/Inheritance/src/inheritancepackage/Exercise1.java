package inheritancepackage;

class Animal{
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("The cat quarrels");
    }
}


public class Exercise1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat ca = new Cat();
        animal.makeSound();
        ca.makeSound();
    }
}
