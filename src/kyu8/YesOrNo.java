package kyu8;

public class YesOrNo {
    public static void main(String[] args) {
        String test1 = boolToWord(true);
        String test2 = boolToWord(false);

        System.out.println(test1);
        System.out.println(test2);
    }

    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }
}
