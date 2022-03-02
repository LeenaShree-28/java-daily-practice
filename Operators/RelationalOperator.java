package operators;

public class RelationalOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        int c = 5;
        System.out.println(a + " < " + b + " is " + (a < b));
        System.out.println(a + " > " + b + " is " + (a > b));
        System.out.println(b + " <= " + a + " is " + (b <= a));
        System.out.println(b + " >= " + c + " is " + (b >= c));
        System.out.println(a + " == " + c + " is " + (a == c));
        System.out.println(a + " != " + b + " is " + (a != b));

        // Higher precedence --> <, >, <=, >=, instanceof
        // Lower precedence --> ==,!=
    }
}
