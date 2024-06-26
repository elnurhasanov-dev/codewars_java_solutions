package codewars;

public class AreYouPlayingBanjo {
    public static void main(String[] args) {
        String test1 = areYouPlayingBanjo("Rick");
        String test2 = areYouPlayingBanjo("Morty");

        System.out.println(test1);
        System.out.println(test2);
    }

    public static String areYouPlayingBanjo(String name) {
        return name + (name.substring(0, 1).toLowerCase().equals("r") ?
                " plays banjo" : " does not play banjo");
    }
}
