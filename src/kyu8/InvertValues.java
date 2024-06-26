package codewars;

import java.util.Arrays;

public class InvertValues {
    public static void main(String[] args) {
        int[] test1 = Kata.invert(new int[]{1, 2, 3, 4, 5});
        int[] test2 = Kata.invert(new int[]{1, -2, 3, -4, 5});

        // Output
        System.out.println("test1: " + Arrays.toString(test1));
        System.out.println("test2: " + Arrays.toString(test2));
    }

    // Solution
    class Kata {
        public static int[] invert(int[] array) {
            int[] newArr = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                newArr[i] = -array[i];
            }
            return newArr;
        }
    }
}
