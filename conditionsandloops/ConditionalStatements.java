package conditionsandloops;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        // if - else
        int number = 51;
        if (number % 2 == 0) {
            System.out.println("The Number " + number + " is Even");
        } else {
            System.out.println("The Number " + number + " is Odd");
        }

        // switch
        Scanner s = new Scanner(System.in);
        System.out.println("Enter operand 1 : ");
        int a = s.nextInt();
        System.out.println("Enter any operator from the following : + - * / ");
        char operator = s.next().charAt(0);
        System.out.println("Enter operand 2 : ");
        int b = s.nextInt();
        switch (operator) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + ((double) a / (double) b));
                break;
            default:
                System.out.println("Invalid Operator.");
        }
        s.close();

        // Points to remember for switch case
        
        // There can be one or N number of case values for a switch expression.
        // The case value must be of switch expression type only. The case value must be literal or constant. It doesn't allow variables.
        // The case values must be unique. In case of duplicate value, it renders compile-time error.
        // The Java switch expression must be of byte, short, int, long (with its Wrapper type), enums and string.
        // Each case statement can have a break statement which is optional. When control reaches to the break statement, it jumps the control after the switch expression. If a break statement is not found, it executes the next case.
        // The case value can have a default label which is optional.
    }
}