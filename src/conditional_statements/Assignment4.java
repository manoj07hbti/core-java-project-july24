package conditional_statements;

public class Assignment4 {

    public static void main(String[] args) {

        //1-percentage of student
        int percentage=74;

        if(percentage >=33 && percentage<60){
            System.out.println("Second Division");
        } else if (percentage>=60 && percentage<75){
            System.out.println("First Division");
        } else if (percentage >75) {
            System.out.println("Gold Medalist");
        } else {
            System.out.println("FAIL");
        }

        //2-check age group
        int age=22;

        if(age >0 && age<18){
            System.out.println("Child");
        } else if (age>=18 && age<=40){
            System.out.println("young");
        } else if (age >= 60) {
            System.out.println("OLD AGE");
        }

        //3- not divisible by 3
        int num=65;

        if(num%3 != 0){
            System.out.println(+num +" is not divisible by 3 ");
        }else{
            System.out.println(+num +" is divisible by 3 ");
        }


    }
}
