package kyu8;

import java.util.Arrays;

public class FindTheSmallestIntegerInTheArray {
    public static void main(String[] args) {
        int test1 = findSmallestInt(new int[]{5, 3, 2, 1, 1, 4});
        int test2 = findSmallestInt(new int[]{2, 2, 1, 2, 1, 3});

        System.out.println(test1);
        System.out.println(test2);
    }

    private static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().getAsInt();
    }
}
