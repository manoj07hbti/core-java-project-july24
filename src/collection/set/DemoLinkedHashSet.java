package collection.set;

import java.util.LinkedHashSet;

public class DemoLinkedHashSet {


    public static void main(String[] args) {


        LinkedHashSet<String>course=new LinkedHashSet<>();

        course.add("java");
        course.add("microsoft");
        course.add("spring");
        course.add("cloud");

        for(String var: course){

            System.out.println(var);
        }

    }
}
