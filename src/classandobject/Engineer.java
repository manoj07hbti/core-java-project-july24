package classandobject;

import java.sql.SQLOutput;

public class Engineer {

    String name = "Anil";
    int age = 28;
    String city = "Kashipur";
    String Depratment = "CIVIL ENGINEER";

    public static void main(String[] args) {
        Engineer eng = new Engineer();
        System.out.println("Name " + eng.name + " Age " + eng.age + " City " + eng.city + " City " + eng.city + " Department " + eng.Depratment);

        Engineer eng1 = new Engineer();
        System.out.println("Name " + eng1.name + " Age " + eng1.age + " City " + eng1.city + " City " + eng1.city + " Department " + eng1.Depratment);


    }


}
