package com.example.lamda;


import java.util.Arrays;
import java.util.List;

public class LamdaDemoList {

    public static void main(String[] args) {


        List<String> names = Arrays.asList("Hari","Ramu", "Somu");


     /*   // This is external ForLoop old method
       for (int i =0; i<names.size(); i++){
           System.out.println(names.get(i));

       }
        */

     /*  //This is advanced ForLoop iterating list

        for (String name : names){
           System.out.println(name);
       }
      */



       /* // This is using Lamda Expression with body
       names.forEach(
                (x)->System.out.println(names)
        );
        */



      /*  //This is internal forEach advanced loop using Lamda Expression
         names.forEach( x->System.out.println(names) );

       */


         //Finally , this is short form using Method reference ::
        names.forEach(System.out::println);

    }
}
