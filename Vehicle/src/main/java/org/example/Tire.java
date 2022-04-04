package org.example;

public class Tire {
    private String tireType;
    private int width;
    private int aspectRatio;
    private int wheelDiameter;

    public Tire(String tireType, int width,int aspectRatio,int wheelDiameter  ) {

    }
    public int getAspectRatio(){
        return this.aspectRatio;
    }

    public String getTireType(){
        return  this.tireType;
    }

    public int getWheelDiameter(){
        return this.wheelDiameter;
    }

    public int getWidth(){
        return width;
    }

    public void setAspectRatio(int aspectRatio){
        this.aspectRatio = aspectRatio;
    }

    public void setTireType(String tireType){
        this.tireType = tireType;
    }

    public void setWheelDiameter(int wheelDiameter){
        this.wheelDiameter = wheelDiameter;
    }

    public void setWidth(){
        this.width = width;
    }

}
