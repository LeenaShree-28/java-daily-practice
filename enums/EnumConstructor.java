package enums;

// The enum constants have an initial value which starts from 0, 1, 2, 3, and so on. 
// But, we can initialize the specific value to the enum constants by defining fields and constructors.
// Enum can have fields, constructors, and methods.
// Constructor of enum type is private. 
// If you don't declare private compiler internally creates private constructor.
// We can't create the instance of Enum by new keyword, because it contains private constructors only.

public class EnumConstructor {
    enum Color {
        RED(20), GREEN(255), BLUE(0);

        private int value;

        private Color(int value) {
            this.value = value;
        }
    }

    public static void main(String args[]) {
        for (Color c : Color.values()) {
            System.out.println(c + " -  " + c.value);
        }
    }
}
