package com.learning;

public class absract {
    public static void main(String[] arg){

        // Abstract
        // hide unwanted complex things

        //supper class               sub class
             car         obj = new   audi();
        obj.run();
        obj.running();



    }
}

abstract class car{
    void run(){

    }

    abstract void running();   // Declaration  or Creation

}

class audi extends car {   // concrete class or unchangable class or unhidden class

    void running(){    // define

        System.out.println( " Abstract running ");

    }

}
