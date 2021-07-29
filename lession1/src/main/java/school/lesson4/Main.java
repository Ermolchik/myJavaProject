package school.lesson4;

public class Main {

    public static void main(String[] args) {
        Cat Barsik = new Cat("Barsik", 200);
        System.out.println(Barsik.name + " "+"пробежал"+" " + Barsik.run+"м");
        Dog Bobik = new Dog("Bobik", 500,10);
        System.out.println(Bobik.name + " "+ "пробежал" + " " + Bobik.run +"м" +" " + "проплыл" + " " + Bobik.swimming +"м");
    }
}