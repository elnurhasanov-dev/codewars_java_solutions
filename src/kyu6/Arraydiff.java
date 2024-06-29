package kyu6;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Arraydiff {
    public static void main(String[] args) {
        int[] test1 = arrayDiff(new int[]{1, 2}, new int[]{1});
        int[] test2 = arrayDiff2(new int[]{1, 2, 2, 2, 3}, new int[]{2});

        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(test2));

    }

    // Solution 1
    private static int[] arrayDiff(int[] a, int[] b) {
        Set<Integer> bSet = Arrays.stream(b).boxed().collect(Collectors.toSet());

        int[] result = Arrays.stream(a)
                .filter(num -> !bSet.contains(num))
                .toArray();

        return result;
    }

    // Solution 2
    private static int[] arrayDiff2(int[] a, int[] b) {
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        listA.removeAll(listB);

        return listA.stream().mapToInt(e -> e).toArray();
    }
}
