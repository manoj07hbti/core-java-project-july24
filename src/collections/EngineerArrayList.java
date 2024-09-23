package collections;

import model.Engineer;

import java.util.ArrayList;
import java.util.Scanner;

public class EngineerArrayList {

    public ArrayList<Engineer> createEngineerList() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Engineer> engineerArrayList = new ArrayList<>();
        System.out.println("Please enter number of engineer you want to enter");
        int numberOfEngineer = scanner.nextInt();

        for (int i = 0; i < numberOfEngineer; i++) {

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please enter name..");
            String name = scanner1.nextLine();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Please enter age..");
            int age = scanner2.nextInt();
            Scanner scanner3 = new Scanner(System.in);

            System.out.println("please enter your city");
            String city = scanner3.nextLine();

            Scanner scanner4 = new Scanner(System.in);

            System.out.println("Please enter your branch");
            String branch = scanner4.nextLine();

            Engineer engineer = new Engineer(name, age, city, branch);
            engineerArrayList.add(engineer);
        }

        return engineerArrayList;

    }

    public static void main(String[] args) {
        EngineerArrayList obj = new EngineerArrayList();
        ArrayList<Engineer> engineerArrayList = new ArrayList<>();

        for (Engineer var : obj.createEngineerList()) {
            System.out.println(" Printing name. " + var.getName() + " Age " + var.getAge() + " City " + var.getCity() + " Branch " + var.getBranch());

            System.out.println("Printing using while loop..");

            int i = 0;
            while (i < engineerArrayList.size()) {
                System.out.println("Printing name.." + engineerArrayList.get(i).getName() + "Age " + engineerArrayList.get(i).getAge() + "City " + engineerArrayList.get(i).getCity() + "Branch " + engineerArrayList.get(i).getBranch());
                i++;
            }


            System.out.println("Printing using do while loop..");

            i = 0;
            do {
                System.out.println("Printing name." + engineerArrayList.get(i).getName() + "Age " + engineerArrayList.get(i).getAge() + "City " + engineerArrayList.get(i).getCity() + "Branch " + engineerArrayList.get(i).getBranch());
                i++;
            } while (i < engineerArrayList.size());
        }
    }

}
