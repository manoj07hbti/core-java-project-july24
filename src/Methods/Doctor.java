package Methods;

public class Doctor
{
    public void surgery()
    {
        System.out.println("You're printing the surgery method in Doctor class...");
    }
    public void eat()
    {
        System.out.println("You're printing the eating method in Doctor class...");
    }
    public void sleep()
    {
        System.out.println("You're printing the sleeping method in Doctor class...");
    }

    public static void main(String[] args)
    {
        Doctor data = new Doctor();
        data.surgery();
        data.eat();
        data.sleep();
    }
}
