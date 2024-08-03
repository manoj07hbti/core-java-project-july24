package And_operator;

public class And_operator {

    public static void main(String args[]) {

        // 01

        // operator and true && true = true

        int number = 60;

        String subject = "science";

        if (number >= 60 && subject == "science") {
            System.out.println("this studend pass first div.....");
        } else {
            System.out.println("this studend is not pass first div.....");
        }

        //02  true && false = false

        subject = "maths";

        if (number >= 60 && subject == "science") {
            System.out.println("this studend pass first div.....");
        } else {
            System.out.println("this studend is not pass first div.....");
        }

        // 03 false && true =false

        number = 40;
        if (number >= 60 && subject == "science") {
            System.out.println("this studend pass first div.....");
        } else {
            System.out.println("this studend is not pass first div.....");
        }

        //04 fale && false = false

        subject = "histary";

        if (number >= 60 && subject == "science") {
            System.out.println("this studend pass first div.....");
        } else {
            System.out.println("this studend is not pass first div.....");
        }

        //1. TRUE && TRUE = TRUE

        int age = 18;
        String up = "tundla";
        //1. TRUE && TRUE = TRUE
        if (age >= 18 && up == "tundla") {
            System.out.println("Person is eligible for voting in tundla...");
        } else {
            System.out.println("Person is NOT eligible for voting in tundla...");
        }

        //2.   TRUE && FALSE= FALSE
        up = "firozabad";
        if (age >= 18 && up == "tundla") {
            System.out.println("Person is eligible for voting in tundla...");
        } else {
            System.out.println("Person is NOT eligible for voting in tundla...");
        }
        //3.   FALSE && TRUE= FALSE
        age = 23;
        up = "tundla";
        if (age >= 18 && up == "tundla") {
            System.out.println("Person is eligible for voting in tundla...");
        } else {
            System.out.println("Person is NOT eligible for voting in tundla...");
        }
        //4.   FALSE && FALSE= FALSE
        up = "firozabad";
        if (age >= 18 && up == "tundla") {
            System.out.println("Person is eligible for voting in tundla...");
        } else {
            System.out.println("Person is NOT eligible for voting in tundla...");
        }
        //01

        int price = 3000;
        String delhi = "mumbai";
        if (price >= 3000 && delhi == "mumbai") {

            System.out.println("this indian people air flit ticket price.....");

        } else {

            System.out.println("this is not indian people air flit ticket price.....");
        }
        //02

        // true && false = false

        price  = 3000;

         delhi = "Dubai";

        if (price >= 3000 && delhi == "mumbai") {

        } else {

            System.out.println("this is not indian people air flit ticket price.....");

        }
    }
}