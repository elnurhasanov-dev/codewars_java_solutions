package kyu7;

import static java.util.Arrays.stream;


public class HighestAndLowest {
    public static void main(String[] args) {
        String test1 = highAndLow("3 1 2 3 4 5");
        String test2 = highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");

        System.out.println(test1);
        System.out.println(test2);
    }

    private static String highAndLow(String numbers) {
        int[] arr = stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int max = stream(arr).max().getAsInt();
        int min = stream(arr).min().getAsInt();

        return max + " " + min;
    }
}
