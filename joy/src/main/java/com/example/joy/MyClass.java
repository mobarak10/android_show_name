package com.example.joy;

public class MyClass {
    public static void main(String[] args){

//        showName(" hello");
        int finalresult = addNum(4,6);
        System.out.println(finalresult);
        /*
        int a = 12;
        double b = 10;
        int total = (int) (a+b);
        System.out.println(total);
         */


        /*
            = ---> assignment operator
            == ---> comparison operator
            != ---> not operator
            ! ---> negation
         */
//        int a = 12;
//        int b = 10;
        /*
        if (a == b){
            System.out.println("indeed!!");
        }else {
            System.out.println("not true");
        }
         */

//        if (a != b){
////            System.out.println("indeed!!");
////        }else{
////            System.out.println("not true");
////        }

        /*
        int firstage = 10;
        int secondage = 25;

        boolean isaged = true;
        boolean isnotaged = false;

        if ((isaged || isnotaged) && (firstage > 15)){
            System.out.println("enter here");
        }else {
            System.out.println("not enter");
        }

         */

//        for (int i = 1; i <= 20; i++){
//            // System.out.println("Hello joy" + (i+1));
//            if (i % 2 == 0){
//                System.out.println( i + " is modulus of 2");
//            }else {
//                System.out.println(i + " is not modulus of 2");
//            }
//        }

        /*
        String name = "Joy Khan";
        int age = 24;
        System.out.println("My Name Is "+ name+ " My Age Is "+age);
         */
    }

//    public static void showName(String somethng){
//        System.out.println("from showName method" + somethng);
//    }

    public static int addNum(int a, int b){
        int result = a+b;
        return result;
    }
}
