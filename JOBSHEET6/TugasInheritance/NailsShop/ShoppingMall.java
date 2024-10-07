package NailsShop;
import MallOlympicGarden.Mall;

public class ShoppingMall extends Mall {
    public String type;

    public ShoppingMall() {
        super(); 
        this.type = "Nail Art";
    }

    public ShoppingMall(String name, String location, int numberOfStores, String type) {
        super(name, location, numberOfStores);
        this.type = type;
    }

    public String getFullInfo() {
        String info = this.getInfo(); 
        info += "Mall Type: " + this.type + "\n"; 
        return info;
    }
}