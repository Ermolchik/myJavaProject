package school.lesson4_4;

public class Main2 {
    public static void main(String[] args){

        Cat2 cat2 = new Cat2("кошка Муся",200,0);

        Dog2 dog2 = new Dog2("собака Бобик",500,10);
        cat2.run();
        dog2.run();
        cat2.swim();
        dog2.swim();

    }
}
