package test;

public class testStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Welcome");
        stringBuilder.append(" ");
        stringBuilder.append("to");
        stringBuilder.append(" ");
        stringBuilder.append("Java");
        stringBuilder.insert(11,"HTML&");
        stringBuilder.replace(11,14,"CSS");
        //stringBuilder.delete(15,19);
        System.out.println(stringBuilder);


    }
}
