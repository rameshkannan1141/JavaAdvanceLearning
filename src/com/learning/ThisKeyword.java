package com.learning;

public class ThisKeyword {

    public static void main(String[] arg){

        // THIS keyword

        This obj = new This(101);
        System.out.println(obj.N1);

    }
}

class This {

    int N1;

    public This(int N1) {
        this.N1 = N1;


    }

}
