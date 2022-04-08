package problemsday2;

import java.util.Scanner;
import java.util.regex.*;

public class EmailValidation {
    public static boolean isValid(String str){
        Pattern pattern = Pattern.compile("[\\w-]{1,20}@\\w{2,20}\\.\\w{2,3}$");
        Matcher match = pattern.matcher(str);
        return (match.find() && match.group().equals(str));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email :");
        String mail = scanner.nextLine();
        if (isValid(mail)) {
            System.out.println("It is a valid email.");
        } else {
            System.out.println("It is a invalid email.");
        }
        scanner.close();
    }
}
