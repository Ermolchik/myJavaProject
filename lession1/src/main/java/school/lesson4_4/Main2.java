package school.lesson4_4;

public class Main2 {
    public static void main(String[] args){

        Cat cat = new Cat("кошка Муся",200,0);

        Dog dog = new Dog("собака Бобик",500,10);
        cat.run();
        dog.run();
        cat.swim();
        dog.swim();

    }
}
