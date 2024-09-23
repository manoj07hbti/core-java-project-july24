package Methods;

public class Employee
{
    public void work()
    {
        System.out.println("You're printing working method in the Engineer class...");
    }
    public void eat()
    {
        System.out.println("You are printing eating method in the Engineer class...");
    }
    public void sleep()
    {
        System.out.println("You are printing sleeping method in the Engineer class...");
    }

    public static void main(String[] args)
    {
        Employee data = new Employee();
        data.work();
        data.eat();
        data.sleep();
    }
}
