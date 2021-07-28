package school.lesson3;

public class trainee{
    public static void main(String[] arg){
        Employees[] newPerson = new Employees[5];
        newPerson[0] = Employees ("Ivanov", "Ivan", "Ivanovoch", "Inneer", "ivanov@gmai.com", "+375291115566", 600, 53);
        newPerson[1] = Employees ("Ivanov", "Petr", "Zigizmundivich","Trainer", "ivan@mail.ru","+375335256698", 700, 65);
        newPerson[2] = Employees ("Petrov", "Vasiliy", "Fedorovich", "Driver", "vasill@rambler.ru","80293254312", 800, 39);
        newPerson[3] = Employees ("Pupkin", "Fedor", "Anisimovich", "Director", "pupok@gmail.com", "375333565578", 2000, 37);
        newPerson[4] = Employees ("Ukupnik", "Arkadiy", "Sergeevich", "Tamada","sergeyuk@mail.ru", "+375297235419", 1000, 39);
    }

}