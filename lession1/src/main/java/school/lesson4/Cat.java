package school.lesson4;

public class Cat extends Animal {

        public Cat(String name, int run){
        this.name=name;
        this.run=run;
}
public void catInfo(){
                System.out.println("Кот"+ " " + name);
}

public void runCat(){
    System.out.println("Кот"+ " " + name +" " + "пробежал" + " " + run + "м");
}

        }

