package org.example;

public class Car {
    private int milage;
    private Engine engine;
    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void displayCar(){
        engine.engineStatus();
        System.out.println("car milage="+milage);
    }
}
