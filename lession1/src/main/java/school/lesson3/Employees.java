package school.lesson3;

public class Employees {
    String surname;
    String name;
    String patronymic;
    String position;
    String email;
    String phone;
    int salary;
    int age;
}
    public static void main(String[] arg){

}
    public void Employees(String surname, String name, String patronymic, String position, String email, String phone, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }
    public int getAge(){
        return age;        }

    public void printInfo(){
        System.out.println(surname);

        System.out.println(name);

        System.out.println(patronymic);

        System.out.println(position);

        System.out.println(email);

        System.out.println(phone);

        System.out.println(salary);

        System.out.println(age);}



}


