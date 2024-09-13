package class_oprion_param_constructor;

public class Engineer {
    String name;
    int age;
    String department;

    public Engineer(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public static void main(String[] args) {
        Engineer eng1=new Engineer("Jatin",26,"JMC");
        System.out.println("Name "+eng1.name+" , Age: "+eng1.age+" , Department: "+eng1.department);
        Engineer eng2=new Engineer("Mahesh",28,"PWD");
        System.out.println("Name: "+eng2.name+" , Age: "+eng2.age+" , Department: "+eng2.department);
        Engineer eng3=new Engineer("Suresh",27,"MECH");
        System.out.println("Name: "+eng3.name+" , Age: "+eng3.age+" , Department: "+eng3.department);
        Engineer eng4=new Engineer("Mitesh",30,"Civil");
        System.out.println("Name: "+eng4.name+" , Age: "+eng4.age+" , Department: "+eng4.department);
        Engineer eng5=new Engineer("Sohail",31,"Electrical");
        System.out.println("Name: "+eng5.name+" , Age: "+eng5.age+" , Department: "+eng5.department);
    }
}
