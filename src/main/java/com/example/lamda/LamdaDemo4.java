package com.example.lamda;

//Lamda Expression with single parameter and return type


@FunctionalInterface
interface Car{

    String move();
}

@FunctionalInterface
interface SpeedLimit{

    int speed(int a);

}


public class LamdaDemo4 {


    public static void main(String[] args) {
        int kmph = 100;

      /*  //Instead of writing this statement use below expression

         SpeedLimit speedLimit = (a)->{
          return  speed;
        };
      */

        SpeedLimit speedLimit = (a)->a;    // This is expression

        Car car = ()-> "Car is moving with speed limit of ";

        System.out.println(car.move()+":"+speedLimit.speed(kmph));
    }
}
