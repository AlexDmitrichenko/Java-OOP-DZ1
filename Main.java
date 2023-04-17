public class Main {
    public static void main(String[] args) {
        // Product product1 = new Product();
        // product1.name = "Питьевая вода";
        // product1.brand = "ООО Дарида";
        // product1.price = 1.50;
        // System.out.println(product1.displayInfo());

        Product product2 = new Product("Газированная вода","ООО Дарида", 2.0, 0.07);
        System.out.println(product2.displayInfo());

        Product product3 = new Product();
        System.out.println(product3.displayInfo());

    }
    
}