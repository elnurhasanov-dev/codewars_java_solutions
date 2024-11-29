package kyu8;

public class DoIgetAbonus {
    public static void main(String[] args) {
        String test1 = bonusTime(10000, true);
        String test2 = bonusTime(60000, false);

        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);
    }

    private static String bonusTime(final int salary, final boolean bonus) {
        int total = bonus ? salary * 10 : salary;
        return "£" + total;
    }
}
