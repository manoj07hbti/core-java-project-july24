package Collections.UserDefined;

import Model.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonList_DoWhileLoop
{
    public ArrayList <Person> createPersonList()
    {
        //Creating ArrayList
        ArrayList<Person> personArrayList= new ArrayList<>();

        Scanner scanner= new Scanner(System.in);
        System.out.println("How many names do you want to add?");
        int size= scanner.nextInt();
        scanner.nextLine();

        for (int i= 0; i<size; i++)
        {
            //Major details
            System.out.println("Please enter name:");
            String name= scanner.nextLine();

            System.out.println("Please enter age:");
            int age= scanner.nextInt();
            scanner.nextLine();

            System.out.println("Please enter weight:");
            double weight= scanner.nextDouble();
            scanner.nextLine();

            Person person= new Person(name, age, weight);
            personArrayList.add(person);
        }
        return personArrayList;
    }

    public static void main(String[] args)
    {
        PersonList_DoWhileLoop personList= new PersonList_DoWhileLoop();
        ArrayList<Person> personArrayList= personList.createPersonList();

        int i=0;
        do
        {
            Person person= personArrayList.get(i);
            System.out.println("Person's name: "+person.getName()+
                    " Age: "+person.getAge()+
                    " Weight: "+person.getWeight());
            i++;
        }while (i < personArrayList.size());
    }
}
