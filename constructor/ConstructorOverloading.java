package constructor;

// In Java, a constructor is just like a method but without return type.
// It can also be overloaded like Java methods.
// Constructor overloading in Java is a technique of having more than one constructor with different parameter lists.
// They are arranged in a way that each constructor performs a different task.
// They are differentiated by the compiler by the number of parameters in the list and their types.

public class ConstructorOverloading {

    int id;
    String name;

    public ConstructorOverloading() {
        System.out.println("No-arg Constructor called.");
    }

    public ConstructorOverloading(int i) {
        id = i;
        System.out.println("Parameterized Constructor1 is called");
        System.out.println(id);
    }

    public ConstructorOverloading(int i, String n) {
        id = i;
        name = n;
        System.out.println("Parameterized Constructor2 is called");
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        ConstructorOverloading c = new ConstructorOverloading();
        ConstructorOverloading c1 = new ConstructorOverloading(8);
        ConstructorOverloading c2 = new ConstructorOverloading(5, "Ashok");
    }
}
