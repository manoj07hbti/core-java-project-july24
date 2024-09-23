package collections;

import model.Person;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonArrayList {

    public ArrayList<Person> createPersonList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> personArrayList = new ArrayList<>();
        System.out.println("Enter number of persons you want to add..");
        int numberOfPerson = scanner.nextInt();

        for (int i = 0; i < numberOfPerson; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter your name..");
            String name = scanner1.nextLine();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter your age...");
            int age = scanner2.nextInt();
            Scanner scanner3 = new Scanner(System.in);

            System.out.println("Enter your city name..");
            String cityName = scanner3.nextLine();

            Person person = new Person(name, age, cityName);
            personArrayList.add(person);
        }
        return personArrayList;
    }

    public static void main(String[] args) {
        PersonArrayList obj = new PersonArrayList();
        ArrayList<Person> personArrayList = new ArrayList<>();
        for (Person var : obj.createPersonList()) {
            System.out.println("Printing name." + var.getName() + " Age " + var.getAge() + " City " + var.getCity());

            System.out.println("Printing using while loop..");
            int i = 0;
            while (i < personArrayList.size()) {
                System.out.println("Names.. " + var.getName() + " Age " + var.getAge() + " City " + var.getCity());
                i++;
            }

            System.out.println("Printing using do while loop..");
            i = 0;

            do {
                System.out.println("Names.." + var.getName() + "Age " + var.getAge() + "City " + var.getCity());
                i++;
            } while (i < personArrayList.size());
        }
    }

}
