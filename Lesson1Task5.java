public class Lesson1Task5 {

    public static void main(String[] args) {
        int a = 333;
        int temp = 1;
        int counter = 0;


        if (a == 0) {
            System.out.println("Это нуль");
        }
        if (a > 0) {
            System.out.println("Это число является положительным");
        } else {
            System.out.println("Это число является отрицательным");
        }

        if (a < 0) {
            a = -1 * a;
        }

        if (a < 10) {
            System.out.println("Число является однозначным");
        } else if (a >= 10 && a < 100) {
            System.out.println("Число является двухзначным");
        } else {
            System.out.println("Число является трех или более значным");
        }
    }
}
