import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new BottleOfWater("Питьевая вода", "ООО Дарида", 1.5, 1.50);
        System.out.println(product1.displayInfo());

        Product product2 = new BottleOfWater("Газированная вода","ООО Дарида", 2.0, 1.70);
        System.out.println(product2.displayInfo());

        Product product3 = new BottleOfWater("Миниральная вода", "ООО Фрост", 1.5, 1.60);
        System.out.println(product3.displayInfo());

        Product product4 = new BottleOfMilk("Молоко", "ОАО Бабушкина крынка", 2.5, 1.0, 1.80);
        System.out.println(product4.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        // VendingMachine machine = new VendingMachine();

    }
    
}