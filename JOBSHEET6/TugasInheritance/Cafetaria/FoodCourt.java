package Cafetaria;
import MallOlympicGarden.Mall;

public class FoodCourt extends Mall {
    public String cuisineType;

    public FoodCourt() {
        super(); 
        this.cuisineType = "Unknown Cuisine";
    }

    public FoodCourt(String name, String location, int numberOfStores, String cuisineType) {
        super(name, location, numberOfStores);
        this.cuisineType = cuisineType;
    }

    public String getFullInfo() {
        String info = this.getInfo(); 
        info += "Cuisine Type: " + this.cuisineType + "\n"; 
        return info;
    }
}
