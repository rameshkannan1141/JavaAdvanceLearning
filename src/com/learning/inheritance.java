package com.learning;

public class inheritance {
  public static void main(String[] arg) {

        // inheritance
        // similar codes write one time


        sub S = new sub();
        S.runadd();
        S.runsub();


        multi M = new multi();
        M.runadd();
        M.runsub();
        M.runmulti();



    }

}

class add {    // super ,  parent
    add(){

    }


    add(int a , int b){
        System.out.println(a+b);

    }

    void runadd(){

        System.out.println(" This is add class ");
    }
}

class sub extends add {   //  sub class , child        // normal

    void runsub(){

        System.out.println(" This is sub class ");
    }


}

class multi extends sub {           // multiple
    void runmulti (){

        System.out.println( " This is multi class");

    }

}

class dev extends add {              // hierarical inheritance
    void rundev (){

        System.out.println( " This is dev class");

    }

}

/*
class e extends sub , add {  // multi level  inheritance  not support to java


} */



