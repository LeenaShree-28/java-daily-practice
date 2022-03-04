package constructor;

public class ParameterizedConstructor {

    // A constructor which has a specific number of parameters is called a parameterized constructor.
    // The parameterized constructor is used to provide different values to distinct objects.
    // However, you can provide the same values also.

    int rollNo;
    String name;

    ParameterizedConstructor(int r, String n) {
        this.rollNo = r; // can give like this also.Here, this refers to the cuurent class.
        name = n;
    }

    void display() {
        System.out.println(rollNo + " " + name);
    }

    public static void main(String[] args) {
        ParameterizedConstructor p = new ParameterizedConstructor(03, "Leena");
        ParameterizedConstructor p1 = new ParameterizedConstructor(07, "Shree");
        p.display();
        p1.display();
    }
}
