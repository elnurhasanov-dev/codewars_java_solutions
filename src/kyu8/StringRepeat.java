package codewars;

public class StringRepeat {
    public static void main(String[] args) {
        String test1 = repeatStr(2, "Solution");
        String test2 = repeatStr(5, "Hello");

        System.out.println(test1);
        System.out.println(test2);
    }

    public static String repeatStr(final int repeat, final String string) {
        String result = "";

        for (int i = 0; i < repeat; i++)
            result += string;

        return result;
    }
}
