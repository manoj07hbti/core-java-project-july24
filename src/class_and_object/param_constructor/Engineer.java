package class_and_object.param_constructor;

import java.sql.SQLOutput;

public class Engineer {


    String name;
    int age;
    String department;
    int salary;
    double price;

    // PARAMETERIZED CONSTRUCTOR
    public Engineer(String name, int age, String department, int salary, double price) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.price = price;
    }

    // SYNTAX ClassName ObjectName= NewClassName(value 1.....value2...);
    public static void main(String[] args) {

        Engineer object1 = new Engineer("HARISH", 22, "TEXTILE", 55000, 500500.50);
        Engineer object2 = new Engineer("MADHAV", 25, "JIO", 40000, 5582.50);
        Engineer object3 = new Engineer("GOPAL", 26, "TELECOM", 350000, 5069.50);
        Engineer object4 = new Engineer("KANHA", 28, "SOFTWARE", 55400, 5048.50);
        Engineer object5 = new Engineer("SHYAM", 40, "COMPUTER", 1000000, 5069.50);

        // object.propertyName;
        System.out.println("NAME..." + object1.name + "age..." + object1.age + "department...:" + object1.department + "salary..." + object1.salary + "price..." + object1.price);
        System.out.println("NAME..." + object2.name + "age..." + object2.age + "department...:" + object2.department + "salary..." + object2.salary + "price..." + object2.price);
        System.out.println("NAME..." + object3.name + "age..." + object3.age + "department...:" + object3.department + "salary..." + object3.salary + "price..." + object3.price);
        System.out.println("NAME..." + object4.name + "age..." + object4.age + "department...:" + object4.department + "salary..." + object4.salary + "price..." + object4.price);
        System.out.println("NAME..." + object5.name + "age..." + object5.age + "department...:" + object5.department + "salary..." + object5.salary + "price..." + object5.price);



    }


}
