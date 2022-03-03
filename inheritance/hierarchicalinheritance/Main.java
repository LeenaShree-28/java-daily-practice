package inheritance.hierarchicalinheritance;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        // we can't create bark method like this --> c.bark();
        // want to create seperate object for dog class
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
