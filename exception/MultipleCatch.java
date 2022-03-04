package exception;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            System.out.println("try Block Begin");
            int myArray[] = new int[5];
            myArray[5] = 10 / 0; // Arithmetic exception
            myArray[6] = 10 / 1; // ArrayIndexOutofBounds exception
        }
        // multiple catch blocks
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception : Divide by zero!!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds : Accessed index out of bounds");
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }
        System.out.println("rest of the code");
    }
}
