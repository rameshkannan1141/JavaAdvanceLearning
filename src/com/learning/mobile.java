package com.learning;

class mainlinks2 {
    public static void main(String[] args) {


        // example codings for constructor

        mobile REDMI = new mobile();
        // REDMI.rate = 10000;
        REDMI.color = " white";


        mobile realme = new mobile(20000, "blue");
        //realme.rate = 20000;
        // realme.color = "Black";

        mobile samsung = new mobile(29999,"orange");

        System.out.println("REDMI");
        System.out.println(REDMI.color);
        System.out.println(REDMI.rate);
        REDMI.proccessor();


        System.out.println("realme");
        System.out.println(realme.color);
        System.out.println(realme.rate);
        realme.proccessor();


        System.out.println(samsung.rate);

        System.out.println(samsung);

    }
}


public class mobile {

     //example codings  for constructor


        int rate ;
        String color ;

        void proccessor() {
            System.out.println("Snapdragon");
        }



        // Constructor.
        // class name is same to constructor
        // constructor is created by automatecally


        // defoul values
        mobile() {
            rate = 2000;
            color = "black";
            System.out.println("defoult constructor");
        }

        // another one

        mobile( int R , String C) {
            rate = R ;
            color = C ;
        }
        mobile( int one ){
            rate=one;


        }

    }











