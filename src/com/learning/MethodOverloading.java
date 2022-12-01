package com.learning;

public class MethodOverloading {

    public static void main(String[] args) {

        // METHOD OVERLOADING



        add(4,5,6);
        // add(3.4);
        add(3);
        add(2,3);



    }

    static void add(int N1) {
        System.out.println(N1 + N1);

    }

    static void add(int N1, int N2) {
        System.out.println(N1 + N2);

    }

    static void add(int N1, int N2, int N3) {
        System.out.println(N1 + N2 + N3);

    }
}





