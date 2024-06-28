package kyu8;

import java.util.Arrays;

public class CalculateAverage {

    public static void main(String[] args) {
        double test1 = find_average(new int[]{5, 3, 2, 1, 1, 4});
        double test2 = find_average2(new int[]{2, 2, 1, 2, 1, 3});

        System.out.println(test1);
        System.out.println(test2);
    }

    //Solution 1
    public static double find_average(int[] array) {
        return Arrays.stream(array)
                .average()
                .orElse(0);
    }

    // Solution
    public static double find_average2(int[] array) {
        double sum = 0;

        for (int val : array) sum += val;
        return sum / array.length;
    }
}
