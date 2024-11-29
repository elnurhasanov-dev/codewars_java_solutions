package kyu8;

public class DoubleChar {
    public static void main(String[] args) {
        String test1 = doubleChar("String");
        String test2 = doubleChar("1234!_ ");

        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);
    }

    private static String doubleChar(String s) {
        String repeatedStr = "";
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            repeatedStr += c + "" + c;
        }

        return repeatedStr;
    }
}
