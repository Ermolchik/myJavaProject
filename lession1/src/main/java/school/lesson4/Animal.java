package school.lesson4;

public class Animal {
    public String name;
    public int run;

    public Animal(String name) {
        this.name = name;

        public void animalInfo(){
            System.out.println("Животное" + name);

        }
        public void run(){
            System.out.println("пробежал" + " " + this.run + "м");
        }

    }
}

