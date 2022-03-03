package polymorphism.methodoverriding;

    // During inheritance in Java, if the same method is present in both the superclass and the subclass. 
    // Then, the method in the subclass overrides the same method in the superclass.
    // This is called method overriding.

public class MainClass {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        obj.work(); 

        // can create object like this too.
        BaseClass obj1 = new DerivedClass();
        obj1.work();
    }
}
