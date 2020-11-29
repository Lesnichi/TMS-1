public class Lesson1Task3 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;
        int counter = 0;

        if (a > 0) {
            counter++;
        }
        if (b > 0) {
            counter++;
        }
        if (c > 0) {
            counter++;
        }

        System.out.println("Количество положительных чисел в наборе = " + counter);
    }
}
