package codewars;

import java.util.Arrays;

public class SentenceSmash {
    public static void main(String[] args) {
        String[] testArr = new String[]{"hello", "world", "this", "is", "great"};
        String testResult = smash(testArr);

        System.out.println(testResult);
    }

    private static String smash(String... words) {
        return String.join(" ", words);
    }
}
