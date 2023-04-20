public class BarOfChocolate extends Product{
    private int weight; 
    
    public BarOfChocolate( String name, String brand, int weight, Double price){
        super(name, brand, price);
        this.weight = weight;
    }
   
    @Override
    String displayInfo() {
        return String.format("%s от %s - Вес %d гр. - Цена %.2f руб.", name, brand, weight, price);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
}
