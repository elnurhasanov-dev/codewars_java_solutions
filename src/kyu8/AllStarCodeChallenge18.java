package codewars;

public class AllStarCodeChallenge18 {
    public static void main(String[] args) {
        int test1 = strCount("Hello", 'o');
        int test2 = strCount("Hello", 'l');

        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);
    }

    private static int strCount(String str, char letter) {
        return (int) str.chars()
                .filter(c -> c == letter)
                .count();
    }
}
