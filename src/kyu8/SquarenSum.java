package kyu8;

import java.util.Arrays;

public class SquarenSum {
    public static void main(String[] args) {
        int[] test1 = new int[]{1, 2, 2};
        int[] test2 = new int[]{5, -3, 4};

        System.out.println("Solution 1");
        System.out.println("test1: " + squareSum(test1));
        System.out.println("test2: " + squareSum(test2) + "\n");

        System.out.println("Solution 2");
        System.out.println("test1: " + squareSum2(test1));
        System.out.println("test2: " + squareSum2(test2));
    }

    // Solution 1
    public static int squareSum(int[] n) {
        int squareSum = 0;

        for (int v : n) squareSum += v * v;
        return squareSum;
    }

    // Solution 2
    public static int squareSum2(int[] n) {
        return Arrays.stream(n).map(v -> v * v).sum();
    }
}
