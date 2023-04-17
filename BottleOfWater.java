public class BottleOfWater extends Product{
    private Double volume; 
    
    public BottleOfWater( String name, String brand, Double volume, Double price){
        super(name, brand, price);
        this.volume = volume;
    }
   
    @Override
    String displayInfo() {
        return String.format("%s от %s - Объём %.1f л. - Цена %.2f руб.", name, brand, volume, price);
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
}
