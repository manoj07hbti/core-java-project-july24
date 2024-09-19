package Practice;

import java.util.Scanner;

public class PersonDetails
{
    public void InputName()
    {
        //Person's Name
        System.out.println("Enter your name:");
        Scanner scanner= new Scanner(System.in);
        String Name= scanner.nextLine();
    }
    public void InputAge()
    {
        //Person's Age
        System.out.println("Enter your age:");
        Scanner scanner1= new Scanner(System.in);
        int Age= scanner1.nextInt();
    }
    public void InputGender()
    {
        //Person's Gender
        System.out.println("Enter your gender:");
        Scanner scanner2= new Scanner(System.in);
        String Gender= scanner2.nextLine();

        if (Gender.equalsIgnoreCase("Male"))
        {
            System.out.println("Your gender is male");
        }else if (Gender.equalsIgnoreCase("Female"))
        {
            System.out.println("Your gender is female");
        }else
        {
            System.out.println("Please enter Male or Female");
            Gender= scanner2.next();
        }
    }
    public void InputHeight()
    {
        //Person's Height
        System.out.println("Enter your height (in Ft):");
        Scanner scanner= new Scanner(System.in);
        double Height= scanner.nextDouble();
    }
    public void InputCity()
    {
        //Person's City
        System.out.println("Enter your city here:");
        Scanner scanner= new Scanner(System.in);
        String City= scanner.nextLine();
    }
    public void InputAddress()
    {
        //Person's Address
        System.out.println("Please enter your address here:");
        Scanner scanner= new Scanner(System.in);
        String Address= scanner.nextLine();
    }
    public void MaritalStatus()
    {
        System.out.println("Please enter your Marital Status:");
        System.out.println("e.g., Single, Dating, Married, Divorced, Widowed, Separated and Living common law");
        Scanner scanner= new Scanner(System.in);
        String Marital= scanner.nextLine();

        if (Marital.equalsIgnoreCase("Single"))
        {
            System.out.println("Marital status: Single");
        } else if (Marital.equalsIgnoreCase("Married"))
        {
            System.out.println("Marital status: Married");
        } else if (Marital.equalsIgnoreCase("Divorced"))
        {
            System.out.println("Marital status: Divorced");
        } else if (Marital.equalsIgnoreCase("Separated"))
        {
            System.out.println("Marital status: Separated");
        } else if (Marital.equalsIgnoreCase("Living common law"))
        {
            System.out.println("Marital status: Living common law");
        } else if (Marital.equalsIgnoreCase("Dating"))
        {
            System.out.println("Marital status: Dating");
        } else
        {
            System.out.println("Invalid option, enter status from the above options");
            Marital= scanner.next();
        }
    }
    public void InputOccupation()
    {
        //Person's Occupation
        System.out.println("Please enter your occupation here:");
        Scanner scanner= new Scanner(System.in);
        String Occupation= scanner.nextLine();
    }
    public void InputLPA()
    {
        //Person's LPA
        System.out.println("Please enter your LPA");
        Scanner scanner= new Scanner(System.in);
        boolean LPA= scanner.hasNextBoolean();
    }
    public static void main(String[] args)
    {
        System.out.println("Please fill the details");
        PersonDetails obj= new PersonDetails();

        obj.InputName();
        obj.InputAge();
        obj.InputGender();
        obj.InputHeight();
        obj.InputCity();
        obj.InputAddress();
        obj.MaritalStatus();
        obj.InputOccupation();
        obj.InputLPA();
    }
}
