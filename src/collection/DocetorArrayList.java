package collection;

import model.Docetor;

import java.util.ArrayList;
import java.util.Scanner;

public class DocetorArrayList {


    public ArrayList<Docetor>createDocetor(){
       ArrayList<Docetor>DocetorArrayList=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);

        System.out.println("please enter the number of Doctor thats you want to enter");

        int size= scanner.nextInt();

        for(int i=0; i< size; i++ ){

            Scanner scanner1=new Scanner(System.in);

            System.out.println("data of doctor"+(i+1));

            System.out.println("name");
            String name= scanner1.nextLine();

            System.out.println("age");
            int age= scanner1.nextInt();

            System.out.println("degree");
            int department= scanner1.nextInt();


        }
        return DocetorArrayList;
    }

    public static void main(String[] args) {

        DocetorArrayList obj=new DocetorArrayList();

        for(Docetor var:obj.createDocetor()){

            System.out.println("name"+var.getName()+ "age" +var.getAge()+ "degree" +var.getDegree());
        }
    }
}
