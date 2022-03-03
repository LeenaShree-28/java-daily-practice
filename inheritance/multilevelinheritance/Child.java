package inheritance.multilevelinheritance;

public class Child extends Parent{
    public static void weep() {
        System.out.println("weeping...");
    }
    public static void main(String[] args) {

        // we don't create object because call all these methods are invoke in child class 
        // and the methods are static
        // can also create another class and create object for child class 
        // and access these three methods with same object.

        weep(); // child's method
        bark(); // parent's method
        eat(); // grandparent's method
    }
}
