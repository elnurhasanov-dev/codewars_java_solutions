package codewars;

public class GrasshopperPersonalizedMessage {
    public static void main(String[] args) {
        String test1 = greet("Daniel", "Daniel");
        String test2 = greet("Greg", "Daniel");

        System.out.println(test1);
        System.out.println(test2);
    }

    private static String greet(String name, String owner) {
        return "Hello " + (name.equals(owner) ? "boss" : "guest");
    }
}
