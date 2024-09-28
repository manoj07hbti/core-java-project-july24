package set;

import model.Engineer;
import java.util.HashSet;
import java.util.Scanner;

public class EngineerHashSet {

    HashSet<Engineer> createEngineer() {
        HashSet<Engineer> engineerHashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many data of engineer ,that you want to enter? ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("PLEASE ENTER DATA OF ENGINEER" + (i + 1) + ":");

            System.out.println("NAME:");
            String name = scanner1.nextLine();

            System.out.println("AGE");
            int age = scanner1.nextInt();

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("DEPARTMENT");
            String dep = scanner2.nextLine();

            Engineer engineer = new Engineer(name, age, dep);
            engineerHashSet.add(engineer);
        }
        return engineerHashSet;
    }

    public static void main(String[] args) {
       EngineerHashSet obj = new EngineerHashSet();
        for(Engineer var: obj.createEngineer()){
            System.out.println("NAME:" + var.getName() + " " + "AGE:" + var.getAge() + " " + "DEPARTMENT:" + var.getDepartment());
        }

    }
}
