package conditional_statements;

public class IfelseAssignment1 {


    public static void main(String[] args) {

        //1)voting eligiblity
        int age =21;

        if(age>18){
            System.out.println("WELCOME TO VOTING SYSTEM");
        }
        else{
            System.out.println("YOU ARE NOT ELIGIBLE AS YOUR AGE IS LESS THAN 18");

        }

        age =14;

        if(age>18){
            System.out.println("WELCOME TO VOTING SYSTEM");
        }
        else{
            System.out.println("YOU ARE NOT ELIGIBLE AS YOUR AGE IS LESS THAN 18:"+age);
        }

      //2)marks criteria

        int marks=65;

        if(marks>=60) {
            System.out.println("FIRST DIVISION");
        }
        else {
            System.out.println("LAST DIVISION");

        }

        marks=35;

        if(marks>=60) {
            System.out.println("FIRST DIVISION");
        }
        else {
            System.out.println("LAST DIVISION:"+ "MARKS OBTAINED:"+marks);

        }

        //33%marks criteria

        marks=21;

        if(marks<33){
            System.out.println("NOT CLEARED EXAM:"+marks);
        }
        else
        {
            System.out.println("CLEARED THE EXAM:"+marks);
        }

        marks=56;

        if(marks<33){
            System.out.println("NOT CLEARED EXAM:"+marks);
        }
        else
        {
            System.out.println("CLEARED THE EXAM:"+marks);
        }

       //pricing of product

        int price=3567;

        if(price>5000){
            System.out.println("COSTLY PRODUCT"+price);
        }
        else {
            System.out.println("AVERAGE PRICE PRODUCT:"+price);
        }

         price=7890;

        if(price>5000){
            System.out.println("COSTLY PRODUCT:"+price);
        }
        else {
            System.out.println("AVERAGE PRICE PRODUCT:"+price);
        }

         //NATIONALITY
        String country="EUROPE";

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
