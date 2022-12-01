package com.learning;

public class methodOverriding {
    public static void main(String[] arg){

        // method overriding

        B1 obj = new B1();
        obj.A1class();


    }
}

class A1 {
    void A1class(){
        System.out.println("this is A1 class ");

    }
}

class B1 extends A1 {
    @Override  // Anatation

    void A1class(){
        System.out.println("this is B1 class ");

    }
}





