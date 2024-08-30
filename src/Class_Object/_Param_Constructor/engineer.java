package Class_Object._Param_Constructor;

public class engineer {

    String name;
    int age;
    String city;
    String section;

    public engineer(String name, int age, String city, String section) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.section = section;
    }

    public static void main(String[] args) {

        //className objName = new className (value1, value2, value3.....valueN);

        engineer engineer1= new engineer ("inaaya",22,"pune","java diploma");

        System.out.println("engineer1: NAME " + engineer1. name+ "engineer1: age " + engineer1.age+ " engineer1: city "+engineer1. city+"engineer1: section "+ engineer1.section );

        engineer engineer2= new engineer("neelm", 32, "tundla", "soft were diploma");

        System.out.println("engineer2: Name "+ engineer2 .name+ "engineer2: age "+engineer2.age+ "engineer2: city "+engineer2.city+ "engineer2: section "+engineer2.section );
    }
}
