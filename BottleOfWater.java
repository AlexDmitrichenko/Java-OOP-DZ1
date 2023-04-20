public class BottleOfWater extends Product{
    private int volume; 
    
    public BottleOfWater( String name, String brand, int volume, Double price){
        super(name, brand, price);
        this.volume = volume;
    }
   
    @Override
    String displayInfo() {
        return String.format("%s от %s - Объём %d л. - Цена %.2f руб.", name, brand, volume, price);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
