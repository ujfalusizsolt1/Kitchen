package com.codecool.kitchen;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class KitchenHelper extends Worker {

    private Map<Ingridient, Integer> ingredients = new HashMap<>();

    public KitchenHelper(String name, int birthDate, int salary) {
        super(name, birthDate, salary);
        for (Ingridient ingridient: Ingridient.values()) {
            ingredients.put(ingridient, 0);
        }
    }

    public void getIngridient() {
        Random rnd = new Random();
        for (Ingridient ingridient: Ingridient.values()) {
            ingredients.put(ingridient, rnd.nextInt(4));
        }
    }
    
    public boolean giveRequest(Ingridient request){
        if (ingredients.get(request) > 0 ) {
            ingredients.replace(request,ingredients.get(request)-1);
            System.out.println("I have it!");
            return true;
        }
        System.out.println("I don't have it!");
        return false;
    }
    
    public void shout(){
        System.out.println("We are all out!");
    }
    
    
}
