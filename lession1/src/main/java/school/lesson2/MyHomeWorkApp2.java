package school.lesson2;

public class MyHomeWorkApp2 {
    public static void main(String[] args) {
        check(5, 20);
        chislo(-20);
        chisloTrueOrFalse(-50);
        strokaChislo("hello", 5);
        massiv();
        massivDva();
        massivTri();
        kvadrat();
    }

    public static boolean check(int a, int b) {
        int summ = a + b;
        if (summ >= 10 && summ <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void chislo(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static void chisloTrueOrFalse(int b) {
        if (b < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    public static void strokaChislo(String arr, int b) {
        for (b = 0; b < 5; b++) {
            System.out.println(arr);
        }
    }

    public static void massiv() {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 0;
        arr[3] = 0;
        arr[4] = 1;
        arr[5] = 0;
        arr[6] = 1;
        arr[7] = 1;
        arr[8] = 0;
        arr[9] = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.println(arr[6]);
        System.out.println(arr[7]);
        System.out.println(arr[8]);
        System.out.println(arr[9]);

    }

    public static void massivDva() {
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++){
            arr[i]= i+1;}
        System.out.println(arr[92]);

            }
    public static void massivTri(){
        int[] arr = new int[]{1,5,3,2,11,4,5,2,4,8,9,1};
        for(int i = 0; i< arr.length; i++)
            if(arr[i]<6){
                arr[i]*=2;
            }
            }
    public static void kvadrat() {
        int[][] kvad = new int[5][5];
        for (int i = 0; i < 5; i++) {
            kvad[i][i] = 1;
            kvad[i][5 - i - 1] = 1;
        }

    }
}






