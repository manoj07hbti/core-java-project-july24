package collections.list;

import model.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonArrayList {

    public ArrayList<Person> createPersonList() {

        ArrayList<Person> personArrayList = new ArrayList<>();

        System.out.println(" how many person to add data");

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();


        Scanner scanner2= new Scanner(System.in);
        for (int i = 0; i < size; i++) {

            System.out.println("please enter name ");
            String name = scanner2.nextLine();
            System.out.println("please enter age");
            int age = scanner2.nextInt();
            Scanner scanner3= new Scanner(System.in);
            System.out.println("please enter field");
            String field = scanner2.nextLine();
            Person person = new Person(name, age, field);
            personArrayList.add(person);
        }

        return personArrayList;

    }

    public static void main(String[] args) {

        PersonArrayList obj = new PersonArrayList();

        for (Person var : obj.createPersonList()) {

            System.out.println("person name" + var.getName() + "age" + var.getAge() + "field" + var.getField());
        }




    }

}
