package kyu8;

/*
Complete the solution so that it reverses all of the words within the string passed in.
Words are separated by exactly one space and there are no leading or trailing spaces.
Example(Input --> Output):
"The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"
StringsAlgorithms
*/

public class ReversedWords {

    public static void main(String[] args) {
        String test1 = solution("The greatest victory is that which requires no battle");

        System.out.println(test1);
    }

    private static String solution(String str) {
        String reversedStr = "";
        String[] strArr = str.split(" ");

        for (int i = strArr.length - 1; i >= 0; i--) {
            reversedStr += strArr[i];
            if (i != 0) {
                reversedStr += " ";
            }
        }

        return reversedStr;
    }
}

