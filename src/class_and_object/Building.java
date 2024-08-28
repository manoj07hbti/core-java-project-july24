package class_and_object;

public class Building {
    String name = "MANNAT";
    int flor = 8;
    String city = "MUMBAI";
    double price = 700.80;
    String owner = "SHAH RUKHKHAN ";


    public static void main(String[] args) {

        //SYNTAX:  ClassName objName= New ClassName();

        Building obj1 = new Building();

        // object.propertyName;

        System.out.println("printing object name....."+obj1.name);
        System.out.println("printing object flor......"+obj1.flor);
        System.out.println("printing object city....."+obj1.city);
        System.out.println("printing object price......"+obj1.price);
        System.out.println("printing object owner....."+obj1.owner);


        System.out.println("printing name"+obj1.name+"printing flor...."+obj1.flor+"printing city..."+obj1.city+"printing pricer.."+obj1.price+"printing owner.."+obj1.owner);



    }

}
