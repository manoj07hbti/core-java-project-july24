package collection.set;
import model.Employee;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Engineer {
    public LinkedHashSet<model.Engineer> createEngineerList(){
        LinkedHashSet<model.Engineer> engineers=new LinkedHashSet<>();
        System.out.println("Please enter number of engineer's data to enter: ");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        for(int i=0;i<size;i++){
            Scanner scanner1=new Scanner(System.in);
            System.out.println("Please enter name of engineer: ");
            String name=scanner1.nextLine();
            Scanner scanner2=new Scanner(System.in);
            System.out.println("Please enter age of engineer: ");
            int age=scanner2.nextInt();
            Scanner scanner3=new Scanner(System.in);
            System.out.println("Please enter section of engineer: ");
            String department=scanner3.nextLine();
            model.Engineer engineer=new model.Engineer(name,age,department);
            engineers.add(engineer);

        }return engineers;
    }

    public static void main(String[] args) {
        Engineer obj=new Engineer();
        for(model.Engineer var:obj.createEngineerList()){
            System.out.println("Printing Engineer Name: "+var.getName()+" Age: "+var.getAge()+" Department: "+var.getDepartment());
        }
    }
}
