package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("...s");
        Matcher m = p.matcher("aaas");
        boolean b = m.matches();
        System.out.println(b);
    }
}
