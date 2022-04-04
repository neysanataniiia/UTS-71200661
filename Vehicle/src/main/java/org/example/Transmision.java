package org.example;

public class Transmision {
    private String transType;
    private int numSpeeed;

    public Transmision(String transType, int NumSpeed) {
        this.transType = transType;
        this.numSpeeed = NumSpeed;
    }
    public int getNumSpeeed(){
        return  this.numSpeeed;
    }

    public String getTransType(){
        return  this.transType;
    }

    public void setNumSpeeed(int speeed){

    }

    public void setTransType(String transType){
        this.transType = transType;
    }
}
