package collection.set;

import java.util.HashSet;
import java.util.Scanner;

public class DemoHashSet {

    //TODO create set for Integer and Double...
    public HashSet<String> createStringSet() {
        //CollectionName <Datatype> objName = new CollectionName<>();
        HashSet<String> course = new HashSet<>();
        System.out.println("Please enter number of Subjects: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            Scanner scanner1 = new Scanner(System.in);
            String courseName = scanner1.nextLine();
            course.add(courseName);
        }

        return course;
    }

    public static void main(String[] args) {

        DemoHashSet obj= new DemoHashSet();
        for(String var: obj.createStringSet()){
            System.out.println("Printing HashSet: "+var);
        }
    }
}
