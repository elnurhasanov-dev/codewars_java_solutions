package codewars;

import java.util.Arrays;

public class ConvertAstringToAnArray {
    public static void main(String[] args) {
        String[] test1 = stringToArray("I love arrays they are my favorite");
        String[] test2 = stringToArray("My name is John Doe");

        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(test2));
    }

    private static String[] stringToArray(String s) {
        return s.split(" ");
    }
}
