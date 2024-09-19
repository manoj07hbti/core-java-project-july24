package Practice;

import java.util.Scanner;

public class VotingProgram
{
    public void CheckingAgeAndCity()
    {
        System.out.println("Please enter your age:");
        Scanner scanner= new Scanner(System.in);
        int Age= scanner.nextInt();

        System.out.println("Please enter your city:");
        Scanner scanner1= new Scanner(System.in);
        String City= scanner1.nextLine();

        if(Age>= 18 && City.equalsIgnoreCase("Agra"))
        {
            System.out.println("You are eligible for voting in Agra");
        }
        else if(Age< 18 && City.equalsIgnoreCase("Agra"))
        {
            System.out.println("Your age is "+Age+" and you can't vote");
        }
        else if(Age>= 18 && !City.equalsIgnoreCase("Agra"))
        {
            System.out.println("You do not belong from Agra, you can't vote in Agra");
        }else
        {
            System.out.println("You do not belong from Agra and you're a minor");
        }

    }

    public static void main(String[] args)
    {
        VotingProgram obj= new VotingProgram();
        obj.CheckingAgeAndCity();
    }
}
