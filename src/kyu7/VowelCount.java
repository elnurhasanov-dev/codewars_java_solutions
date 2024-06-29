package kyu7;

public class VowelCount {
    public static void main(String[] args) {
        int test1 = getCount("abracadabra");
        int test2 = getCount2("");

        System.out.println(test1);
        System.out.println(test2);
    }

    // Solution 1
    private static int getCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a'
                    || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    // Solution 2
    private static int getCount2(String str) {
        return (int) str.chars().filter(v -> "aeiou".indexOf(v) > 0).count();
    }
}
