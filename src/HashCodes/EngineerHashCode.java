package HashCodes;

import Model.Engineer;

import java.util.HashSet;

public class EngineerHashCode
{
    public static void main(String[] args)
    {
        HashSet<Engineer> engineers= new HashSet<>();

        Engineer engineer1= new Engineer("Tom", 27,"Civil");
        System.out.println("Hashcode of engineer1: "+engineer1.hashCode());

        Engineer engineer2= new Engineer("Tom",27,"Civil");
        System.out.println("Hashcode of engineer2: "+engineer2.hashCode());

        Engineer engineer3= new Engineer("Shelby", 44,"Mechanical");
        System.out.println("Hashcode of engineer3: "+engineer3.hashCode());

        engineers.add(engineer1);
        engineers.add(engineer2);
        engineers.add(engineer3);

        for (Engineer var: engineers)
        {
            System.out.println("Name: "+var.getName()+", Age: "+var.getAge()+", Field: "+var.getField());
        }
    }
}
