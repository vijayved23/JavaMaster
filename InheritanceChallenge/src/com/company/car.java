package com.company;

public class car extends Vehicle {
    private int wheels;
    private int doors;



    public car(String name, int size, int wheels, int doors) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;

    }
    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void handSteering(){
        System.out.println("handSteering");
    }

    public void changingGears(){
        System.out.println("Changing gears");
    }







}




