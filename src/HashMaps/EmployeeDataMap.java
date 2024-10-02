package HashMaps;

import Model.Employee;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeDataMap
{
    public static void main(String[] args)
    {
        HashMap<String, ArrayList<Employee>> empMap= new HashMap<>();

        //List of IBM employees
        Employee employee1= new Employee("Max", 23,4.5);
        Employee employee2= new Employee("Joseph", 21,6.3);
        Employee employee3= new Employee("Vladimir", 28,2.7);

        ArrayList<Employee> IbmEmployees= new ArrayList<>();
        IbmEmployees.add(employee1);
        IbmEmployees.add(employee2);
        IbmEmployees.add(employee3);

        empMap.put("IBM",IbmEmployees);

        //List of TCS employees
        Employee employee4= new Employee("Phillips", 21,3.1);
        Employee employee5= new Employee("Abraham", 26,3.5);
        Employee employee6= new Employee("George", 29,5.5);

        ArrayList<Employee> TcsEmployees= new ArrayList<>();
        TcsEmployees.add(employee4);
        TcsEmployees.add(employee5);
        TcsEmployees.add(employee6);

        empMap.put("TCS",TcsEmployees);

        //List of CTS employees
        Employee employee7= new Employee("Simon", 31,7.8);
        Employee employee8= new Employee("Nick", 25,4.5);
        Employee employee9= new Employee("Paul", 27,3.6);

        ArrayList<Employee> CtsEmployees= new ArrayList<>();
        CtsEmployees.add(employee7);
        CtsEmployees.add(employee8);
        CtsEmployees.add(employee9);

        empMap.put("CTS",CtsEmployees);

        //List of DXC employees
        Employee employee10= new Employee("Frank", 28,5.1);
        Employee employee11= new Employee("Jack", 24,3.3);
        Employee employee12= new Employee("Harbor", 32,9.7);

        ArrayList<Employee> DxcEmployees= new ArrayList<>();
        DxcEmployees.add(employee10);
        DxcEmployees.add(employee11);
        DxcEmployees.add(employee12);

        empMap.put("DXC",DxcEmployees);

        //Printing data of all companies
        for (String key: empMap.keySet())
        {
            ArrayList<Employee> employees= empMap.get(key);
            for (Employee employee: employees)
            {
                System.out.println("Company Name: "+key+"| Name: "+employee.getName()+", Age: "+employee.getAge()+" ,Salary (Monthly): "+employee.getSalary()+" Lacs (INR)");
            }
        }
    }
}
