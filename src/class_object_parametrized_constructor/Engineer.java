package class_object_parametrized_constructor;

public class Engineer {
    String name;
    int age;
    String branch;
    String city;

    public Engineer(String name, int age, String branch, String city) {
        this.name = name;
        this.age = age;
        this.branch = branch;
        this.city = city;
    }

    public static void main(String[] args) {



    Engineer eng1 =new Engineer("Arun ", 30, "Civil engineer", "Dehradun" );
    Engineer eng2 =new Engineer ("Faizan", 25, "Software", "Dehradun" );
    Engineer eng3=new Engineer("Akhil",28,"CS","Roorkee");
        System.out.println(" Name "+eng1.name + " Age " +eng1.age + " Branch " +eng1.branch + " City " +eng1.city);
        System.out.println(" Name "+eng2.name + " Age " +eng2.age + " Branch " +eng2.branch + " City " +eng2.city);
        System.out.println(" Name "+eng3.name + " Age " +eng3.age + " Branch " +eng3.branch + " City " +eng3.city);


    }
}