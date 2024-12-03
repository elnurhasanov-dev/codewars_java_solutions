package kyu6;

import java.util.Arrays;

public class AllStarCodeChallenge {
    public static void main(String[] args) {
        var test = rotate("Hello");

        System.out.println(Arrays.toString(test));
    }

    private static String[] rotate(String text) {

        String[] rotatedStrs = new String[text.length()];
        String helper = text;

        for (int i = 0; i < text.length(); i++) {
            String s = helper.substring(1) + helper.substring(0, 1);
            helper = s;
            rotatedStrs[i] = s;
        }

        return rotatedStrs;
    }
}
