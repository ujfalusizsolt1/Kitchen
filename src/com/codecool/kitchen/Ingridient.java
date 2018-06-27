package com.codecool.kitchen;

import java.util.Random;

public enum Ingridient {

    CARROT,
    POTATO,
    MEAT;

    private static final Random random = new Random();

    public static Ingridient randomIngredient(){
        final Ingridient[] all = values();
        return all[random.nextInt(all.length)];
    }
}
