package org.example;

public class MotorVehicle extends Vehicle{
    private String vehicleName;
    private Engine engine;
    private  Tire tire;
    private Wheel wheel;
    private Transmision transmition;

    public MotorVehicle() {
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Tire getTire(){
        return  this.tire;
    }

    public Transmision getTransmition(){
        return  this.transmition ;
    }

    public String getVehicleName(){
        return this.vehicleName;
    }

    public Wheel getWheel(){
        return this.wheel;
    }

    public void setEngine(Engine engine){
        this.engine = engine;

    }

    public void setTire(Tire tire){
        this.tire =tire;
    }

    public void setTransmition(Transmision transmition){}

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;

    }

    public void setWheel(Wheel wheel){
        this.wheel = wheel;
    }
}
