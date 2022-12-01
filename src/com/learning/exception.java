package com.learning;

import java.util.Scanner;

public class exception {


    //  int n = 3/0;

    public static void main(String[] arg){

        // Exception Handling

        // only one try and final block , but more catch block



        try {
            //  int N = 10 ;
            //   System.out.println(N);

            int n  ;
            Scanner input = new Scanner(System.in);
            n = input.nextInt();

            System.out.println(n);
        }
        catch (Exception excep ){       // ipmlementation more exceptions keywords


            System.out.println("something went wrong" + "only use number value");

        }
        finally {
            System.out.println("ok");

        }


        // own exception

        try {
            int num = 10;

            if (num==10)

                throw new Exception();

        }
        catch (Exception ex){

            System.out.println("yes");

        }



    }

}
