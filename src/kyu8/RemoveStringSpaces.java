package codewars;

public class RemoveStringSpaces {
    public static void main(String[] args) {
        String test1 = noSpace("8 j 8   mBliB8g  imjB8B8  jl  B");
        String test2 = noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd");

        System.out.println(test1);
        System.out.println(test2);
    }

    private static String noSpace(final String s) {
        return s.replaceAll(" ", "");
    }
}
