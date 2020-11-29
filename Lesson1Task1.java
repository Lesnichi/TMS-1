public class Lesson1Task1 {

    public static void main(String[] args) {

        int a = 0;

        if (a > 0) {
            a++;
        } else if (a < 0) {
            a = a - 2;
        } else {
            a = 10;
        }

        System.out.println("a = " + a);

    }
}
