package collections.set;
//HashSet does not store insertion order hence we use LinkedHashSet

import java.util.LinkedHashSet;

public class DemoLinkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet<String> course = new LinkedHashSet<>();

        course.add("Java");
        course.add("Spring Spring Boot");
        course.add("MicroService");
        course.add("Cloud");

        for(String var : course){
            System.out.println(var);
        }

    }
}
