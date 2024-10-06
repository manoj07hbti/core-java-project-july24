package collections.map;

import model.Employee2;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeMap {

   public HashMap<String, ArrayList<Employee2>> employeeMap(){

        HashMap<String, ArrayList<Employee2>> empMap = new HashMap<>();

        //1- Employee Data
        Employee2 e1 = new Employee2("Anshul", 45, "IT");
        Employee2 e2 = new Employee2("Nitish", 85, "MECH");
        Employee2 e3 = new Employee2("Abhishek", 22, "BIO");

        //2- list of Employee
        ArrayList<Employee2> ibmEmployee = new ArrayList<>();
        ibmEmployee.add(e1);
        ibmEmployee.add(e2);
        ibmEmployee.add(e3);

        //3-Company Name
        empMap.put("IBM", ibmEmployee);



        Employee2 e4 = new Employee2("Abhinav", 65, "ME");
        Employee2 e5 = new Employee2("Kunal", 56, "CS");
        Employee2 e6 = new Employee2("Shivam", 96, "MA");


        ArrayList<Employee2> tcsEmployee = new ArrayList<>();
        tcsEmployee.add(e4);
        tcsEmployee.add(e5);
        tcsEmployee.add(e6);


        empMap.put("TCS", tcsEmployee);

       Employee2 e7 = new Employee2("Aman", 78, "OP");
       Employee2 e8 = new Employee2("Shashank", 54, "MA");


       ArrayList<Employee2> ctsEmployee = new ArrayList<>();
       ctsEmployee.add(e7);
       ctsEmployee.add(e8);


       empMap.put("CTS", ctsEmployee);

       Employee2 e9 = new Employee2("JJ", 89, "QA");
       Employee2 e10 = new Employee2("Deepak", 23, "SD");


       ArrayList<Employee2> dxcEmployee = new ArrayList<>();
       dxcEmployee.add(e9);
       dxcEmployee.add(e10);

       empMap.put("DXC", dxcEmployee);



        return empMap;

    }

    public static void main(String[] args) {
        EmployeeMap obj = new EmployeeMap();

        for(String key : obj.employeeMap().keySet()){

            ArrayList<Employee2> employees = obj.employeeMap().get(key);

            for(Employee2 emp : employees){
                System.out.println("Company Name: "+key + "  Name: "+emp.getName()+ " Dept: " +emp.getDepartment()) ;
            }

        }

    }


}
