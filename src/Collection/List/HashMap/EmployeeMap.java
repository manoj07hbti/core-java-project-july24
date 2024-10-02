package Collection.List.HashMap;

import Model.Employee;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeMap {

    public static void main(String[] args) {



      HashMap<String, ArrayList<Employee>> empMap = new HashMap<>();

        // 01- Employee data

        Employee employee1 = new Employee("rahib", 23, "civil");
        Employee employee2 = new Employee("zohan", 24, "IT");
        Employee employee3 = new Employee("Azim", 25, "CS");

        // 02- list of employee

        ArrayList<Employee> ctsEmployees = new ArrayList<>();
        ctsEmployees.add(employee1);
        ctsEmployees.add(employee2);
        ctsEmployees.add(employee3);


        empMap.put("CTS", ctsEmployees);

        //02 company name

        Employee employee4 = new Employee("Imran", 25, "EE");
        Employee employee5 = new Employee("Bashu", 26, "CS");
        Employee employee6 = new Employee("Azib", 27, "IT");

        ArrayList<Employee> dxcEmployee = new ArrayList<>();

        dxcEmployee.add(employee4);
        dxcEmployee.add(employee5);
        dxcEmployee.add(employee6);

        empMap.put("DXC", dxcEmployee);



        for (String Key : empMap.keySet()) {

            ArrayList<Employee> employees = empMap.get(Key);

            for (Employee employee : employees) {

                System.out.println("Company Name : " + Key + "Name : " + employee.getName() + "Age" + employee.getAge() + "Dept:" + employee.getDepartment());

            }


        }

    }
}
