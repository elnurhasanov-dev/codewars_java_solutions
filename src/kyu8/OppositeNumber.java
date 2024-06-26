package codewars;

public class OppositeNumber {
    public static void main(String[] args) {
        int test1 = opposite(-123);
        int test2 = opposite(54);

        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);
    }

    private static int opposite(int n) {
        return -n;
    }
}