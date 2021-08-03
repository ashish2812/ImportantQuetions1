package com.company;

public class StarsPatterns {

    public static void main(String[] args) {
        System.out.println("//Pattern One//");
        //Pattern one
        //*
        //**
        //***
        //****

        for(int i = 1;i<=4;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        /*
        Pattern Two
        ****
        ***
        **
        *
        */
        System.out.println("//Pattern Two//");
        for(int i = 1;i<=4;i++){
            for(int j = 4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    /*
     Patter three

     *
     **
     ***
     ****
     ***
     **
     *


    */

        System.out.println("//Pattern Three//");
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1;i<=4;i++){
            for(int j = 4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        Pattern Four
          ----*
          ---**
          --***
          -****
          *****

        */
        System.out.println("//Pattern Four//");
        for(int i = 1;i<=5;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        Pattern Five

        *****
        -****
        --***
        ---**
        ----*

         */

        System.out.println("//Pattern Five//");
        for (int i = 1;i<=5;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(" ");
            }for(int k = 5;k>=i;k--){
                System.out.print("*");

            }
            System.out.println();
        }


    }


}
