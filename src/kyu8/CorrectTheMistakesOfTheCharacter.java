package kyu8;

public class CorrectTheMistakesOfTheCharacter {
    public static void main(String[] args) {
        String test1 = correct("J. K. R0WL1NG - HARRY P0TTER AND THE HALF-BL00D PR1NCE");
        String test2 = correct("R0BERT MERLE - THE DAY 0F THE D0LPH1N");

        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);
    }

    // Solution 1
    private static String correct(String str) {
        String correctStr = "";

        for (int i = 0; i < str.length(); i++) {
            char filtered = switch (str.charAt(i)) {
                case '5' -> 'S';
                case '0' -> 'O';
                case '1' -> 'I';
                default -> str.charAt(i);
            };

            correctStr += filtered;
        }

        return correctStr;
    }

    // Solution 2
    public static String correct2(String string) {
        return string
                .replace("5","S")
                .replace("0", "O")
                .replace("1","I");
    }
}
