package collection.list;

import model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {

    public ArrayList<Employee> createEmployeeList(){
        //CollectionName <Datatype> objName = new CollectionName<>();

        ArrayList <Employee> employeeArrayList = new ArrayList<>();

        // data , we need to create Objects using parameterized constructor and scanner...
        System.out.println("How many Employee you want to add to data?");
        Scanner scanner= new Scanner(System.in);
        int size=scanner.nextInt(); // reads integer and return


        for(int i=0; i<size; i++){
            Scanner scanner1= new Scanner(System.in);
            System.out.println("Please enter name: ");
            String name=scanner1.nextLine(); // it reads String input
            System.out.println("Please enter age: ");
            int age= scanner1.nextInt(); // it reads int value
            Scanner scanner2= new Scanner(System.in);
            System.out.println("Please enter dept: ");
            String dept=scanner2.nextLine();

            Employee employee= new Employee(name,age,dept);
            employeeArrayList.add(employee);
        }

        return employeeArrayList;
    }

    public static void main(String[] args) {

        EmployeeList obj= new EmployeeList();
       for (Employee employee:obj.createEmployeeList()) {

           System.out.println("Employee Name :"+employee.getName() + " Age: "+employee.getAge() +" Dept: "+employee.getDept());
       }
    }
}
