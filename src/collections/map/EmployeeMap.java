package collections.map;

import model.Employee;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeMap {

    public static void main(String[] args) {

        //      1 Company Flipkart

        HashMap<String, ArrayList<Employee>> emlMap= new HashMap<>();
        // 1: employee
        Employee employee1= new Employee("Himanshu",23,"telecom");
        Employee employee2= new Employee("krishna",24,"health");
        Employee employee3= new Employee("Rajan",25,"water supplier");
        // 2: list of Employee
        ArrayList <Employee>flpcrtemployees= new ArrayList<>();
        flpcrtemployees.add(employee1);
        flpcrtemployees.add(employee2);
        flpcrtemployees.add(employee3);
        // name of company
        emlMap.put("FLPCRT",flpcrtemployees);

        //      2 Company Amazon
        Employee employee4= new Employee("Sunny",26," Guard");
        Employee employee5= new Employee("Bablu",21,"driver");
        Employee employee6= new Employee("Shivam",27,"cash counter");

        ArrayList <Employee> amazonemployees= new ArrayList<>();
        amazonemployees.add(employee4);
        amazonemployees.add(employee5);
        amazonemployees.add(employee6);

        emlMap.put("AMZN",amazonemployees);

        //      2 Company CTS
        Employee employee7= new Employee("Sandeep",20,"CS");
        Employee employee8= new Employee("Aditya",22,"IT");
        Employee employee9= new Employee("Ankur",29,"MANAGER");

        ArrayList <Employee> ctsemployees= new ArrayList<>();
        ctsemployees.add(employee7);
        ctsemployees.add(employee8);
        ctsemployees.add(employee9);

        emlMap.put("CTS",ctsemployees);

        //     3 Company DXC

        Employee employee10= new Employee("Hanny",19,"HAND CRAFT");
        Employee employee11= new Employee("Vinny",25,"MANAGMENT");
        Employee employee12= new Employee("Neeraj",30,"SUPERVISOR");

        ArrayList <Employee> dxcemployees= new ArrayList<>();
        dxcemployees.add(employee10);
        dxcemployees.add(employee11);
        dxcemployees.add(employee12);

        emlMap.put("DXC",dxcemployees);

        System.out.println(emlMap);

        // using loop

        for (String key: emlMap.keySet()){

            ArrayList<Employee> employees= emlMap.get(key);

            for (Employee employee: employees){
                System.out.println("Company Name: "+key+ "Name: " + employee.getName() + "age : "+  employee.getAge() + "Dpt: "+employee.getDepartment());
            }
        }



    }
}
