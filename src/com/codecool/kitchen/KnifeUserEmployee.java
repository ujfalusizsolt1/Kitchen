package com.codecool.kitchen;

public abstract class KnifeUserEmployee extends Worker {
    private boolean hasKnife= false;

    public KnifeUserEmployee(String name, int birthDate, int salary) {
        super(name, birthDate, salary);
    }

    public boolean hasReceivedKnife(){
        return hasKnife;
    }

    public void receiveKnife() {
        if(hasKnife) {
            RuntimeException e = new RuntimeException();
            throw  e;
        }

        hasKnife = true;


    }
}
