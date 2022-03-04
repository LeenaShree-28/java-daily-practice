package exception;

import java.io.*;

public class ThrowsKeyword {

    // The declaration of exception using the “throws” keyword tells the programmer that there may be an exception specified after the “throws” keyword
    // and the programmer should provide corresponding handler code for this exception to maintain the normal flow of the program.
    // throws keyword should give near method signature.

    void testMethod(int num) throws IOException, ArithmeticException {
        if (num == 1)
            throw new IOException("IOException Occurred");
        else
            throw new ArithmeticException("ArithmeticException");
    }
}

class Main {
    public static void main(String args[]) {
        try {
            // this try block calls the above method so handle the exception
            ThrowsKeyword obj = new ThrowsKeyword();
            obj.testMethod(1);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}