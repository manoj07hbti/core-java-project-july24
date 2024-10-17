package collection;

import model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeArrayList {

    public ArrayList<Employee> createEmployee(){
            ArrayList<Employee>EmployeeArrayList=new ArrayList<>();
            Scanner scanner=new Scanner(System.in);

            System.out.println("please enter the number of Employee thats you want to enter");

            int size= scanner.nextInt();

            for(int i=0; i< size; i++ ){

                Scanner scanner1=new Scanner(System.in);

                System.out.println("data of Employee"+(i+1));

                System.out.println("name");
                String name= scanner1.nextLine();

                System.out.println("age");
                int age= scanner1.nextInt();

                System.out.println("department");
                int department= scanner1.nextInt();


            }
            return EmployeeArrayList;
        }

        public static void main(String[] args) {

        EmployeeArrayList obj=new EmployeeArrayList();

            for(Employee var:obj.createEmployee()){

        }
    }



}
