package school.lesson4_4;

public class Animal2 {
    String name;
    int DistanceRun;
    int DistanceSwim;

    public Animal2(String name, double DistanceRun, double DistanceSwim){
       this.name = name;
       this.DistanceRun = (int) DistanceRun;
       this.DistanceSwim = (int) DistanceSwim;
    }
public void run(){
        System.out.println("Животное: " + name +" пробежало "+ DistanceRun +"м");
}
public void swim(){
        System.out.println("Животное: " + name + " проплыло " + DistanceSwim+ "м");
}
}
