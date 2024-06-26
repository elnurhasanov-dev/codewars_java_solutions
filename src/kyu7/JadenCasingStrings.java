package codewars;

public class JadenCasingStrings {
    public static void main(String[] args) {
        String test1 = toJadenCase("How can mirrors be real if our eyes aren't real");
        String test2 = toJadenCase("");

        System.out.println(test1);
        System.out.println(test2);
    }

    private static String toJadenCase(String phrase) {
        if (phrase == null || phrase.equals("")) return null;

        String[] temStr = phrase.split(" ");
        String[] cased = new String[temStr.length];

        for (int i = 0; i < temStr.length; i++) {
            cased[i] = temStr[i].substring(0, 1).toUpperCase() +
                    temStr[i].substring(1);
        }

        return String.join(" ", cased);
    }
}
