package codewars;

public class RemoveFirstAndLastCharacter {
    public static void main(String[] args) {
        String test1 = remove("eloquent");
        String test2 = remove("country");

        System.out.println(test1);
        System.out.println(test2);
    }

    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }
}
