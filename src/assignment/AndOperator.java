package assignment;

public class AndOperator {
    public static void main(String[] args) {
        //1. True && True = True
        double marks=70;
        String section="science";
        if(marks>=60 && section=="science"){
            System.out.println("Student  got 60%");
        }else {
            System.out.println("Student did not get 60% ");
        }
    //2. True && False =false
        marks=70;
        section="commerce";
        if(marks>=60 && section=="science"){
            System.out.println("Student  got 60%");
        }else {
            System.out.println("Student did not get 60% ");
        }
        //3. False && True =False
        marks=50;
        section="science";
        if(marks>=60 && section=="science"){
            System.out.println("Student  got 60%");
        }else {
            System.out.println("Student did not get 60% ");
        }
        //4. False && False =False
        marks=40;
        section="commerce";
        if(marks>=60 && section=="science"){
            System.out.println("Student  got 60%");
        }else {
            System.out.println("Student did not get 60% ");
        }




    int age=18;
        String state="UP";
        if(age>=18 && state=="UP"){
            System.out.println("candidaite eligible for voting in UP");
        }else {
            System.out.println("candidate is not eligible for voting in UP");
        }

        age=18;
        state="HP";
        if(age>=18 && state=="UP"){
            System.out.println("candidaite eligible for voting in UP");
        }else {
            System.out.println("candidate is not eligible for voting in UP");
        }
        age=17;
        state="UP";
        if(age>=18 && state=="UP"){
            System.out.println("candidaite eligible for voting in UP");
        }else {
            System.out.println("candidate is not eligible for voting in UP");
        }
        age=17;
        state="HP";
        if(age>=18 && state=="UP"){
            System.out.println("candidaite eligible for voting in UP");
        }else {
            System.out.println("candidate is not eligible for voting in UP");
        }

    }


}
