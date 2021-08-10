package school.lesson4_3;

import java.io.IOException;
import java.util.Scanner;

public class Payment {

    public String name;
    public Product[] prodArray;
    public int cost;

    public class Product {
        public String productName;
        public int productCost;

        public Product() {
            super();
            productName = " ";
            productCost = 0;
        }

        public Product(String productName, int productCost) {
            super();
            this.productName = productName;
            this.productCost = productCost;
        }

        public String getProductName() {
            return this.productName;
        }

        public int getProductCost() {
            return this.productCost;
        }
    }

    public Payment() {
        super();
        this.name = " ";
        this.cost = 0;
    }

    public Payment(String name) {
        super();
        this.name = name;
    }

    public void setPayment() throws IOException {
        this.cost = 0;
        System.out.println("Введите количество товара:");
        Scanner br = new Scanner(System.in);
        try {
            int dim = br.nextInt();
            prodArray = new Product[dim];
            for (int i = 0; i < dim; i++) {
                System.out.println("Товар " + (i + 1) + ": ");
                System.out.print("Наименование: ");
                String str_name = br.next();
                System.out.print("Цена: ");
                int prod_cost = br.nextInt();
                prodArray[i] = new Product(str_name, prod_cost);
                this.cost = this.cost + prodArray[i].productCost;
            }


    }
        catch (NumberFormatException e)

    {
        System.out.println("Неверный формат");
    }

        catch(NegativeArraySizeException e)

    {
        System.out.println("Размерность массива не может быть < 0");
    }
    catch(NullPointerException e)

    {
        System.out.println();
        System.out.println("Массив не создан");
    }
}
    public void printCheque() throws IOException {
        try{
            if(this.prodArray.length != 0){
                System.out.println("============================");
                System.out.println(" " + this.name);
                System.out.println("============================");
                for(int i = 0; i < this.prodArray.length; i++) {
                    System.out.printf("%3d", i+1);
                    System.out.printf("%15s", this.prodArray[i].productName);
                    System.out.printf("%10d", this.prodArray[i].productCost);
                    System.out.println();
                }
                System.out.println("============================");
                System.out.print("Общая стоимость: ");
                System.out.printf("%11d", this.cost);
                System.out.println();
                System.out.println("============================");
            }
            else {
                System.out.println();
                System.out.println("Массив не создан");
            }
        }
        catch(NullPointerException e){
            System.out.println();
            System.out.println("Массив не создан");
        }
}
}
