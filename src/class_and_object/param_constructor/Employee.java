package class_and_object.param_constructor;

public class Employee {
    String name;
    int age;
    String companyname;
    int salary;
    double dutytime;


     //PARAMETERISED CONSTRUCTOR
    public Employee(String name, int age, String companyname, int salary, double dutytime) {
        this.name = name;
        this.age = age;
        this.companyname = companyname;
        this.salary = salary;
        this.dutytime = dutytime;
    }
  //SYNTAX : className ObjectName= NewClassName(value1.... value2.... value3..);
    public static void main(String[] args) {
        Employee object1= new Employee("MANNU",45,"FLIPKART",4500,8.20);
        Employee object2= new Employee("SONU",45,"SUNGLASS",4585,8.20);
        Employee object3= new Employee("ANKUR",45,"FARMER",95500,8.20);
        Employee object4= new Employee("NEERAJ",45,"GOOGLE",45470,8.20);
        Employee object5= new Employee("DEEPU",45,"LENSCART",145200,8.20);

      // Object.PropertyName
        System.out.println("name"+object1.name+"companyname"+object1.companyname+"salary"+object1.salary+"dutytime"+object1.dutytime);
        System.out.println("name"+object2.name+"companyname"+object2.companyname+"salary"+object2.salary+"dutytime"+object2.dutytime);
        System.out.println("name"+object3.name+"companyname"+object3.companyname+"salary"+object3.salary+"dutytime"+object3.dutytime);
        System.out.println("name"+object4.name+"companyname"+object4.companyname+"salary"+object4.salary+"dutytime"+object4.dutytime);
        System.out.println("name"+object5.name+"companyname"+object5.companyname+"salary"+object5.salary+"dutytime"+object5.dutytime);








    }















}
