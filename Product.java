public class Product {
    private String name;
    String brand;
    private Double price;
    Double volume;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    } 

    {
        volume = 1.5;
    }

    public Product(){
        this("Миниральная вода", "ООО Фрост", 1.5, 1.60);
    }

    public Product(String name, String brand, Double volume, Double price){
        if (name.length() < 3)
            this.name = "Товар";
        else
            this.name = name;
        this.brand = brand;
        this.volume = volume;
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
        return String.format("%s - %s - Объём л. %.1f - Цена руб. %.2f", name, brand, volume, price);
    }

}
