package codewars;

import java.util.Arrays;

public class SortTheGiftCode {
    public static void main(String[] args) {
        String test1 = sortGiftCode("pqksuvy");
        String test2 = sortGiftCode("zyxwvutsrqponmlkjihgfedcba");

        System.out.println(test1);
        System.out.println(test2);
    }

    private static String sortGiftCode(String code) {
        char[] tempArr = code.toCharArray();
        Arrays.sort(tempArr);
        return new String(tempArr);
    }
}
