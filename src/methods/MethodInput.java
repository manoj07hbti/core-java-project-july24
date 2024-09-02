package methods;

public class MethodInput {

    // SYNTAX:  access_specifier return_type  method_name (Datatype varName1,Datatype varName2,Datatype varName3..) {
    //                                                                    CODE..   }

    // write a code to make square of any number

    public void makeSquare(int number){

        System.out.println("Square of given number is: "+ number*number);
    }

    // write a method which can tell a person is eligible for voting in AGRA or not

    public void voting(int age,String city){

        if(age>=18 && city=="AGRA"){
            System.out.println("Person is eligible for voting in AGRA...");
        }else {
            System.out.println("Person is NOT eligible for voting in AGRA..."+age +" and City: "+city );
        }

    }

    public static void main(String[] args) {

        MethodInput obj= new MethodInput();
 //  obj.methodName(value1);
        obj.makeSquare(3);
        obj.makeSquare(11);
        obj.makeSquare(5);

        obj.voting(21,"AGRA");
        obj.voting(12,"AGRA");
        obj.voting(21,"PUNE");

    }


}
