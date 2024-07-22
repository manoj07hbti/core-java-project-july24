package variable;

public class Revision {

    public static void main(String[] args) {

   //SYNTAX : Datatype varName; // declare a variable

        String name;
        int age;
        double price;
 //  varName=value;

        name="Jatin";
        age=24;
        price=34.56;

//Datatype varName = value ;  // declaration + Assignent

        String name2= "Rahul";
        int height=6;
        double percentage= 56.78;

        System.out.println("Printing variables");
//  System.out.println("Message : " +varName);

        System.out.println("Printing Name "+name);
        System.out.println("Printing Name2 "+name2);

        System.out.println("Age : "+age);
        System.out.println("Price :"+price);
        System.out.println("Percentage: "+percentage);

        //SYNTAX :  System.out.println("Message1 : " +varName +" Message 2:" + var2 + "Message 3"+var3);

        System.out.println("Name: " +name +" Name2 :"+name2 + " Age:"+age + " Price "+price +" % "+percentage);

    }


}
