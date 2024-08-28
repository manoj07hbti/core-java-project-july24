package ParameterizedConstructors;

public class Doctor
{
    String Name;
    int Age;
    double Salary;
    String Job;
    String Qualifications;

    public Doctor(String name, int age, double salary, String job, String qualifications)
    {
        Name = name;
        Age = age;
        Salary = salary;
        Job = job;
        Qualifications = qualifications;
    }

    public static void main(String[] args)
    {
        Doctor data= new Doctor("David Johnson",56,98.4,"Neurosurgeon","M.B.B.S., Masters in Surgery and Masters in Neurosurgery");
        System.out.println("Name: "+data.Name+" Age: "+data.Age+" Salary: ₹"+data.Salary+" Lacs"+" Job: "+data.Job+"Qualifications: "+data.Qualifications);
    }
}
