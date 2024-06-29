package kyu7;

import java.util.Arrays;

public class TheHighestProfitWins {
    public static void main(String[] args) {
        int[] test1 = minMax(new int[]{1, 2, 3, 4, 5});
        int[] test2 = minMax2(new int[]{1});

        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(test2));
    }

    // Solution 1
    private static int[] minMax(int[] arr) {
        Arrays.sort(arr);
        return new int[]{arr[0], arr[arr.length - 1]};
    }

    // Solution 2
    private static int[] minMax2(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        return new int[]{min, max};
    }
}
