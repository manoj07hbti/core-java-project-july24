package exception;

public class VotingApp {

    public String doVoting(int age) throws AgeNotEligible {

        if (age >= 18) {
            return "Welcome to voting app ";
        } else {
            // We need to throw an exception

            throw new AgeNotEligible("Age is less than 18 so it is not valid for voting");
        }

    }


    public static void main(String[] args) {
        VotingApp obj = new VotingApp();
        try {
            obj.doVoting(17);
        } catch (AgeNotEligible e) {
            System.out.println("Exception occurred " + e);
        }
    }


}
