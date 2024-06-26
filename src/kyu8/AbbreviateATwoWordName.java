package codewars;

public class AbbreviateATwoWordName {
    public static void main(String[] args) {
        String test1 = abbrevName("Sam Harris");
        String test2 = abbrevName("Patrick Feenan");

        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);
    }

    public static String abbrevName(String name) {
        String[] parts = name.split(" ");

        String firstCharacter = parts[0].substring(0, 1).toUpperCase();
        String secondCharacter = parts[1].substring(0, 1).toUpperCase();

        String result = firstCharacter + "." + secondCharacter;

        return result;
    }
}


