package kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Testing123 {
    public static void main(String[] args) {
        List<String> arr1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> arr2 = new ArrayList<>(Arrays.asList("", "", ""));
        List test1 = number(arr1);
        List test2 = number(arr2);

        System.out.println(test1);
        System.out.println(test2);
    }

    private static List<String> number(List<String> lines) {
        return IntStream.range(0, lines.size())
                .mapToObj(i -> (i + 1) + ": " + lines.get(i))
                .collect(Collectors.toList());
    }
}
