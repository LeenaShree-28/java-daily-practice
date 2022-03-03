package inheritance.hierarchicalinheritance;

public class Cat extends Animal {
    void meow() {
        eat(); // parent's method
        System.out.println("meowing...");
       // bark(); 
       // error because there is no relationship between two derived class so we can't access this method here.
    }
}
