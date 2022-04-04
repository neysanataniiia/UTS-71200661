package org.example;

public class Engine {
    private String fuelType;
    private int capacity;

    public Engine(String fuelType, int capacity) {
        this.fuelType = fuelType;
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

    public String getFuelType(){
        return fuelType;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;

    }

    public void setFuelType(String FuelType){
        this.fuelType = FuelType;
    }
}
