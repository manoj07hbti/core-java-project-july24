package collections.set;

import model.Engineer;

import java.util.HashSet;

public class EngineerHashCode {

    public static void main(String[] args) {

        HashSet<Engineer> engineers = new HashSet<>();

        Engineer engineer1 = new Engineer("Anshul", 25, "Kashipur", "IT");

        System.out.println("HAshocde of engineer1...." + engineer1.hashCode());

        Engineer engineer2 = new Engineer("Anshul", 25, "Kashipur", "IT");

        System.out.println("Hashcode of engineer2..." + engineer2.hashCode());

        Engineer engineer3 = new Engineer("Riyaz", 25, "Haldwani", "MBBS");

        System.out.println("Hashcode os engineer3..." + engineer3.hashCode());

        Engineer engineer4 = new Engineer("Riyaz", 26, "Haldwani", "MBBS");

        System.out.println("Hashcode of engineer4 " + engineer4.hashCode());

        engineers.add(engineer1);
        engineers.add(engineer2);
        engineers.add(engineer3);
        engineers.add(engineer4);

        for (Engineer var : engineers) {
            System.out.println(" Name. " + var.getName() + "  Age " + var.getAge() + " City " + var.getCity() + " Branch " + var.getBranch());
        }

    }


}
