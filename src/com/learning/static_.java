package com.learning;

public class static_ {
    public static void main(String[] arg) {

        Student.Principal= "kumar";

        Student Ram = new Student();
        Ram.rollno=19710144;
        Ram.class_="3rd  year";
        //  Ram.Principal= "Kumar";





        Student Raj = new Student();
        Raj.rollno=19710145;
        Raj.class_="3rd  year";
        //       Raj.Principal= "Kumar";     // this is always same

        System.out.println(Student.Principal);

        // normal value is stored by stakstorage
        // static  value is stored by static storage


    }

}

class Student {

    int rollno;
    static String class_;
    static String Principal;

    // identify static

    static {
        Principal = " Kumar ";
        class_ = "3rd Year";
    }

    void display() {
        System.out.println("static");

    }



}
