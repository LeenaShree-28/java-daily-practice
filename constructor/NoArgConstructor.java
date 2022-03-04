package constructor;

public class NoArgConstructor {

    // When a constructor doesn't have any parameter, then it is calles no-arg constructor.

    NoArgConstructor() { // constructor
        System.out.println("Constructor called.");
    }

    public static void main(String[] args) {
        NoArgConstructor n = new NoArgConstructor(); // object creation
    }
}
