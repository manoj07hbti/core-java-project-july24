package Revision_package;

import jdk.management.resource.ResourceType;

import java.sql.SQLOutput;

public class DemoIfCondition {

    public static void main(String[] args) {

        // voting
        int age = 18;
        if (age >= 18) {
            System.out.println("person is eligible for voting");
        }
        if (age < 18) {
            System.out.println("person is  not eligible for voting");
        }

        //  century
        int run = 1001;
        if (run > 100) {
            System.out.println("century is done" + run);
        }
        if (run < 100) {
            System.out.println("century  is not done" + run);


        }
        // product is costly

        int price = 2000;
        if (price > 500) {
            System.out.println("price is costly" + price);
        }
        if (price < 500) {
            System.out.println("price is  not costly" + price);
        }

       // candidate is prom pune
        String city="pune";
        if (city=="makkhanpur"){
            System.out.println("i,m from pune");
        }
        if (city!="makkhanpur"){
            System.out.println("i,m not from pune");

         // person is 6 pt tall or not tall

            int height=6;
            if (height>=6){
                System.out.println("person is tall"+height);
            }

            if (height<6){
                System.out.println("person is not tall"+height);
            }






    }



}}
