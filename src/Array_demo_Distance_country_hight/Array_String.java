package Array_demo_Distance_country_hight;

public class Array_String {

    public static void main(String[] args) {

        // store country of 4

        //SYNTAX : Datatype varName [] = {value1, value2,value3.......valune N};

        String country[] = {"india", "delhi", "mumbai", "agra", "tundla", "firozabad"};

        System.out.println("Printing Data: " + country[5]);

        for (int i = 0; i < country.length; i++) {
            System.out.println("Printing in for loop : " + country[i]);
        }

        int k = 0;
        while (k < country.length) {

            System.out.println("Printing using while loop..." + country[k]);
            k++;
        }

        int i = 0;

        do {
            System.out.println("Printing using do while loop.." + country[i]);
            i++;
        } while (i < country.length);


    }
}
