package practiceclasses;

public class IfAndElsePractice {

    public static void main(String[] args) {

        // Determine if a temperature is comfortable
        // write a program to check the temperature is in comfortable range
        // The temeperature considered comfortable if it is between 60 and 75 faherenheit

        int number=65;
        if(number>60 && number<75){
            System.out.println("Temperature is comfortable..."+number);
        } else{
            System.out.println("Uncomfortable temperarature..."+number);
        }

        // Check if a person can rent a car.
        // write a program that if a person can rent a car.
        // The person must be atleats 21 years old and have a valid driving licence

        int num= 21; String vehicle= "CAR";
        if(num>18 && vehicle=="CAR" ){
            System.out.println("Person is valid for driving licence.."+num);
        } else{
            System.out.println("Not valid for driving licence...");
        }

        // Deterrmine if a day is weekend
        // write a program to check if a given day is a weekend
        // The weekend includes Saturday (6) and Sunday (7)

        int day=7;
        if(day>=6 && day<=7){
            System.out.println("Weekend days..."+day);
        } else{
            System.out.println("Working day");
        }

        // Grade classification..

        int value= 45;
        if(value>=90){
            System.out.println("Grade A");
        } else if( value>=80){
            System.out.println("Grade b");
        } else if( value>=70){
            System.out.println("Grade c..");
        } else if( value>=60){
            System.out.println("Grade d..");
        } else if(value>=50){
            System.out.println("Grade e");
        } else if(value<=40){
            System.out.println("Grade f..");
        } else{
            System.out.println("FAiled");
        }

        // write a program that takes an integer(1-7)
        // Determine the corresponding day of the week e.g day 1 ( Monday) day2 (Tuesday)

        int weekend=3;

        if(weekend<=1){
            System.out.println("Monday");
        } else if(weekend>=2){
            System.out.println("tuesday");
        } else if(weekend>=3){
            System.out.println("Wednesday");
        } else if(weekend>=4){
            System.out.println("Thursday");
        } else if(weekend>=5){
            System.out.println("friday");
        } else if(weekend>=6){
            System.out.println("Saturday");
        } else if(weekend>=7){
            System.out.println("Sunday");
        }

        // write a program that a person have high fever

        int degree=100;
        if(degree>=90){
            System.out.println("HIGHFEVER.."+degree);
        } else{
            System.out.println("LOW FEVER..."+degree);
        }

        // print table of 8

        int n=8;
        int rsult;
        for(int i=1; i<=10; i++){
            rsult=n*i;
            System.out.println("8" + "*" +i + "=" +(rsult));
        }

        // write a program to check a number is divisible by 4 b/w 1 to 30 using while condition

        int nu=30;
        while(nu<=30){
            if(nu%2==0){
                System.out.println("EVEN NUMBERS");
                nu++;
            }

            // write a program to purchase a 5 pen packets and get 5 toffee free
            int pen=5;
            int toffee=5;
            for(int i=1; i<=5; i++){
                for( int j=1; j<=i; j++){
                    System.out.println("TOFFEE");
                }
                System.out.println();
            }

        }


    }






}
