package kyu8;

import java.util.Arrays;

public class SumArrays {
    public static void main(String[] args) {
        double test1 = sum(new double[]{1, 5.2, 4, 0, -1});
        double test2 = sum2(new double[]{2, 2, 1, 2, 1, 3});

        System.out.println(test1);
        System.out.println(test2);
    }

    // Solution 1
    private static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }

    // Solution 2
    private static double sum2(double[] numbers) {
        double result = 0;

        for (double value : numbers) result += value;

        return result;
    }
}
