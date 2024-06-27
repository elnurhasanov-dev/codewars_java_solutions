package kyu7;

import java.util.Arrays;

public class OddOrEven {
    public static void main(String[] args) {
        String test1 = oddOrEven(new int[]{1, -2, 3, 4, 5});
        String test2 = oddOrEven2(new int[]{4, 2, -2});

        System.out.println(test1);
        System.out.println(test2);
    }

    // Solution 1
    private static String oddOrEven(int[] array) {
        return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
    }

    // Solution 2
    private static String oddOrEven2(int[] array) {
        int sum = 0;

        for (int n : array) sum += n;
        return sum % 2 == 0 ? "even" : "odd";
    }
}
