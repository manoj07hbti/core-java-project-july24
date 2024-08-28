package DefaultConstructors;

public class Person
{
    String Name="Simon (Ghost) Riley";
    int Age=40;
    String Gender="Male";
    double Salary=42.8;                 //Thousands of Euros
    String Occupation="Lieutenant, Special Air Service (United Kingdom)";

    public static void main(String[] args)
    {
        Person data= new Person();

        System.out.println("Name: "+data.Name);
        System.out.println("Age: "+data.Age);
        System.out.println("Gender: "+data.Gender);
        System.out.println("Salary: € "+data.Salary+"k");
        System.out.println("Occupation: "+data.Occupation);

        System.out.println("Name: "+data.Name+" Age: "+data.Age+" Gender: "+data.Gender+" Salary: € "+data.Salary+"k"+" Occupation: "+data.Occupation);
    }
}
