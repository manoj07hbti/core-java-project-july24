package conditional_statements;

public class Assignment_Ifelse {

    public static void main(String[] args) {

        //1)voting eligiblity
        int age =23;

        if(age>18){
            System.out.println("WELCOME TO VOTING SYSTEM");
        }
        else{
            System.out.println("YOU ARE NOT ELIGIBLE AS YOUR AGE IS LESS THAN 18");

        }

        age =12;

        if(age>18){
            System.out.println("WELCOME TO VOTING SYSTEM");
        }
        else{
            System.out.println("YOU ARE NOT ELIGIBLE AS YOUR AGE IS LESS THAN 18:"+age);
        }

        //2)marks criteria

        int marks=68;

        if(marks>=60) {
            System.out.println("FIRST DIVISION");
        }
        else {
            System.out.println("LAST DIVISION");

        }

        marks=36;

        if(marks>=60) {
            System.out.println("FIRST DIVISION");
        }
        else {
            System.out.println("LAST DIVISION:"+ "MARKS OBTAINED:"+marks);

        }

        //33%marks criteria

        marks=22;

        if(marks<33){
            System.out.println("NOT CLEARED EXAM:"+marks);
        }
        else
        {
            System.out.println("CLEARED THE EXAM:"+marks);
        }

        marks=58;

        if(marks<33){
            System.out.println("NOT CLEARED EXAM:"+marks);
        }
        else
        {
            System.out.println("CLEARED THE EXAM:"+marks);
        }

        //pricing of product

        int price=3457;

        if(price>5000){
            System.out.println("COSTLY PRODUCT"+price);
        }
        else {
            System.out.println("AVERAGE PRICE PRODUCT:"+price);
        }

        price=7760;

        if(price>5000){
            System.out.println("COSTLY PRODUCT:"+price);
        }
        else {
            System.out.println("AVERAGE PRICE PRODUCT:"+price);
        }

        //NATIONALITY
        String country="DUBAI";

        if(country=="INDIA"){
            System.out.println("YOU ARE INDIAN");
        }
        else{
            System.out.println("YOU ARE NOT INDIAN");
        }

        country="INDIA";

        if(country=="INDIA"){
            System.out.println("YOU ARE INDIAN");
        }
        else{
            System.out.println("YOU ARE NOT INDIAN");
        }
    }

}

