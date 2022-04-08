package problemsday1;

import java.util.Scanner;

public class IntegerToRoman {
   public void covert() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the Integer : ");
      int val = scanner.nextInt();
      int[] integerValue = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
      String[] roman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
      String ans = "";
      for (int i = 0; i < integerValue.length; i++) {
         while (val >= integerValue[i]) {
            val -= integerValue[i];
            ans += roman[i];
         }
      }
      System.out.println(ans);
      scanner.close();
   }

   public static void main(String[] args) {
      IntegerToRoman integerToRoman = new IntegerToRoman();
      integerToRoman.covert();
   }
}