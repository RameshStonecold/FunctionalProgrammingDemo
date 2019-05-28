package com.example.anonymous;


interface Car2 {

    void move();
    void playMusic();

}


public class Anonymous2 {

    // here anonymous inner class provides Car2 interface implementations

    public static void main(String[] args){

        Car2 car2 = new Car2()  {//anonymous inner class
            public void move() {
                System.out.println("Car is Moving and");
            }

            public void playMusic() {

                System.out.println("playing Music");
            }
        };

        car2.move();
        car2.playMusic();

    }
}
