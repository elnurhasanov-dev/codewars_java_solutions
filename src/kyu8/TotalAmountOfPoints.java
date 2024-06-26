package codewars;

import java.util.Arrays;

public class TotalAmountOfPoints {
    public static void main(String[] args) {
        String[] matchResults = new String[]{"3:1", "2:2", "0:1", "4:0", "1:1", "3:3", "2:0", "1:2", "2:1", "1:0"};
        int totalPoints = points2(matchResults);
        System.out.println("Total Points: " + totalPoints);
    }

    private static int points(String[] games) {
        return Arrays.stream(games)
                .mapToInt(r -> r.charAt(0) - r.charAt(2))
                .map(m -> m > 0 ? 3 : m == 0 ? 1 : 0)
                .sum();
    }

    private static int points2(String[] games) {
        return Arrays.asList(games)
                .stream()
                .mapToInt(r -> r.charAt(0) - r.charAt(2))
                .map(m -> m > 0 ? 3 : m == 0 ? 1 : 0)
                .sum();
    }
}
