package ParameterizedConstructors;

import jdk.nashorn.internal.runtime.regexp.joni.exception.JOniException;

public class Engineer
{
    String Name;
    int Age;
    int Experience;
    double Salary;
    String Qualifications;

    public Engineer(String name, int age, int experience, double salary, String qualifications)
    {
        Name = name;
        Age = age;
        Experience = experience;
        Salary = salary;
        Qualifications = qualifications;
    }

    public static void main(String[] args)
    {
        Engineer data= new Engineer("Joe Barbaro",24,4,9.5,"B.Tech");
        System.out.println("Name: "+data.Name+" Age: "+data.Age+" Experience: "+data.Experience+" Salary: "+data.Salary+" Lacs"+" Qualifications: "+data.Qualifications);
    }
}
