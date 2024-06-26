package codewars;

public class ReversedString {
    public static void main(String[] args) {
        String test1 = solution("world");
        String test2 = solution("Elnur");

        System.out.println(test1);
        System.out.println(test2);
    }

    private static String solution(String str) {
        String reversedStr = "";

        for (int i = 0; i < str.length(); i++) {
            reversedStr = str.charAt(i) + reversedStr;
        }
        return reversedStr;
    }
}
