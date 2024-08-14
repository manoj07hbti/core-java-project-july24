package Practice;

public class IfElseIf
{
    public static void main(String[] args)
    {
        String User;
        String Password;

        User= "Michael";
        Password= "789";

        if(User== "Adam" && Password== "123")
        {
            System.out.println("You have successfully logged in your account, "+User);
        }
        else if(User== "Jay" && Password== "456")
        {
            System.out.println("You have successfully logged in your account, "+User);
        }
        else if (User== "Michael" && Password== "789")
        {
            System.out.println("You have successfully logged in your account, "+User);
        }
        else
        {
            System.out.println("User not found, please re-check your Password or Username :(");
        }

    }
}
