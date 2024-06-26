package codewars;

import java.util.Arrays;
import java.util.List;

public class SumMixedArray {
    public static void main(String[] args) {
        int test1 = sum(Arrays.asList(5, "5"));
        int test2 = sum(Arrays.asList(5, "5", 213, "123"));

        System.out.println(test1);
        System.out.println(test2);
    }

    private static int sum(List<?> mixed) {
        return mixed.stream()
                .mapToInt(num -> Integer.parseInt(num.toString()))
                .sum();
    }
}
