package assignment;

public class AndOperator2 {
    public static void main(String[] args) {
        double percentage=30;
        if(percentage>=33 && percentage<60){
            System.out.println("Secong division");
        }else if(percentage>=60 && percentage<75){
            System.out.println("First division");
        }else if(percentage>=75){
            System.out.println("Gold Medalist");
        }

        int age=65;
        if(age>0 && age<18){
            System.out.println("Child");
        }else if(age>=18 && age<=40){
            System.out.println("Young");
        }else if(age>=60){
            System.out.println("Old");
        }

        int x=16;
        if(!(x%3==0)){
            System.out.println("Number not divisible by 3");
        }




    }
}
