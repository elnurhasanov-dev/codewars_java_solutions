package kyu8;

import java.util.Arrays;

public class SumOfPositive {
    public static void main(String[] args) {
        int[] test1 = new int[]{1, -2, 3, 4, 5};
        int[] test2 = new int[]{};

        System.out.println("Solution 1");
        System.out.println("test1: " + sum(test1));
        System.out.println("test2: " + sum(test2) + "\n");

        System.out.println("Solution 2");
        System.out.println("test1: " + sum2(test1));
        System.out.println("test2: " + sum2(test2) + "\n");

        System.out.println("Solution 3");
        System.out.println("test1: " + sum3(test1));
        System.out.println("test2: " + sum3(test2));

    }

    // Solution 1 - with reduce()
    private static int sum(int[] arr) {
        return Arrays.stream(arr)
                .filter(n -> n > 0)
                .reduce(0, Integer::sum);
    }

    // Solution 2 - with sum()
    private static int sum2(int[] arr) {
        return Arrays.stream(arr)
                .filter(n -> n > 0)
                .reduce(0, Integer::sum);
    }

    // Solution  3
    private static int sum3(int[] arr) {
        int sum = 0;

        for (int i : arr)
            if (i > 0) sum += i;

        return sum;
    }
}
