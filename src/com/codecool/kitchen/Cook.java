package com.codecool.kitchen;

public class Cook extends KnifeUserEmployee implements Cooker {
    public Cook(String name, int birthDate, int salary) {
        super(name, birthDate, salary);
    }

    @Override
    public void cook() {
        System.out.println("The cook is working.");
    }
}
