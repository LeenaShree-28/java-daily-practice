package operators;

public class BitwiseAndLogicalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;
        // AND
        System.out.println(a < b && a < c);// false && true = false
        System.out.println(a < b & a < c);// false & true = false
        System.out.println(a < b && a++ < c);// false && true = false
        System.out.println(a);// 10 because second condition is not checked
        System.out.println(a < b & a++ < c);// false && true = false
        System.out.println(a);// 11 because second condition is checked
        // OR
        System.out.println(a > b || a < c);// true || true = true
        System.out.println(a > b | a < c);// true | true = true
        System.out.println(a > b || a++ < c);// true || true = true
        System.out.println(a);// 10 because second condition is not checked
        System.out.println(a > b | a++ < c);// true | true = true
        System.out.println(a);// 11 because second condition is checked
        // XOR for bitwise
        System.out.println(a ^ b);
        // For bitwise
        // & (AND) --> both bits are 1, it gives 1 else 0
        // | (OR) --> either of the bits is 1, it gives 1 else 0
        // ^ (XOR) --> both bits are same, it gives 0 else 1

        // precedence
        // 1. &
        // 2. ^
        // 3. |
        // 4. &&
        // 5. ||
    }
}
