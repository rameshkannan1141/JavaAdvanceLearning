package com.learning;

public class innerclass {
    public static void main(String[] arg){

        // inner class

        s1 obj = new s1();

        obj.s1m();

        s1.s2 obj1 = obj.new s2();
        obj1.s2m();

    }

}

class s1{

    void s1m(){
        System.out.println("s1");

    }

    class s2{
        void s2m(){
            System.out.println("s2");
        }

    }
}
