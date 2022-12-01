package com.learning;

class mainlinks {
    public static void main(String[] args) {


        //classes & objects

        NewClass object = new NewClass();
        object.example();
        System.out.println(object.add(55, 5));

    }
}



public class NewClass {
        //classes & objects

        void example () {
            System.out.println(" Example Class");

        }

        int add ( int a, int b){

            return a + b;

        }
    }







