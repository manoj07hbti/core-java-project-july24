package map;

import model.Employee;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeMap {


    //HashMap <DataType_Key, DataType_Value> objName= new HashMap();

    public HashMap<String, ArrayList<Employee>> employee() {


        HashMap<String, ArrayList<Employee>> empMap = new HashMap<>();

        //1)employee data

        Employee e1= new Employee("Rahul", 23, "EC");
        Employee e2= new Employee("priya", 24, "ME");
        Employee e3= new Employee("kiran", 22, "EE");
        Employee e4= new Employee("kabir", 21, "CS");

        //2)list of employee

        ArrayList<Employee> tcsEmployee = new ArrayList<>();
        tcsEmployee.add(e1);
        tcsEmployee.add(e2);
        tcsEmployee.add(e3);
        tcsEmployee.add(e4);

        //3)company name

        empMap.put("TCS",tcsEmployee);


        //FOR COMPANY 2
        Employee e5= new Employee("Ritu", 33, "BED");
        Employee e6= new Employee("priti", 22, "MED");

        ArrayList<Employee> ibmEmployee = new ArrayList<>();
        ibmEmployee.add(e5);
        ibmEmployee.add(e6);

        empMap.put("IBM",ibmEmployee);


        // FOR COMPANY 3

        Employee e7= new Employee("veer", 25, "COMMERCE");
        Employee e8= new Employee("vaibhav", 27, "SCIENCE");

        ArrayList<Employee> ctsEmployee = new ArrayList<>();
        ctsEmployee.add(e7);
        ctsEmployee.add(e8);

        empMap.put("CTS",ctsEmployee);


        //FOR COMPANY 4

        Employee e9= new Employee("leela", 24, "ENGLISH");
        Employee e10= new Employee("sarita", 20, "SOCIAL");

        ArrayList<Employee> dxcEmployee = new ArrayList<>();
        dxcEmployee.add(e9);
        dxcEmployee.add(e10);

        empMap.put("DXC",dxcEmployee);

        return empMap;

    }

    public static void main(String[] args) {
        EmployeeMap obj = new EmployeeMap();
        for(String key : obj.employee().keySet()){

            ArrayList<Employee> employees=obj.employee().get(key);

            for(Employee employee: employees){

                System.out.println("Company Name: "+key + " Name:"+employee.getName()+ " Dept:"+employee.getDepartment());
            }

        }

    }
}