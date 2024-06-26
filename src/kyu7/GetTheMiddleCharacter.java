package codewars;

public class GetTheMiddleCharacter {
    public static void main(String[] args) {
        String test1 = getMiddle("test");
        String test2 = getMiddle("testing");

        System.out.println(test1);
        System.out.println(test2);
    }

    private static String getMiddle(String word) {
        double modules = word.length() % 2;
        int division = word.length() / 2;

        return modules == 0 ?
                word.substring(division - 1, division + 1) :
                word.substring(division, division + 1);
    }
}
