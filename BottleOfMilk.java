public class BottleOfMilk extends Product{
    private Double volume; 
    private Double richness; 
    
    public BottleOfMilk( String name, String brand, Double richness, Double volume, Double price){
        super(name, brand, price);
        this.richness = richness;
        this.volume = volume;
    }
   
    @Override
    String displayInfo() {
        return String.format("%s от %s - Жирность %.1f - Объём %.1f л. - Цена %.2f руб.", name, brand, richness, volume, price);
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getRichness() {
        return richness;
    }

    public void setRichness(Double richness) {
        this.richness = richness;
    }
    
}
