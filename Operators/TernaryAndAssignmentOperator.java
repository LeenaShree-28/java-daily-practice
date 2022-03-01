package Operators;

public class TernaryAndAssignmentOperator {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        // ternary
        System.out.println((a < b) ? a : b);
        // assignment
        int x = 10;
        x += 3;// 10 + 3
        System.out.println(x);
        x -= 4;// 13 - 4
        System.out.println(x);
        x *= 2;// 9 * 2
        System.out.println(x);
        x /= 2;// 18 / 2
        System.out.println(x);
        x %= 2;// 9 % 2
        System.out.println(x);
    }
        // precedence for all operators
        // 1. Unary
        // 2. Arithmetic
        // 3. Shift
        // 4. Relational
        // 5. Bitwise
        // 6. Logical
        // 7. Ternary
        // 8. Assignment
}
