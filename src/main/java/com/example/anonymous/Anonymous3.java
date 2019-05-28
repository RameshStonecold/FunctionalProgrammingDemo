package com.example.anonymous;


@FunctionalInterface
interface Car3{
// Functional Interface allows only single abstract method


    //void move();
    void playMusic();
}


public class Anonymous3 {

// Lamda Expression works on Functional Interface
    public static void main(String[] args){

        Car3 car3= ()-> System.out.println("Playing Music ");

        car3.playMusic();

    }
}








  /*     ExecutorService threadPool = Executors.newFixedThreadPool(5);

        Runnable calculateTax = new Runnable() {

            public void run() {
                System.out.println("Thread started");
            }
        };

        threadPool.submit(calculateTax);*/