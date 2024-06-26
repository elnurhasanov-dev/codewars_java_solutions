package codewars;

public class ReturningStrings {
    public static void main(String[] args) {
        String test1 = greet("John");
        String test2 = greet("Jane");

        System.out.println(test1);
        System.out.println(test2);
    }

    public static String greet(String name) {
        return String.format("Hello, %s how are you doing today", name);
    }
}
