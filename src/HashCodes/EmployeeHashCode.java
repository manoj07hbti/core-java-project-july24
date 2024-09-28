package HashCodes;

import Model.Employee;

import java.util.HashSet;

public class EmployeeHashCode
{
    public static void main(String[] args)
    {
        HashSet<Employee> employees = new HashSet<>();

        Employee employee1 = new Employee("Max",32,1.5);
        System.out.println("Hashcode of employee1: "+ employee1.hashCode());

        Employee employee2 = new Employee("Max",32,1.5);
        System.out.println("Hashcode of employee2: "+ employee2.hashCode());

        Employee employee3 = new Employee("Jones",32,3.2);
        System.out.println("Hashcode of employee3: "+ employee3.hashCode());

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        for (Employee var: employees)
        {
            System.out.println
                    (
                    "Name: "+var.getName()+
                    ", Age: "+var.getAge()+
                    ", Salary: "+var.getSalary()
                    );
        }
    }
}
