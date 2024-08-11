package test_11_august;

public class VoterClass {

    public static void main(String[] args) {


        //2)write a code to check eligible voter in pune

        int age=23;
        String city="pune";

        if(age>=18 && city=="pune"){
            System.out.println("ELIGIBLE VOTER IN PUNE");
        }else{
            System.out.println("NOT ELIGIBLE VOTER IN PUNE");
        }
    }
}
