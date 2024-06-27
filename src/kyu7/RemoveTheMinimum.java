package kyu7;

import java.util.Arrays;


public class RemoveTheMinimum {
    public static void main(String[] args) {
        int[] test1 = removeSmallest(new int[]{5, 3, 2, 1, 1, 4});
        int[] test2 = removeSmallest(new int[]{});

        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(test2));
    }

    public static int[] removeSmallest(int[] numbers) {
        if (numbers.length == 0) return new int[]{};

        int min = numbers[0];
        boolean isNotRepeated = true;
        int[] newArr = new int[numbers.length - 1];

        for (int num : numbers) if (min > num) min = num;

        for (int i = 0, k = 0; i < numbers.length; i++) {
            if (numbers[i] == min && isNotRepeated) {
                isNotRepeated = false;
                continue;
            }
            newArr[k++] = numbers[i];
        }

        return newArr;
    }
}
