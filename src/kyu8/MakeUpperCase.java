package codewars;

public class MakeUpperCase {
    public static void main(String[] args) {
        String test1 = makeUpperCase("eloquent");
        String test2 = makeUpperCase("country");

        System.out.println(test1);
        System.out.println(test2);
    }

    private static String makeUpperCase(String str){
        return str.toUpperCase();
    }
}
