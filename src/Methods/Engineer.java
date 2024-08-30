package Methods;

public class Engineer
{
    public void design()
    {
        System.out.println("You're printing the designing method in Doctor class...");
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
        Engineer data = new Engineer();
        data.design();
        data.eat();
        data.sleep();
    }
}
