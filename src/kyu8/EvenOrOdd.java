package codewars;

public class EvenOrOdd {
    public static void main(String[] args) {
        String test1 = evenOrOdd(123);
        String test2 = evenOrOdd(5514);

        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);
    }

    private static String evenOrOdd(int n) {
        return n % 2 == 0 ? "Even" : "Odd";
    }
}
