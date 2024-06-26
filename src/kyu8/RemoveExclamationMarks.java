package codewars;

public class RemoveExclamationMarks {
    public static void main(String[] args) {
        String test1 = removeExclamationMarks("Hi!");
        String test2 = removeExclamationMarks("No!");

        System.out.println(test1);
        System.out.println(test2);
    }

    private static String removeExclamationMarks(String s) {
        return s.replace("!", "");
    }
}
