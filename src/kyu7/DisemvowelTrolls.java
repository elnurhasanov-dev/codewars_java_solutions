package kyu7;

import java.util.stream.Collectors;

public class DisemvowelTrolls {
    public static void main(String[] args) {
        String test1 = disemvowel("This website is for losers LOL!");
        String test2 = disemvowel("What are you, a communist?");

        System.out.println(test1);
        System.out.println(test2);
    }

    private static String disemvowel(String str) {
        return str.toLowerCase().chars()
                .filter(ch -> "euioaEUIOA".indexOf(ch) == -1)
                .mapToObj(ch -> String.valueOf((char) ch))
                .collect(Collectors.joining());
    }
}
