package collection;

import model.Person;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonArrayList {

    public ArrayList<Person> createPerson(){
        ArrayList<Person> personArrayList= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("HOW MANY PERSON'S DATA ,THAT YOU WANT TO ADD IN A LIST ?");
        int size=scanner.nextInt();
        for(int i=0; i<size; i++){
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("PLEASE ENTER DATA OF PERSON"+(i+1) + ":");

            System.out.println("NAME:");
            String name=scanner1.nextLine();

            System.out.println("AGE");
            int age=scanner1.nextInt();

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("GENDER");
            String gender=scanner2.nextLine();

            Person person = new Person(name, age , gender);
            personArrayList.add(person);
        }
        return personArrayList;
    }


    public static void main(String[] args) {
        PersonArrayList obj = new PersonArrayList();
      ArrayList <Person> person = obj.createPerson();

        System.out.println("USING FOR LOOP:");
        for(int i=0; i< person.size(); i++){
            System.out.println("NAME:"+  person.get(i).getName()+" "+ "AGE:"+  person.get(i).getAge()+" "+"GENDER:"+  person.get(i).getGender());
        }

        System.out.println("USING WHILE LOOP");
        int i=0;
        while(i< person.size()){
            System.out.println("NAME:"+  person.get(i).getName()+" "+ "AGE:"+  person.get(i).getAge()+" "+"GENDER:"+  person.get(i).getGender());
            i++;
        }

        System.out.println("USING DO WHILE LOOP");
        i=0;
        do{
            System.out.println("NAME:"+  person.get(i).getName()+" "+ "AGE:"+  person.get(i).getAge()+" "+"GENDER:"+  person.get(i).getGender());
        i++;
        }while(i< person.size());
    }
}
