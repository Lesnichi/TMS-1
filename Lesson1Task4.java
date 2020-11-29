public class Lesson1Task4 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = -30;
        int counterPositive = 0;
        int counterNegative = 0;

        if (a > 0) {
            counterPositive++;
        } else {
            counterNegative++;
        }
        if (b > 0) {
            counterPositive++;
        } else {
            counterNegative++;
        }
        if (c > 0) {
            counterPositive++;
        } else {
            counterNegative++;
        }

        System.out.println("Количество положительных чисел в наборе = " + counterPositive);
        System.out.println("Количество отрицательных чисел в наборе = " + counterNegative);
    }
}