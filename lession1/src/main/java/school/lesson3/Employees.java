package school.lesson3;

public class Employees{
    String surname;
    String name;
    String patronymic;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Employees(String surname, String name, String patronymic, String position, String email, String phone, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    public void printInfo(){
        System.out.println(surname);

        System.out.println(name);

        System.out.println(patronymic);

        System.out.println(position);

        System.out.println(email);

        System.out.println(phone);

        System.out.println(salary);

        System.out.println(age);}

        public static void newEmployees(){
        String[] persArray = new String[5];
        persArray[0]= new String("Ivanov Ivan Ivanovoch", "Inneer", "ivanov@gmai.com", "+375291115566", "600", "53");
        String
        }


}


