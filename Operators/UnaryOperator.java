package Operators;

public class UnaryOperator {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Postfix Increment " + (x++));
        System.out.println("Prefix Increment " + (++x));
        System.out.println("Postfix Decrement " + (x--));
        System.out.println("Prefix Decrement " + (--x));

        int a = 10;
        int b = 5;
        int n = 1;
        System.out.println(a - ++n - ++b);// 10 - 2 - 6
        System.out.println(b++ + ++a - n);// 6 + 11 - 2

        int y = 10;
        int z = -10;
        boolean c = true;
        boolean d = false;
        System.out.println(" ~ " + y + " is " + (~y));// -11 (minus of total positive value which starts from 0)
        System.out.println(" ~ " + z + " is " + (~z));// 9 (positive of total minus, positive starts from 0)
        System.out.println(" ! " + c + " is " + (!c));// false (opposite of boolean value)
        System.out.println(" ! " + d + " is " + (!d));// true

        // Higher precedence --> exp++, exp--
        // Lower precedence --> ++exp, --exp, +(unary plus), -(unary minus), ~, !

    }
}
