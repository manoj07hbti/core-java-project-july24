package Model;

public class Student {

    String Name;
    int Age;
   double Percentage;

    // param constructor


    public Student(String name, int age, double percentage) {
        Name = name;
        Age = age;
        Percentage = percentage;
    }

    //getter/setter


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public double getPercentage() {
        return Percentage;
    }

    public void setPercentage(double percentage) {
        Percentage = percentage;
    }
}
