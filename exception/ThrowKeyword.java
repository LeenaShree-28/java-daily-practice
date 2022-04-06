package exception;

public class ThrowKeyword {
    static void validate_Age(int age) {
        // if specified age is < 18, throw ArithmeticException
        if (age < 18)
            throw new ArithmeticException("Not eligible to vote and drive!!"); // we create a exception using throw keyword
        else // print the message
            System.out.println("Eligible to vote and drive!!");
    }

    public static void main(String args[]) {
        // call validate_Age method
        try {
            validate_Age(10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("rest of the code...");
    }
}
