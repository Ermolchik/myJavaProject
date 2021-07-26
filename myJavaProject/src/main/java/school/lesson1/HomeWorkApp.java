package school.lesson1;

public class HomeWorkApp{
    public static void main(String[] agrs) {
        prinThreeWords();
        checkSumSign();
        printColor();
        compareNumbres();
    }
    public static void prinThreeWords() {

        System.out.println("Orange");

        System.out.println("Banana");

        System.out.println("Apple");
    }
    public static void checkSumSign () {
        int a = 33;
        int b = 67;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        if (c < 0) {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor () {
        int value = 99;
        if (value <= 0) {
            System.out.println("Красный");
        }

        if (value >0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbres () {
        int a = 20;
        int b = 36;
        if (a >= b) {
            System.out.println("a>=b");
        }
        if (a < b) {
            System.out.println("a<b");
        }
    }
}