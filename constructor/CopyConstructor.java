package constructor;

// There is no copy constructor in Java.
// However, we can copy the values from one object to another.
// Ways to copy :
    // By constructor,
    // By assigning the values of one object into another,
    // By clone() method of Object class.

public class CopyConstructor {
    int number;

    CopyConstructor(int n) {
        number = n;
    }

    CopyConstructor(CopyConstructor c) { // object as a parameter
        number = c.number;
    }

    public void display() {
        System.out.println(number);
    }

    public static void main(String[] args) {
        CopyConstructor c1 = new CopyConstructor(5);
        // method 1
        CopyConstructor c2 = new CopyConstructor(c1);
        // method 2

        /*
          CopyConstructor c2 = new CopyConstructor();
          c2.number=c1.number;
        */

        c1.display();
        c2.display();
    }
}
