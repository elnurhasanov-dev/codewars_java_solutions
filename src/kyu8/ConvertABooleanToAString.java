package codewars;

public class ConvertABooleanToAString {
    public static void main(String[] args) {
        String test1 = convert(true);
        String test2 = convert(false);

        System.out.println(test1);
        System.out.println(test2);
    }

    private static String convert(boolean b) {
        return String.valueOf(b);
    }
}
