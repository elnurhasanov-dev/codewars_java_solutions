package kyu7;

public class Mumbling {
    public static void main(String[] args) {
        String test1 = accum("abcd");
        String test2 = accum("RqaEzty");

        System.out.println(test1);
        System.out.println(test2);
    }

    private static String accum(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            String str = s.charAt(i) + "";
            result += str.toUpperCase();

            for (int y = 0; y < i; y++) {
                result += str.toLowerCase();
            }

            if (i < s.length() - 1) {
                result += "-";
            }
        }

        return result;
    }
}
