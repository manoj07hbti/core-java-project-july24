package demo;

public class Variableadvance {

    public static void main(String[] args) {

        //SYNTAX : Datatype varName = value ;  // declaration + Assignment

        String cityName = "Agra" ;
        System.out.println("Printing city: "+cityName);
        int distance=500;
        System.out.println("Printing distance: "+distance);
        double percentage=59.45;
        System.out.println("Printing %: "+percentage);

        System.out.println("City: "+cityName + " Distance: "+distance +" Percentage: "+percentage);

        // reuse same variable oldVariable= newValue;
        cityName="Pune"; // we have used old variable with new data or value
        System.out.println("New Value of city is  :"+cityName);

    }
}
