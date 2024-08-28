package ParameterizedConstructors;

public class Person
{
    String Name;
    int Age;
    String Gender;
    double Salary;                //Thousands of Euros
    String Occupation;

    public Person(String name, int age, String gender, double salary, String occupation)
    {
        Name = name;
        Age = age;
        Gender = gender;
        Salary = salary;
        Occupation = occupation;
    }

    public static void main(String[] args)
    {
        Person data= new Person("Simon (Ghost) Riley",40,"Male",42.8,"Lieutenant, Special Air Service (United Kingdom)");
        System.out.println("Name: "+data.Name+" Age: "+data.Age+" Gender: "+data.Gender+" Salary: €"+data.Salary+" k"+" Occupation: "+data.Occupation);
    }
}
