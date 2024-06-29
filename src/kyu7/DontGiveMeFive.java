package kyu7;

import java.util.stream.IntStream;

public class DontGiveMeFive {
    public static void main(String[] args) {
        int test1 = dontGiveMeFive(1, 9);
        int test2 = dontGiveMeFive(4, 17);

        System.out.println(test1);
        System.out.println(test2);
    }

    // Solution 1
    private static int dontGiveMeFive(int start, int end) {
        return (int) IntStream
                .range(start, end + 1)
                .filter(x -> !String.valueOf(x).contains("5"))
                .count();
    }

    // Solution 2
    private static int dontGiveMeFive2(int start, int end) {
        int ans = 0;
        for (int i = start; i <= end; i++) {
            if (!("" + i).contains("5")) ans++;
        }
        return ans;
    }
}
