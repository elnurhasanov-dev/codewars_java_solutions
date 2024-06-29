package kyu7;

import java.util.Arrays;
import java.util.List;

public class SmallEnoughBeginner {
    public static void main(String[] args) {
        boolean test1 = smallEnough(new int[]{66, 101}, 200);
        boolean test2 = smallEnough2(new int[]{78, 117, 110, 99, 104, 117, 107, 115}, 100);

        System.out.println(test1);
        System.out.println(test2);
    }

    // Solution 1
    private static boolean smallEnough(int[] a, int limit) {
        return Arrays.stream(a).allMatch(v -> v <= limit);
    }

    // Solution 2
    private static boolean smallEnough2(int[] a, int limit) {
        for (int n : a)
            if (n > limit) return false;
        return true;
    }
}
