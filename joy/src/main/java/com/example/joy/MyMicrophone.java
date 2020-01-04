package com.example.joy;

public class MyMicrophone {
    public static void main(String[] args){
        Microphone microphone = new Microphone();

        microphone.name = "Asus";
        microphone.color = "Blue";
        microphone.model = 1221;

//        System.out.println(microphone);
        microphone.turnOn();
        microphone.setVolume();
        microphone.turnOff();
    }
}
