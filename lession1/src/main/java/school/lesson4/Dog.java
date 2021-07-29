package school.lesson4;

public class Dog extends Animal{
int swimming;

public Dog(String name, int run, int swimming){
    this.name=name;
    this.run=run;
    this.swimming=swimming;
}

public void dogInfo(){
    System.out.println("Собака"+ " " + name);

}
public void runDog(){
    System.out.println("Собака"+ " " + name +" " + "пробежал" + " " + run + "м");
    }
public void swimmingDod(){
    System.out.println("Собака"+ " " + name + " " + "проплыл" + " " + swimming + "м" );
    }
}
