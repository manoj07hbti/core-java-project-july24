package collection.map;

import model.Employee;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeMap {

    public static void main(String[] args) {

        HashMap<String, ArrayList<Employee>> empMap= new HashMap<>();

        // 1- Employee data
        Employee employee1= new Employee("Raj",21,"CS");
        Employee employee2= new Employee("Neha",22,"IT");
        Employee employee3= new Employee("Mohit",23,"CS");

        // 2- list of employee
        ArrayList<Employee> ibmEmployees= new ArrayList<>();
        ibmEmployees.add(employee1);
        ibmEmployees.add(employee2);
        ibmEmployees.add(employee3);
        // 3- company name

        empMap.put("IBM", ibmEmployees);
        // 1- Employee data
        Employee employee4= new Employee("Rohit",21,"CS");
        Employee employee5= new Employee("Rani",22,"IT");
        Employee employee6= new Employee("Manish",23,"CS");

        // 2- list of employee
        ArrayList<Employee> tcsEmployees= new ArrayList<>();
        tcsEmployees.add(employee4);
        tcsEmployees.add(employee5);
        tcsEmployees.add(employee6);
        empMap.put("TCS",tcsEmployees);

        System.out.println(empMap);

        // print map using loop

        for(String key : empMap.keySet()){

        ArrayList<Employee> employees=empMap.get(key);

          for(Employee employee: employees){

              System.out.println("Company Name: "+key + " Name:"+employee.getName()+ " Dept:"+employee.getDept());
          }

        }

    }
}
