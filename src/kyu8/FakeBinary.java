package codewars;

public class FakeBinary {
    public static void main(String[] args) {
        String test1 = fakeBin("45385593107843568");
        String test2 = fakeBin("509321967506747");

        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);
    }

    public static String fakeBin(String numberString) {
        String fakeBin = "";

        for (int i = 0; i < numberString.length(); i++) {
            char ch = numberString.charAt(i);

            if (ch < '5') fakeBin += "0";
            else fakeBin += "1";
        }

        return fakeBin;
    }
}
