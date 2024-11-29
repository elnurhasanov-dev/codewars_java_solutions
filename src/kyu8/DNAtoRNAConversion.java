package kyu8;

public class DNAtoRNAConversion {
    public static void main(String[] args) {
        String test1 = bio("TTTT");
        String test2 = bio("GCAT");

        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);
    }

    private static String bio(String str) {
        return str.replace("T", "U");
    }
}
