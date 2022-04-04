package org.example;

public class Truck extends MotorVehicle {
    private int capacity;


    public Truck(MotorVehicle motorvehicle, Engine dieselEngine, Transmision manualTransmision, Tire trailTire, Wheel truckWheel, int i) {

    }


    public void backward(){}

    public void brake(){}

    public void forward(){}

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void turnLeft(){}

    public void turnRight(){}
}
