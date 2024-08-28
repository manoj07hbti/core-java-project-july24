package DefaultConstructors;

public class Doctor
{
    String Name="David Johnson";
    int Age=56;
    double Salary=98.4;
    String Job="Neurosurgeon";
    String Qualifications="M.B.B.S., Masters in Surgery and Masters in Neurosurgery";

    public static void main(String[] args)
    {
        Doctor data = new Doctor();

        System.out.println("Name: "+data.Name);
        System.out.println("Age: "+data.Age);
        System.out.println("Salary: "+data.Salary);
        System.out.println("Job: "+data.Job);
        System.out.println("Qualifications: "+data.Qualifications);

        System.out.println("Name: "+data.Name+" Age: "+data.Age+" Salary: "+data.Salary+" Job: "+data.Job+ " Qualifications: "+data.Qualifications);
    }
}
