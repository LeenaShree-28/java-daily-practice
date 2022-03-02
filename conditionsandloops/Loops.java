package conditionsandloops;

public class Loops {
   public static void main(String[] args) {
      // for loop
      // pyramid
      int rows = 5;
      for (int i = 1; i <= rows; i++) {
         for (int j = rows; j > i; j--) {
            System.out.print("  ");
         }
         for (int k = 0; k < 2 * i - 1; k++) {
            System.out.print("* ");
         }
         System.out.println();
      }

      // while loop
      // reverse a number
      int num = 2356, reversed = 0;
      System.out.println("Original Number: " + num);
      while (num != 0) {
         int digit = num % 10;
         reversed = reversed * 10 + digit;
         num /= 10;
      }
      System.out.println("Reversed Number: " + reversed);

      // do while
      // first excute the statement after check the condition
      int i = 11;
      do {
         System.out.println(i);
         i++;
      } while (i <= 10);
   }
}
