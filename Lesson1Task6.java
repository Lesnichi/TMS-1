public class Lesson1Task6 {

    public static void main(String[] args) {
        int programmers = 221;
        int temp10 = programmers % 10;
        int temp100 = programmers % 100;

        System.out.print("В компании работает " + programmers + " ");
        if ((temp10 == 2 || temp10 == 3 || temp10 == 4) && (temp100 < 10 || temp100 > 20)) {
            System.out.println("программиста");
        } else if (temp10 == 1 && temp100 != 11) {
            System.out.println("программист");
        } else
            System.out.print("опрограммистов");
    }
}
