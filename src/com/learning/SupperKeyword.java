package com.learning;

public class SupperKeyword {

    public static void main(String[] arg){

        //  Supper key word

        b Bclass = new b(10,5);

        System.out.println("Multiple");
        c Cclass = new c( 5,5);


    }
}

class  a {    // supper class


    a(){       // this is default value
        System.out.println( "Class a");

    }

    a(int a , int b){
        System.out.println( a+b + "    a add class ");
    }
}



class b extends a {
    b () {
        System.out.println( " Class b");

    }

    b ( int a , int b){

        super(a,b);

        System.out.println( a-b + "    b sub class ");
    }

}

class  c extends b {
    c ( int a , int b) {

        super(a,b);



        System.out.println( a*b + "      c mult class ");
    }
}
