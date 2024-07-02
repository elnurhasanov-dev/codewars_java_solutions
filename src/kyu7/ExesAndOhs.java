package kyu7;

import java.util.stream.IntStream;

public class ExesAndOhs {
    public static void main(String[] args) {
        boolean test1 = getXO("ooxx");
        boolean test2 = getXO2("xooxx");

        System.out.println(test1);
        System.out.println(test2);
    }

    private static boolean getXO(String str) {
        int countX = 0;
        int countY = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'x') countX++;
            else if (str.toLowerCase().charAt(i) == 'o') countY++;
        }
        return countX == countY ? true : false;
    }

    private static boolean getXO2(String str) {

        long countX = str.toLowerCase().chars().filter(ch -> ch =='x').count();
        long countO = str.toLowerCase().chars().filter(ch -> ch =='o').count();

        return (countO==countX);
    }

}
