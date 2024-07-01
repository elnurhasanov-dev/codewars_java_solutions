package kyu7;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static void main(String[] args) {
        int test1 = sortDesc(42145);
        int test2 = sortDesc(123456789);

        System.out.println(test1);
        System.out.println(test2);
    }

    private static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }

}


