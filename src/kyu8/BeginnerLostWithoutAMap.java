package kyu8;

import java.util.Arrays;

public class BeginnerLostWithoutAMap {
    public static void main(String[] args) {
        int[] test1 = map(new int[]{1, 2, 3});
        int[] test2 = map2(new int[]{-1, 23, 3});

        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(test2));
    }

    private static int[] map(int[] arr) {
        int[] doubledArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
            doubledArr[i] = arr[i] * 2;

        return doubledArr;
    }

    private static int[] map2(int[] arr) {
        return Arrays.stream(arr).map(v -> v * 2).toArray();
    }
}
