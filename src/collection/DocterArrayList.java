package collection;

import model.Docter;
import java.util.ArrayList;
import java.util.Scanner;

public class DocterArrayList {

    public ArrayList<Docter> createDocter(){
        ArrayList <Docter> docterArrayList = new ArrayList<>();
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
            docterArrayList.add(docter);
        }
        return docterArrayList;
    }

    public static void main(String[] args) {
        DocterArrayList obj = new DocterArrayList();
        ArrayList<Docter>  docterlist= obj.createDocter();

        System.out.println("USING FOR LOOP");
        for(int i=0; i<docterlist.size(); i++){
            System.out.println("NAME:"+docterlist.get(i).getName()+" "+"EXPERIENCE:"+docterlist.get(i).getExperience()+" "+"POST:"+docterlist.get(i).getPost());
        }


        System.out.println("USING WHILE LOOP");
        int i=0;
        while(i<docterlist.size()){
         System.out.println("NAME:"+docterlist.get(i).getName()+" "+"EXPERIENCE:"+docterlist.get(i).getExperience()+" "+"POST:"+docterlist.get(i).getPost());
           i++;
     }

        System.out.println("USING DO WHILE LOOP");
         i=0;
        do{
            System.out.println("NAME:"+docterlist.get(i).getName()+" "+"EXPERIENCE:"+docterlist.get(i).getExperience()+" "+"POST:"+docterlist.get(i).getPost());
        i++;
        }while(i<docterlist.size());
    }
}
