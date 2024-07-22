package variable;

public class DemoVariables {

    public static void main(String[] args) {

        //COMMENTS : HELPING INFORMATION ABOUT YOUR CODE
        //SYNTAX : Datatype varName; // declare a variable

        //Create a variable which will store name of person

          String name; // we have declared a variable with name as name

        //how to assign data into variable
        //   varName=value;
        name="Rahul"; // always use double quotes only in case of String

        System.out.println("Printing value of name " +name);

        int age; // we have declared a age variable with int datatype
        age=21;// we have stored age as 21 .

        System.out.println("Printing age: "+age);
        double price; // we have created a variable name price with double datatype to store decimal values
        price=2321.2344;
        System.out.println("Printing price "+price);

        System.out.println("**** Printing name "+name + " Printing Age "+age + " Printing price "+price +"****");

    }
}
