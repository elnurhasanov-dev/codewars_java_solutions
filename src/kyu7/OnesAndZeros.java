package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class OnesAndZeros {
    public static void main(String[] args) {
        ArrayList<Integer> binaryList1 = new ArrayList<>(
                Arrays.asList(0, 0, 0, 1));

        ArrayList<Integer> binaryList2 = new ArrayList<>(
                Arrays.asList(0, 0, 1, 0));

        int test1 = ConvertBinaryArrayToInt(binaryList1);
        int test2 = ConvertBinaryArrayToInt(binaryList2);

        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);
    }

    private static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return Integer.parseInt(binary.stream()
                .map(Objects::toString)
                .collect(Collectors.joining("")), 2);
    }
}
