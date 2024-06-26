package codewars;

public class ConvertAStringToANumber {
    public static void main(String[] args) {
        int test1 = stringToNumber("1234");
        int test2 = stringToNumber("605");

        System.out.println(test1);
        System.out.println(test2);
    }

    private static int stringToNumber(String str) {
        return Integer.valueOf(str);
    }
}
