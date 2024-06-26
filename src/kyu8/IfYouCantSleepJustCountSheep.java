package codewars;

public class IfYouCantSleepJustCountSheep {
    public static void main(String[] args) {
        String test1 = countingSheep(3);
        String test2 = countingSheep(5);

        System.out.println(test1);
        System.out.println(test2);
    }

    private static String countingSheep(int num) {
        String result = "";

        for (int i = 1; i <= num; i++) {
            result += i + " sheep...";
        }

        return result;
    }
}
