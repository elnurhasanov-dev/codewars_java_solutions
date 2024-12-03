package kyu6;

public class StopgninnipSMysdroW {
    public static void main(String[] args) {
        String test = spinWords("Hey fellow warriors");

        System.out.println(test);
    }

    private static String spinWords(String sentence) {
        var strings = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            String word = strings[i];
            if (word.length() >= 5) {
                sb.append(new StringBuilder(word).reverse());
            } else {
                sb.append(word);
            }

            if (i < strings.length - 1) {
                sb.append(" ");
            }
        }


        return sb.toString();
    }
}
