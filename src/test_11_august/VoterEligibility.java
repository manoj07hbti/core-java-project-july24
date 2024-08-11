package test_11_august;

public class VoterEligibility {
    public static void main(String[] args) {


       int  age=17;
       String city="PUNE";
        if (age>=18 && city =="PUNE"){
            System.out.println("Person is eligible for voting in PUNE");
        }else {
            System.out.println("Person is NOT eligible for voting in PUNE");
        }

    }
}
