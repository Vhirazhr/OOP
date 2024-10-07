package Mall;

import Cafetaria.FoodCourt;
import NailsShop.ShoppingMall;

public class MallDemo {
    public static void main(String[] args) {
        
        ShoppingMall mall1 = new ShoppingMall("Nails Store Mart", "First Floor", 12, "Premium");
        FoodCourt foodCourt1 = new FoodCourt("Food Plaza", "Third Floor", 15, "Asian");

        System.out.println(mall1.getFullInfo());
        System.out.println(); 
        System.out.println(foodCourt1.getFullInfo());

        ShoppingMall mall2 = new ShoppingMall("Office Work Utensil", "Seccond Floor", 5, "Classic");
        System.out.println(mall2.getFullInfo());
    }
}
