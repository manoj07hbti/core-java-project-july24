package DefaultConstructors;

public class Engineer
{
    String Name="Joe Barbaro";
    int Age=24;
    int Experience=4;
    double Salary=9.5;
    String Qualifications="B.Tech";

    public static void main(String[] args)
    {
        Engineer data = new Engineer();
        System.out.println("Name: "+data.Name);
        System.out.println("Age: "+data.Age);
        System.out.println("Experience: "+data.Experience);
        System.out.println("Salary: "+data.Salary);
        System.out.println("Qualifications: "+data.Qualifications);

        System.out.println("Name: "+data.Name+" Age: "+data.Age+ " Experience: "+data.Experience+" Salary: "+data.Salary+" Qualifications: "+data.Qualifications);
    }
}
