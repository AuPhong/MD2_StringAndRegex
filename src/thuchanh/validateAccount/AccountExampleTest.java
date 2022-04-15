package thuchanh.validateAccount;

import thuchanh.validateEmail.EmailExample;

public class AccountExampleTest {
    private static AccountExample accountExample;
    private static String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456","abcdefgh"};
    private static String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) throws NullPointerException{
        accountExample = new AccountExample();
        for (String account:validAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println(account + " isvalid: "+isvalid);
        }
        for (String account:invalidAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println(account + " isvalid: "+isvalid);
        }
    }
    }

