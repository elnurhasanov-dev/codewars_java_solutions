package codewars;

import java.util.Arrays;

public class YouOnlyNeedOneBeginner {
    // Solution 1
    private static boolean check(Object[] a, Object x) {
        for(Object v : a)
            if (v == x) return true;

        return false;
    }
    // Solution 2
    private static boolean check2(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }
}
