package codewars;

public class TheFeastOfManyBeasts {
    public static void main(String[] args) {
        boolean test1 = feast("great blue heron", "garlic nann");
        boolean test2 = feast("brown bear","bear claw");

        System.out.println(test1);
        System.out.println(test2);
    }

    private static boolean feast(String beast, String dish) {
        char beastStart = beast.charAt(0);
        char beastEnd = beast.charAt(beast.length() - 1);
        char dishStart = dish.charAt(0);
        char dishEnd = dish.charAt(dish.length() - 1);

        return beastStart == dishStart && beastEnd == dishEnd;
    }
}
