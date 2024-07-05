package kyu8;

public class BasicMathematicalOperations {
    public static void main(String[] args) {
        int test1 = basicMath("+", 1, 2);
        int test2 = basicMath("+", 1, 2);

        System.out.println(test1);
        System.out.println(test2);

    }

    public static Integer basicMath(String op, int v1, int v2) {
        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "*":
                return v1 * v2;
            case "/":
                return v1 / v2;
            default:
                return 0;
        }
    }
}
