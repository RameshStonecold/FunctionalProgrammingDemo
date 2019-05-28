package com.example.anonymous;


interface Car {

    void move();
    void playMusic();
}

 class CarImpl implements Car{

    public void move() {

        System.out.println("car is moving");
    }

    public void playMusic() {

        System.out.println("Playing Music");
    }
}






public class Anonymous1 {

    public static void main(String[] args){

        CarImpl car = new CarImpl();
        car.move();
        car.playMusic();
    }
}
