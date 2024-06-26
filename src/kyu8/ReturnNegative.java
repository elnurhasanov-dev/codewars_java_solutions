package codewars;

public class ReturnNegative {
    public static void main(String[] args) {
        int test1 = makeNegative(-123);
        int test2 = makeNegative(54);

        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);
    }

    private static int makeNegative(final int x) {
        return (x > 0) ? -x : x;
    }
}
