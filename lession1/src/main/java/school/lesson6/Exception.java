package school.lesson6;

public class Exception {
    public static void main(String[] args) throws MyArraySizeException,MyArrayDataException{

        String[][] Arr = {{"3", "7", "z", "1"},{"1", "6", "0", "4"}, {"0", "5", "7", "2"}, {"0", "2", "7", "8"}};

        try {
            System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(Arr) + ".\n");
        }
        catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
    }