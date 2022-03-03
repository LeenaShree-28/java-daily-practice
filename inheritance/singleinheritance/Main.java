package inheritance.singleinheritance;

// When a class inherits another class, it is known as a single inheritance. 

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat(); // access parent class method with child class object
    }
}
