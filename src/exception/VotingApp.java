package exception;

import javax.sound.midi.Soundbank;

public class VotingApp {

    //SYNTAX:  throw new ExceptionName("msg");

    public String doVoting(int age) throws AgeNotEligible{
        if(age>=18){
            return "Welcome to Voting App...";
        }else {
            //we need to throw an exception
            throw new AgeNotEligible("Age is less than 18 years so not eligible...");
        }

    }

    public static void main(String[] args) {

        VotingApp obj= new VotingApp();

        try {
            obj.doVoting(17);
        } catch (AgeNotEligible e) {
            System.out.println("Exception occurred..." +e);
        }
    }
}
