package collection.set;

import java.util.HashSet;
import java.util.Scanner;


    public class StringHashSet {
        public HashSet<String> createStringSet() {
            Scanner scanner = new Scanner(System.in);
            HashSet<String> course = new HashSet<>();
            System.out.println("Please enter how much course you want to enter..");
            int size = scanner.nextInt();
            for (int i = 0; i < size; i++) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Enter course name...");
                String courseName = scanner1.nextLine();
                course.add(courseName);
            }
            return course;
        }
        public static void main(String[] args) {
            StringHashSet obj = new StringHashSet();
            for (String var : obj.createStringSet()) {
                System.out.println("Printing hashSet.." + var);
            }
        }
    }


