package com.example.joy;

public class Microphone {
    // instance variable / properties / fields
    String name;
    String color;
    int model;

    public void turnOff(){
        System.out.println(this.name + " Turn Off");
    }
    public void turnOn(){
        System.out.println(this.name + " Turn On");
    }
    public void setVolume(){
        System.out.println(this.name + " Setting Volume");
    }
}
