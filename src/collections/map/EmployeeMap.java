package collections.map;

import model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class EmployeeMap {

   public HashMap<String, ArrayList<Employee>> employeeMap(){

        HashMap<String, ArrayList<Employee>> empMap = new HashMap<>();

        //1- Employee Data
        Employee e1 = new Employee("Anshul", 45, "IT");
        Employee e2 = new Employee("Nitish", 85, "MECH");
        Employee e3 = new Employee("Abhishek", 22, "BIO");

        //2- list of Employee
        ArrayList<Employee> ibmEmployee = new ArrayList<>();
        ibmEmployee.add(e1);
        ibmEmployee.add(e2);
        ibmEmployee.add(e3);

        //3-Company Name
        empMap.put("IBM", ibmEmployee);



        Employee e4 = new Employee("Abhinav", 65, "ME");
        Employee e5 = new Employee("Kunal", 56, "CS");
        Employee e6 = new Employee("Shivam", 96, "MA");


        ArrayList<Employee> tcsEmployee = new ArrayList<>();
        tcsEmployee.add(e4);
        tcsEmployee.add(e5);
        tcsEmployee.add(e6);


        empMap.put("TCS", tcsEmployee);

       Employee e7 = new Employee("Aman", 78, "OP");
       Employee e8 = new Employee("Shashank", 54, "MA");


       ArrayList<Employee> ctsEmployee = new ArrayList<>();
       ctsEmployee.add(e7);
       ctsEmployee.add(e8);


       empMap.put("CTS", ctsEmployee);

       Employee e9 = new Employee("JJ", 89, "QA");
       Employee e10 = new Employee("Deepak", 23, "SD");


       ArrayList<Employee> dxcEmployee = new ArrayList<>();
       dxcEmployee.add(e9);
       dxcEmployee.add(e10);

       empMap.put("DXC", dxcEmployee);



        return empMap;

    }

    public static void main(String[] args) {
        EmployeeMap obj = new EmployeeMap();

        for(String key : obj.employeeMap().keySet()){

            ArrayList<Employee> employees = obj.employeeMap().get(key);

            for(Employee emp : employees){
                System.out.println("Company Name: "+key + "  Name: "+emp.getName()+ " Dept: " +emp.getDepartment()) ;
            }

        }

    }


}
