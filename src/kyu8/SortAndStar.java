package kyu8;

import java.util.Arrays;

public class SortAndStar {
    public static void main(String[] args) {
        String test = twoSort(new String[]{"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"});

        System.out.println(test);
        System.out.println("asd");
    }

    private static String twoSort(String[] s) {
        Arrays.sort(s);
        String firstElement = s[0];
        String result = String.join("***", firstElement.split(""));

        return result;
    }
}
