package com.codecool.kitchen;

public abstract class Worker {
    private String name;
    private final int birthDate;
    private int salary;

    public Worker(String name, int birthDate, int salary) {
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public int tax(){
        return (int)Math.floor(salary * 0.99);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBirthDate() {
        return birthDate;
    }
}
