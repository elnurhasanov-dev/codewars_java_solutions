package kyu8;

public class IsTheStringUppercase {
    public static void main(String[] args) {
        var test1 = isUpperCase("hello I AM DONALD");
        var test2 = isUpperCase("HELLO I AM DONALD");

        System.out.println(test1);
        System.out.println(test2);
    }

    private static boolean isUpperCase(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
