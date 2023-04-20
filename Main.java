import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new BottleOfWater("Питьевая вода", "ООО Дарида", 1, 1.20);
        System.out.println(product1.displayInfo());

        Product product2 = new BottleOfWater("Газированная вода","ООО Дарида", 2, 1.70);
        System.out.println(product2.displayInfo());

        Product product3 = new BottleOfWater("Миниральная вода", "ООО Фрост", 2, 1.60);
        System.out.println(product3.displayInfo());

        Product product4 = new BottleOfMilk("Молоко", "ОАО Бабушкина крынка", 2.5, 1, 1.80);
        System.out.println(product4.displayInfo());

        Product product5 = new BottleOfMilk("Сливки", "ОАО Молочный мир", 9.0, 1, 2.50);
        System.out.println(product5.displayInfo());

        Product product6 = new BarOfChocolate("Шоколад горький", "ОАО Спартак", 90, 2.30);
        System.out.println(product6.displayInfo());

        Product product7 = new BarOfChocolate("Шоколад молочный", "ОАО Коммунарка", 200, 4.10);
        System.out.println(product7.displayInfo());
        System.out.println();

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);

        VendingMachine machine1 = new VendingMachine(products);
        BottleOfWater botteleOfWoterRes = machine1.getBottleOfWoter("Газированная вода", 2);
        if(botteleOfWoterRes != null ) 
        System.out.printf("Вы купили: ");
        if(botteleOfWoterRes != null){
            System.out.println(botteleOfWoterRes.displayInfo());
        }
        else{
            System.out.println("Такой воды нет в наличии");
        }

        VendingMachine machine2 = new VendingMachine(products);
        BottleOfMilk botteleOfMilkRes = machine2.getBottleOfMilk("Сливки", 1);
        if(botteleOfMilkRes != null && botteleOfWoterRes == null){
            System.out.printf("Вы купили: ");
        }
        if(botteleOfMilkRes != null){
            System.out.println(botteleOfMilkRes.displayInfo());
        }
        else{
            System.out.println("Такого молочного продукта нет в наличии");
        }

        VendingMachine machine3 = new VendingMachine(products);
        BarOfChocolate barOfChocolateRes = machine3.getBarOfChocolate("Шоколад молочный", 100);
        if(botteleOfMilkRes == null && botteleOfWoterRes == null){
            System.out.printf("Вы купили: ");
        }
        if(barOfChocolateRes != null){
            System.out.println(barOfChocolateRes.displayInfo());
        }
        else{
            System.out.println("Такого шоколада нет в наличии");
        }
    } 
}