package test.map;

import model.Employee1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TestEmployee {
    public ArrayList<Employee1> createEmployeeData(){

        // data :  number of record , emp data

        System.out.println("How many employee you want to enter:");
        Scanner scanner= new Scanner(System.in);
        int count=scanner.nextInt();

        ArrayList<Employee1> employeeArrayList= new ArrayList<>();
        for(int i=0; i<count; i++){

            Scanner scanner1= new Scanner(System.in);
            System.out.println("Please enter Name:");
            String name= scanner1.nextLine();

            Scanner scanner2= new Scanner(System.in);
            System.out.println("Please enter Salary:");
            double salary=scanner1.nextDouble();

            Scanner scanner3= new Scanner(System.in);
            System.out.println("Please enter City:");
            String city= scanner3.nextLine();

            Scanner scanner4= new Scanner(System.in);
            System.out.println("Please enter Dept:");
            String dept= scanner4.nextLine();

            Employee1 employee= new Employee1(name,salary,city,dept);
            employeeArrayList.add(employee);
        }

        return employeeArrayList;
    }
    private String FindHighestLowestSalary(ArrayList<Employee1> employeeArrayList){
        Double highestSalary=0.0;
        Double lowestSalary=Double.MAX_VALUE;

        // finding highest
        for( Employee1 emp: employeeArrayList) {

            // here we are comparing salary with our highest salary, if our salary is not highest it means current emp salary is highest
            if (highestSalary < emp.getSalary()) {
                highestSalary = emp.getSalary();
            }
        }
        System.out.println("We have found emp with Highest salary: "+highestSalary);
        // finding lowest
        for (Employee1 empl:employeeArrayList){
            if(lowestSalary>empl.getSalary()){
            lowestSalary=empl.getSalary();}
        }
        System.out.println("We have found emp with Lowest salary: "+lowestSalary);




        return null;
    }

    public void printSameCityEmployee(  HashMap<String, ArrayList<Employee1>> companyWiseData){
        // we need to process two company data at a time

        System.out.println("which company data you want to compare");
        Scanner scanner= new Scanner(System.in);
        String company1= scanner.nextLine();
        System.out.println("which company data you want to compare");
        String company2= scanner.nextLine();

        ArrayList <Employee1> company1Employee= companyWiseData.get(company1);
        ArrayList <Employee1> company2Employee= companyWiseData.get(company2);

        for(Employee1 company1Emp : company1Employee){

            for(Employee1 company2Emp : company2Employee){

                if(company1Emp.getCity().equals(company2Emp.getCity())){

                    System.out.println("COMPANY 1: Name: "+company1Emp.getName()+" Salary :"+company1Emp.getSalary()+ " Dept: "+company1Emp.getDept() +" City: "+company1Emp.getCity());
                    System.out.println("COMPANY 2: Name: "+company2Emp.getName()+" Salary :"+company2Emp.getSalary()+ " Dept: "+company2Emp.getDept() +" City: "+company2Emp.getCity());

                }
            }
        }



    }
    public void printSameSalaryEmployee(HashMap<String,ArrayList<Employee1>>companyWiseData){
        System.out.println("Which company data you want to compare");
        Scanner scanner= new Scanner(System.in);
        String company1= scanner.nextLine();
        System.out.println("which company data you want to compare");
        String company2= scanner.nextLine();

        ArrayList<Employee1> company1Employee=companyWiseData.get(company1);
        ArrayList<Employee1>company2Employee=companyWiseData.get(company2);

        for (Employee1 company1Emp:company1Employee){

            for (Employee1 company2Emp:company2Employee){

                if (company1Emp.getSalary() ==company2Emp.getSalary()){
                    System.out.println("COMPANY 1: Name: "+company1Emp.getName()+" Salary :"+company1Emp.getSalary()+ " Dept: "+company1Emp.getDept() +" City: "+company1Emp.getCity());
                    System.out.println("COMPANY 2: Name: "+company2Emp.getName()+" Salary :"+company2Emp.getSalary()+ " Dept: "+company2Emp.getDept() +" City: "+company2Emp.getCity());

                }
            }
        }

    }

    public static void main(String[] args) {
        TestEmployee obj = new TestEmployee();
        String choice = "Y";
        HashMap<String, ArrayList<Employee1>> companyWiseData = new HashMap<>();
        while (choice.equals("Y")) {
            System.out.println("Please enter company name for which you want to create data");

            Scanner scanner = new Scanner(System.in);
            String companyName = scanner.nextLine();
            ArrayList<Employee1> employeeArrayList = obj.createEmployeeData();

            companyWiseData.put(companyName, employeeArrayList);

            for(String key: companyWiseData.keySet()){

                for(Employee1 emp: companyWiseData.get(key)){
                    System.out.println("Company name :"+key);
                    System.out.println("Name: "+emp.getName()+" Salary :"+emp.getSalary()+ " Dept: "+emp.getDept() +" City: "+emp.getCity());
                }
            }
            System.out.println("Do you want to add one more company data? Press Y to continue or any other to exit");
            Scanner scanner1= new Scanner(System.in);
            choice=scanner1.nextLine();


        }
        //1.calling company wise data

        //2. calling highest lowest salary method
        String choice1="Y";
        while (choice1.equals("Y")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter Which Company Employee HighestLowestSalary you want to find");
            String company = scanner.nextLine();
            obj.FindHighestLowestSalary(companyWiseData.get(company));
        }
        System.out.println("Do you want to check HighestLowestSalary for any other company: Press Y for yes or any other key to exit");
        Scanner scanner=new Scanner(System.in);
        choice1=scanner.nextLine();

        //3. calling same city method
        obj.printSameCityEmployee(companyWiseData);

        //4.calling same salary method
        obj.printSameSalaryEmployee(companyWiseData);



    }

}
