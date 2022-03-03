package enums;

// We can have an abstract method in the Enum and can provide the implementation of these methods.

enum MyEnum {
    C1 {
        public int getValue() {
            return 100;
        }
    },
    C2 {
        public int getValue() {
            return 10;
        }
    },
    C3 {
        public int getValue() {
            return 0;
        }
    };

    // Provide default implementation for getValue() method
    public abstract int getValue();
}

public class EnumAbstractMethod {
    public static void main(String[] args) {
        for (MyEnum s : MyEnum.values()) {
            String name = s.name();
            int ordinal = s.ordinal(); // index
            int value = s.getValue();
            System.out.println("name = " + name + ", ordinal = " + ordinal + ", value = " + value);
        }
    }
}
