package org.example;

public class Wagon extends Vehicle{
    private String pullers;
    private Wheel wheel;

    public String getPullers(){
        return this.pullers;
    }

    public Wheel getWheel(){
        return  this.wheel;
    }

    public void setPullers(String pullers){
        this.pullers = pullers;
    }

    public void setWheel(Wheel wheel){
        this.wheel = wheel;
    }
}
