package Collection.List.Set;

import Model.Docter;

import java.util.HashSet;

public class DocterHashSet {

    public static void main(String[] args) {

        HashSet<Docter> docters = new HashSet<>();

        Docter docter1 = new Docter("zuhan", 20, "madicine");
        System.out.println("Hashcode of docter1...." + docter1.hashCode());

        Docter docter2 = new Docter("zuhan", 20, "madicine");
        System.out.println("Hashcode of docter2...." + docter2.hashCode());

        Docter docter3 = new Docter("Ramsha", 22, "Derma");
        System.out.println("Hashcode of docter3...." + docter3.hashCode());

        docters.add(docter1);
        docters.add(docter2);
        docters.add(docter3);

        for (Docter var : docters) {

            System.out.println(" Name " + var.getName() + " Age " + var.getAge() + " Section " + var.getDepartment());

        }
    }
}