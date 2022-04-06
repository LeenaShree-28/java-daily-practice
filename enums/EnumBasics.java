package enums;

enum Directions {
    NORTH, SOUTH, EAST, WEST;
}

public class EnumBasics {
    // The Enum in Java is a data type which contains a fixed set of constants.
    // The enum can be defined within or outside the class because it is similar to a class.
    // The semicolon (;) at the end of the enum constants are optional.

    // defining the enum inside the class
    public enum Season {
        WINTER, SPRING, SUMMER, FALL
    }

    public static void main(String[] args) {

        // The Java compiler internally adds the values() and valueOf() method when it
        // creates an enum.
        // The values() method returns an array containing all the values of the enum.
        // The valueOf() method returns the value of given constant enum.

        for (Season s : Season.values()) {
            System.out.println(s);
        }

        System.out.println("Value of WINTER is: " + Season.valueOf("WINTER"));

        Directions d = Directions.EAST;
        System.out.println(d);
    }
}
