package school.lesson1;

public class myHomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        compareNumbers();
    }
    public static void printThreeWords() {

        System.out.println("Orange");

        System.out.println("Banana");

        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 33;
        int b = 67;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        else{
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 99;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value >0 && value <= 100) {
            System.out.println("Желтый");
        }
        else{
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbers() {
        int a = 20;
        int b = 36;
        if (a >= b) {
            System.out.println("a>=b");
        }
        else{
            System.out.println("a<b");
        }
    }
}
