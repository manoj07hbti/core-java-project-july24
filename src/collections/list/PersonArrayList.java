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

        Scanner scanner1 = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.println("please enter name ");

            String name = scanner1.nextLine();

            System.out.println("please enter age");

            int age = scanner1.nextInt();

            System.out.println("please enter field");

            String field = scanner1.nextLine();

            Person person = new Person(name, age, field);

            personArrayList.add(person);
        }

        return personArrayList;

    }

    public static void main(String[] args) {

        PersonArrayList obj = new PersonArrayList();

        for (Person person : obj.createPersonList()) {

            System.out.println("person name" + person.getName() + "age" + person.getAge() + "field" + person.getField());
        }
    }

}
