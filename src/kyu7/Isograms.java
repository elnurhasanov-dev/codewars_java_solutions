package codewars;

public class Isograms {
    public static void main(String[] args) {
        boolean test1 = isIsogram("isIsogram");
        boolean test2 = isIsogram("");

        System.out.println(test1);
        System.out.println(test2);
    }

    private static boolean isIsogram(String str) {
        String tempStr = "";

        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i)).toLowerCase();

            if (!tempStr.contains(s)) tempStr += s;
            else return false;
        }

        return true;
    }
}
/*
    public static boolean  isIsogram(String str) {
        return str.toLowerCase().chars().distinct().count() == str.length();
    };
*/