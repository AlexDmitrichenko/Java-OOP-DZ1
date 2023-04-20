public class BottleOfMilk extends Product{
    private int volume; 
    private Double richness; 
    
    public BottleOfMilk( String name, String brand, Double richness, int volume, Double price){
        super(name, brand, price);
        this.richness = richness;
        this.volume = volume;
    }
   
    @Override
    String displayInfo() {
        return String.format("%s от %s - Жирность %.1f проц. - Объём %d л. - Цена %.2f руб.", name, brand, richness, volume, price);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Double getRichness() {
        return richness;
    }

    public void setRichness(Double richness) {
        this.richness = richness;
    }
    
}
