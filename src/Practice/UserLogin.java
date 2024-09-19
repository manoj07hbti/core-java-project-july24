package Practice;

import java.util.Scanner;

public class UserLogin
{
    public void InputName()
    {

        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.nextLine();

            if (Name.equalsIgnoreCase("Hitesh"))
            {
                System.out.println("Hi Hitesh, welcome back!");
            } else
            {
                System.out.println("Please re login correctly");
            }

    }

    public static void main(String[] args)
    {
        UserLogin obj= new UserLogin();
        obj.InputName();
    }
}
