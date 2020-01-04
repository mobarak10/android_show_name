package com.example.joy;

public class MyClass2 {
    public static void main(String[] args){
        String bio = showBio("Joy", "Bangladesh", 24);
        System.out.println(bio);
    }

    public static String showBio(String name, String bio, int age){
        String description = "I am "+ name + " My age is " + age +" I am come from " +bio;

        return description;
    }
}
