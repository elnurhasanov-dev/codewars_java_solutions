package kyu8;

public class StringyStrings {
    public static void main(String[] args) {
        String test1 = stringy(2);
        String test2 = stringy(5);

        System.out.println(test1);
        System.out.println(test2);
    }

    public static String stringy(int size) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) sb.append("1");
            else sb.append("0");
        }

        return sb.toString();
    }
}
