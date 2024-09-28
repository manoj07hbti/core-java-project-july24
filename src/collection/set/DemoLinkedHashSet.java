package collection.set;

import java.util.LinkedHashSet;

public class DemoLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<String> course= new LinkedHashSet<>();

        course.add("Java");
        course.add("Spring and Spring Boot");
        course.add("Microservice");
        course.add("Cloud");

       for(String var: course){
           System.out.println(var);
       }


    }
}
