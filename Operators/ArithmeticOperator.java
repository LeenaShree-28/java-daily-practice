package operators;

public class ArithmeticOperator {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));// % -> Remainder

        // example for precedence
        // Higher -> *, /, %
        // Lower -> +, -
        // left to right for same precedence

        System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);
    }
}
