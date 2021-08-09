package school.lesson8;

public class Main {


    public static void main(String[] args){

        Phonebook phonebook = new Phonebook();

        System.out.println("Наполняем справочник");
        phonebook.add("Иванов", "+375295631823");
        phonebook.add("Иванов", "+375336581476");
        phonebook.add("Петров", "+375292935823");
        phonebook.add("Сидоров", "+375293325796");
        phonebook.add("Иванов", "+375295948263");
        System.out.println("-----------------");

        System.out.println("Получаем номера");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));
        System.out.println("Сидоров");
        System.out.println(phonebook.get("Сидоров"));
        System.out.println("-----------------");

        System.out.println("Случай отсутствия записи");
        System.out.println("Кузнецов");
        System.out.println(phonebook.get("Кузнецов"));
        System.out.println("-----------------");

        System.out.println("Пробуем записать существующий номер");
        phonebook.add("Иванов", "+375295631823");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
    }




}
