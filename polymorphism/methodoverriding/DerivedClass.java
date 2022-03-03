package polymorphism.methodoverriding;

public class DerivedClass extends BaseClass { // childClass or subClass

    // we can access all parent's methods, variables because of inheritance.

    @Override
    public void work() { // override the method in parentClass
        super.work(); // to call parent's method
        System.out.println(" My occupation is TEACHING.");
        System.out.println(value); // variable of parent class
    }
}
