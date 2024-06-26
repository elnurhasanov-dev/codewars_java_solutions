package codewars;

public class ConvertANumberToAString {
    public static void main(String[] args) {
        String test1 = numberToString(1234);
        String test2 = numberToString(605);

        System.out.println(test1);
        System.out.println(test2);
    }

    public static String numberToString(int num) {
        return String.valueOf(num);
    }
}
