package set;

import model.Docter;

import java.util.HashSet;
import java.util.Scanner;

public class DocterHashSet {

        HashSet<Docter> createDocter(){
            HashSet <Docter> docterHashSet = new HashSet<>();

            Scanner scanner = new Scanner(System.in);
            System.out.println("how many data you want to add ?");
            int s= scanner.nextInt();
            for(int i=0; i<s; i++){
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("PLEASE ENTER DATA OF DOCTER"+(i+1) + ":");

                System.out.println("NAME:");
                String names=scanner1.nextLine();

                System.out.println("EXPERIENCE");
                int exp=scanner1.nextInt();

                Scanner scanner2 = new Scanner(System.in);
                System.out.println("SPECIALITY");
                String spec=scanner2.nextLine();

                Docter docter = new Docter(names,exp,spec);
                docterHashSet.add(docter);
            }
            return docterHashSet;
        }

    public static void main(String[] args) {
        DocterHashSet obj = new DocterHashSet();
        for (Docter var : obj.createDocter()) {
            System.out.println("NAME:"+ var.getName()+"EXPERIENCE:"+ var.getExperience()+"SPECILAITY:"+ var.getPost());
        }
    }

    }
