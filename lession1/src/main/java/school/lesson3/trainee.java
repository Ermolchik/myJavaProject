package school.lesson3;

public class trainee{
    public static void main(String[] arg){
        Employees[] Person = new Employees[5];
        Person[0] = new Employees("Ivanov", "Ivan", "Ivanovoch", "Inneer", "ivanov@gmai.com", "+375291115566", 600, 53);
        Person[1] = new Employees("Ivanov", "Petr", "Zigizmundivich","Trainer", "ivan@mail.ru","+375335256698", 700, 65);
        Person[2] = new Employees("Petrov", "Vasiliy", "Fedorovich", "Driver", "vasill@rambler.ru","80293254312", 800, 40);
        Person[3] = new Employees("Pupkin", "Fedor", "Anisimovich", "Director", "pupok@gmail.com", "375333565578", 2000, 37);
        Person[4] = new Employees("Ukupnik", "Arkadiy", "Sergeevich", "Tamada","sergeyuk@mail.ru", "+375297235419", 1000, 39);
        for (Employees employees : Person)
            if(employees.getAge()>40)
                System.out.println(employees.display());
        }
}