package assignment;

public class VoterEligibility {
    public static void main(String[] args) {
        String city="pune";
        int age=19;
        if(city=="pune" && age>=18){
            System.out.println("Voter is eligible for voting in Pune");
        }else{
            System.out.println("Not eligible");
        }
    }
}
