package polymorphism;

// It simply means more than one form.
//That is, the same entity (method or operator or object) can perform different operations in different scenarios.

public class MethodOverloading {

    // In a Java class, we can create methods with the same name if they differ in parameters.

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public static double add(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading(); // create object because add method is not static
        System.out.println(m.add(1, 8));
        System.out.println(m.add(5, 17, 9));
        System.out.println(m.add(2.2f, 3.06f));
        System.out.println(add(4, 10.44d)); // directly add method is called because of static
    }
}
