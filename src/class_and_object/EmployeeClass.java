package class_and_object;

public class EmployeeClass {

 String name="vartika";
 String department="development";
 int age=24;
 String designation = "software development";
 int experience =5;

 public static void main(String[] args) {

  //default constructor
  //syntax : classname objectname = new classname();

   EmployeeClass emp1 = new EmployeeClass();
  System.out.println("name:"+emp1.name);
  System.out.println("department:"+emp1.department);
  System.out.println("age:"+emp1.age);
  System.out.println("designation:"+emp1.designation);
  System.out.println("experience:"+emp1.experience);

  EmployeeClass emp2 = new EmployeeClass();
  System.out.println("obj2"+"name:"+emp2.name);
  System.out.println("obj2"+"department:"+emp2.department);
  System.out.println("obj2"+"age:"+emp2.age);
  System.out.println("obj2"+"designation:"+emp2.designation);
  System.out.println("obj2"+"experience:"+emp2.experience);


 }
 }