package com.example.lamda;


//Lamda Expression with no parameter with return type


interface Greetings{

    String sayHello();
}



public class LamdaDemo3 {

  private static String s1 ="Hello";

    public static void main(String[] args) {

        Greetings greetings = ()-> s1;

       System.out.println( greetings.sayHello());

    }
}
