package collections.map;

import java.util.ArrayList;
import java.util.HashMap;

public class Employee {

    public HashMap<String, ArrayList<model.Employee>> createEmployeeMap() {
        HashMap<String, ArrayList<model.Employee>> empMap = new HashMap<>();

        // adding employees

        model.Employee employee1 = new model.Employee("Anshul", 25, "IT");
        model.Employee employee2 = new model.Employee("ISHANK", 26, "AVIATION");
        model.Employee employee3 = new model.Employee("Faizan", 26, "CIVIL");

        // List of employeee

        ArrayList<model.Employee> cognizantEmployees = new ArrayList<>();
        cognizantEmployees.add(employee1);
        cognizantEmployees.add(employee2);
        cognizantEmployees.add(employee3);


        // company name

        empMap.put("COGNIZANT", cognizantEmployees);

        // company 2

        model.Employee employee4 = new model.Employee("AJIT", 27, "DEFENCE");
        model.Employee employee5 = new model.Employee("SHIVAM", 26, "DEFENCE MINISTRY");
        model.Employee employee6 = new model.Employee("RIYAZ", 27, "MBBS");

        // List of employee

        ArrayList<model.Employee> accentureEmployees = new ArrayList<>();
        accentureEmployees.add(employee4);
        accentureEmployees.add(employee5);
        accentureEmployees.add(employee6);

        // compnay name

        empMap.put("ACCENTURE", accentureEmployees);

        return empMap;


    }

    public static void main(String[] args) {

        Employee obj = new Employee();

        for (String key : obj.createEmployeeMap().keySet()) {
            ArrayList<model.Employee> employees = obj.createEmployeeMap().get(key);

            for (model.Employee employee : employees) {
                System.out.println(" Company name " + key + " Name " + employee.getName() + " Age " + employee.getAge() + " DEPT " + employee.getDepartment());

            }

        }
    }


}
