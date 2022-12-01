package com.learning;

public class accessModifier {
    public static void main(String[] args) {

        // access modifiers or Specifier
        // public , private , protected,


        // methods

        methodOne();
        System.out.println(methodTwo(5, 4));  //calling method

        System.out.println(methodThree(5, 5.5));

    }


//methods

        private static void methodOne () {
            System.out.println("METHOD ONE ");


        }

        static int methodTwo ( int n1, int n2){
            return n1 - n2;

        }
        static double methodThree ( double n1, double n2){
            return n2 * n1;


        }


    }







