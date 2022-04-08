package problemsday2;

import java.util.regex.*;

public class PhoneNumberValidation {
    public boolean isValid(String str) {
        Pattern pattern = Pattern.compile("(0/91)?[6-9][0-9]{9}");
        Matcher match = pattern.matcher(str);
        return (match.find() && match.group().equals(str));
    }

    public static void main(String[] args) {
        PhoneNumberValidation phoneNumberValidation = new PhoneNumberValidation();
        String str = "915362863453";
        if (phoneNumberValidation.isValid(str)) {
            System.out.println("It is a valid mobile number.");
        } else {
            System.out.println("It is a invalid mobile number.");
        }
    }
}
