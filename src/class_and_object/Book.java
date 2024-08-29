package class_and_object;

public class Book {

    //properties = data members
    // Data varName=Value;

    String name = "Java";
    int pages = 500;
    double price = 454.67;
    String writeName = "Games Gosling";


    public static void main(String[] args) {
        // SYNTAX  ClassName objName= new ClassName();
        Book obj1= new Book();  // we have created object as obj1
       // object.propertyName;
        System.out.println("Printing object name "+obj1.name);
        System.out.println("Printing object write Name "+obj1.writeName);
        System.out.println("Printing object Pages: "+obj1.pages);
        System.out.println("Printing object Price: "+obj1.price);

        System.out.println("Name: "+obj1.name +" WriteName: "+obj1.writeName+ " Pages: "+obj1.pages+" Price: "+obj1.price);

        Book obj2= new Book(); // we have created obj2 object of Book Class

        System.out.println("OBJ2: Name: "+obj2.name +" WriteName: "+obj2.writeName+ " Pages: "+obj2.pages+" Price: "+obj2.price);
    }

}
