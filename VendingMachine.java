import java.util.List;
public class VendingMachine {
    private final List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }

    public BottleOfWater getBottleOfWoter(String name, int volume){
        for(Product product : products){
            if(product instanceof BottleOfWater){              
                if(product.getName() == name && ((BottleOfWater)product).getVolume() == volume){
                    return (BottleOfWater) product;
                }
            }
        }
        return null;
    }
    public BottleOfMilk getBottleOfMilk(String name, int volume){
        for(Product product : products){
            if(product instanceof BottleOfMilk){              
                if(product.getName() == name && ((BottleOfMilk)product).getVolume() == volume){
                    return (BottleOfMilk) product;
                }
            }
        }
        return null;
    }
    public BarOfChocolate getBarOfChocolate(String name, int weight){
        for(Product product : products){
            if(product instanceof BarOfChocolate){              
                if(product.getName() == name && ((BarOfChocolate)product).getWeight() == weight){
                    return (BarOfChocolate) product;
                }
            }
        }
        return null;
    }
}
