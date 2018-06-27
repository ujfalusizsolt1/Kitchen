package com.codecool.kitchen;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private final List<Cook> cooks = new ArrayList<>();

    private Chef chef;

    private List<KitchenHelper> kitchenHelpers = new ArrayList<>();

    private void hire(Cook cook){
        cooks.add(cook);
    }

    private void hire(Chef newChef){
        chef = newChef;
    }

    private void hire(KitchenHelper kitchenHelper) {
        kitchenHelpers.add(kitchenHelper);
    }

    public static void main(String[] args) {
        Restaurant firstRestaurant = new Restaurant();
        firstRestaurant.hire(new Chef("Chefman",1990,1223445));
        firstRestaurant.hire(new Cook("Lajos", 1970,12345));
        firstRestaurant.hire(new KitchenHelper("Józsi",1980,10));
        firstRestaurant.hire(new KitchenHelper("Béla", 1985, 10));

        for (int i = 0; i < 10; i++) {
            if(!chefRequest(firstRestaurant)){
                for (KitchenHelper kitchenhelper:firstRestaurant.kitchenHelpers) {
                    kitchenhelper.shout();
                }
            }
        }

    }

    private static boolean chefRequest(Restaurant firstRestaurant) {
        for (KitchenHelper kitchenhelper: firstRestaurant.kitchenHelpers) {
            kitchenhelper.getIngridient();
        }
        firstRestaurant.chef.cook();
        if (firstRestaurant.chef.getRequestedIngridient() == null){
            return true;
        }
        if (firstRestaurant.chef.getRequestedIngridient() != null){
            for (KitchenHelper kitchenhelper: firstRestaurant.kitchenHelpers) {
                if (kitchenhelper.giveRequest(firstRestaurant.chef.getRequestedIngridient())){
                    System.out.println("I got it!");
                    return true;
                }
            }
        }
        return false;
    }
}
