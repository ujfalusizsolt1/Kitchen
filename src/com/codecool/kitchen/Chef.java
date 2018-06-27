package com.codecool.kitchen;

import java.util.Random;

public class Chef extends KnifeUserEmployee implements Cooker {

    public Ingridient getRequestedIngridient() {
        return requestedIngridient;
    }

    private Ingridient requestedIngridient;

    public Chef(String name, int birthDate, int salary) {
        super(name, birthDate, salary);
    }


    public Ingridient hasRequest(){
        System.out.println("Requesting " + requestedIngridient.toString() +"!");
        return requestedIngridient;
    }

    @Override
    public void cook() {
        Random rnd = new Random();
        int choice = rnd.nextInt(10);
        if (choice < 3){
            requestedIngridient = Ingridient.randomIngredient();
            hasRequest();
        }
        else{
            requestedIngridient = null;
            System.out.println("The chef is shouting...again...");
        }
    }
}
