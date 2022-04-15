package baitap.phonenumberValidate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidate {
    private Pattern pattern;
    private Matcher matcher;

    public PhoneNumberValidate() {
        pattern = Pattern.compile("\\d{2}-0\\d{9}");
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        PhoneNumberValidate phoneNumberValidate = new PhoneNumberValidate();
        System.out.println(phoneNumberValidate.validate("84-0978489648"));
        System.out.println(phoneNumberValidate.validate("a8-22222222"));
    }
}
