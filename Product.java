public class Product {
    public static final char[] getWeight = null;
    protected String name;
    String brand;
    protected Double price;

    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name.length() < 3)
            this.name = "Товар";
        else
            this.name = name;
    } 
    
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        if (price <= 0.5)
            this.price = 0.5;
        else
            this.price = price;
    }

    public Product(String name, String brand, Double price){
        if (name.length() < 3)
            this.name = "Товар";
        else
            this.name = name;
        this.brand = brand;
        if (price <= 0.5)
            this.price = 0.5;
        else
            this.price = price;
    }
/**
 * Получить информацию по продукту
 * @return Информация по продукту
 */
    String displayInfo(){
        return String.format("%s от %s - Цена руб. %.2f", name, brand, price);
    }

}
