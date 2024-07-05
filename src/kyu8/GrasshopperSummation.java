package kyu8;

import java.util.stream.IntStream;

public class GrasshopperSummation {
    public static void main(String[] args) {
        int test1 = summation(2);
        int test2 = summation2(8);

        System.out.println(test1);
        System.out.println(test2);
    }

    // Solution 1
    private static int summation(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            result += i;
        }
        return result;
    }

    // Solution 2
    private static int summation2(int n) {
        return IntStream.rangeClosed(1,n).sum();
    }
}
