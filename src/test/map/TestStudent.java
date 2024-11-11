package test.map;
import model.Student1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TestStudent {
    public ArrayList<Student1> createStudentData(){
        System.out.println("Please enter number of students to enter: ");
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();

        ArrayList<Student1>studentArrayList=new ArrayList<>();
        for (int i=0;i<count;i++){

            Scanner scanner1= new Scanner(System.in);
            System.out.println("Please enter Name:");
            String name= scanner1.nextLine();

            Scanner scanner2= new Scanner(System.in);
            System.out.println("Please enter Age:");
            int age=scanner2.nextInt();

            Scanner scanner3=new Scanner(System.in);
            System.out.println("Please enter City:");
            String city= scanner3.nextLine();

            Scanner scanner4= new Scanner(System.in);
            System.out.println("Please enter Dept:");
            String dept= scanner4.nextLine();

            Student1 student=new Student1(name,age,city,dept);
            studentArrayList.add(student);
        }
        return studentArrayList;

    }
    public void findHighestLowestAge(ArrayList<Student1>studentArrayList){
        int highestAge=0;
        int lowestAge=Integer.MAX_VALUE;
        // finding highest age
        for (Student1 student:studentArrayList){
            if(highestAge<student.getAge()){
                highestAge=student.getAge();
            }
        }
        System.out.println("We have found the Highest age: "+highestAge);

        for (Student1 student:studentArrayList){
            if(lowestAge>student.getAge()){
                lowestAge=student.getAge();
            }
        }
        System.out.println("We have found the Highest age: "+lowestAge);
    }
    public void findSameCity(HashMap<String,ArrayList<Student1>>studentMap){
        System.out.println("which School data you want to compare");
        Scanner scanner= new Scanner(System.in);
        String school1= scanner.nextLine();
        System.out.println("which School data you want to compare");
        Scanner scanner1=new Scanner(System.in);
        String school2= scanner1.nextLine();

        ArrayList <Student1> school1Student= studentMap.get(school1);
        ArrayList <Student1> school2Student= studentMap.get(school2);

        for(Student1 school1Stud : school1Student){

            for(Student1 school2Stud : school2Student){

                if(school1Stud.getCity().equals(school2Stud.getCity())){

                    System.out.println("COMPANY 1: Name: "+school1Stud.getName()+" Age :"+school1Stud.getAge()+ " City: "+school1Stud.getCity() +" Dept: "+school1Stud.getDept());
                    System.out.println("COMPANY 2: Name: "+school2Stud.getName()+" Age :"+school2Stud.getAge()+ " City: "+school2Stud.getCity() +" Dept: "+school2Stud.getDept());

                }
            }
        }

    }
    public void findSameAge(HashMap<String,ArrayList<Student1>>studentMap){
        System.out.println("which School data you want to compare");
        Scanner scanner= new Scanner(System.in);
        String school1= scanner.nextLine();
        System.out.println("which School data you want to compare");
        Scanner scanner1=new Scanner(System.in);
        String school2= scanner1.nextLine();

        ArrayList <Student1> school1Student= studentMap.get(school1);
        ArrayList <Student1> school2Student= studentMap.get(school2);

        for(Student1 school1Stud : school1Student){

            for(Student1 school2Stud : school2Student){

                if(school1Stud.getAge()==(school2Stud.getAge())){

                    System.out.println("COMPANY 1: Name: "+school1Stud.getName()+" Age :"+school1Stud.getAge()+ " City: "+school1Stud.getCity() +" Dept: "+school1Stud.getDept());
                    System.out.println("COMPANY 2: Name: "+school2Stud.getName()+" Age :"+school2Stud.getAge()+ " City: "+school2Stud.getCity() +" Dept: "+school2Stud.getDept());

                }
            }
        }
    }


    public static void main(String[] args) {
        TestStudent obj=new TestStudent();
        HashMap<String,ArrayList<Student1>>studentMap=new HashMap<>();
        String choice="Y";
        while (choice.equals("Y")){

            System.out.println("Please enter for which School you want to enter data: ");
            Scanner scanner=new Scanner(System.in);
            String schoolName=scanner.nextLine();
            ArrayList<Student1>studentArrayList=obj.createStudentData();

            studentMap.put(schoolName,studentArrayList);

            for (String key:studentMap.keySet()){
                for (Student1 student:studentMap.get(key)){
                    System.out.println("School Name: "+key);
                    System.out.println("Name: "+student.getName()+" Age: "+student.getAge()+" City: "+student.getCity()+" Dept: "+student.getDept());
                }

            }

            System.out.println("Do yo want to add more school data: Press Y for Yes or any other key to exit");
            Scanner scanner1=new Scanner(System.in);
            choice=scanner1.nextLine();
        }

        //1.School wise data

        //2.HighestLowestAge
        obj.findHighestLowestAge(studentMap.get("JNU"));
        obj.findHighestLowestAge(studentMap.get("AMU"));

        //3.Same city
        obj.findSameCity(studentMap);

        //4.Same age
        obj.findSameAge(studentMap);



    }
}
