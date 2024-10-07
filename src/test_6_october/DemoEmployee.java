package test_6_october;
import model.Employeeee;

import java.util.ArrayList;
import java.util.HashMap;

public class DemoEmployee {

    public static void main(String[] args) {

        // Write a program to create Employee(name, Salary, City, Dept) HashMap
        // IBM company Employee
        HashMap<String, ArrayList<Employeeee>> emlyMap = new HashMap<>();
        Employeeee employee1 = new Employeeee("Rohit", 22, 50000, "IT");
        Employeeee employee2 = new Employeeee("Rahul", 25, 55000, "GD");
        Employeeee employee3 = new Employeeee("Rinku", 22, 60000, "PL");
        // List of Employee
        ArrayList<Employeeee> ibmemployee = new ArrayList<>();
        ibmemployee.add(employee1);
        ibmemployee.add(employee2);
        ibmemployee.add(employee3);
        emlyMap.put("IBM", ibmemployee);

        // TCS company Employee
        Employeeee employee4 = new Employeeee("Ankur", 21, 60000, "DM");
        Employeeee employee5 = new Employeeee("Sonveer", 30, 66000, "CM");
        Employeeee employee6 = new Employeeee("Bablu", 27, 700000, "AS");
        // List of Employee
        ArrayList<Employeeee> ctemployee = new ArrayList<>();
        ctemployee.add(employee4);
        ctemployee.add(employee5);
        ctemployee.add(employee6);
        emlyMap.put("TCS", ctemployee);

        // WIPRO company Employee
        Employeeee employee7 = new Employeeee("Arvind", 32, 500000, "JL");
        Employeeee employee8 = new Employeeee("karan", 31, 660000, "CC");
        Employeeee employee9 = new Employeeee("Arjun", 26, 400000, "COE");
        // List of Employee
        ArrayList<Employeeee> proemployee = new ArrayList<>();
        proemployee.add(employee7);
        proemployee.add(employee8);
        proemployee.add(employee9);
        emlyMap.put("WIPRO", proemployee);

        //CTC company Employee
        Employeeee employee10 = new Employeeee("Pankaj", 36, 400000, "CEO");
        Employeeee employee11 = new Employeeee("Rajan", 34, 500000, "FD");
        Employeeee employee12 = new Employeeee("Sunny", 33, 700000, "FINANCE");
        // List of Employee
        ArrayList<Employeeee> ctcemployee = new ArrayList<>();
        ctcemployee.add(employee7);
        ctcemployee.add(employee8);
        ctcemployee.add(employee9);
        emlyMap.put("WIPRO", ctcemployee);

        ArrayList<Employeeee> puneCity = new ArrayList<>();
        puneCity.add(employee1);
        puneCity.add(employee3);
        puneCity.add(employee4);
        puneCity.add(employee6);
        puneCity.add(employee7);
        puneCity.add(employee9);
        puneCity.add(employee10);
        emlyMap.put("city", puneCity);

        ArrayList<Employeeee> agraCity = new ArrayList<>();
        agraCity.add(employee2);
        agraCity.add(employee5);
        agraCity.add(employee8);
        agraCity.add(employee11);
        agraCity.add(employee12);
        emlyMap.put("city", agraCity);
        System.out.println(emlyMap);
        System.out.println();


        for (String key : emlyMap.keySet()){

            ArrayList<Employeeee> employees = emlyMap.get(key);
            for (Employeeee employee : employees){
                System.out.println("Company : "+key+ "Name : "+employee.getName()+ "Age : "+employee.getAge()+"Salary : "+employee.getSalary()+"Dept :"+employee.getDept());

            }

        }
        }

        }




