package baitap.ClassRoomValidate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassRoom {
    private Pattern pattern;
    private Matcher matcher;

    public ValidateClassRoom() {
        pattern = Pattern.compile("[CAP][0-9]{4}[GHIKLM]");
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ValidateClassRoom validateClassRoom = new ValidateClassRoom();
        System.out.println(validateClassRoom.validate("C0318G"));
        System.out.println(validateClassRoom.validate("M0318G"));
        System.out.println(validateClassRoom.validate("P0323A"));
    }
}
