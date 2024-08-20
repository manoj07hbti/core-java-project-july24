package array;

public class StringArrayAssignment {

    public static void main(String[] args) {

        // Syntax :   Datatype varname [] = {value1, value2, value3,....valueN};

        // write a code for string array country

        String country[] = {"INDIA", "USA", "MEXICO", "BRAZIL", "LUXEMBOURG", "DUBAI", "TURKEY", "VENEZUELA", "COLOMBIA"};

        System.out.println("Printing country..." + country[5]);

        for (int i = 0; i <= country.length; i++) {
            System.out.println("Printing country names.." + country[i]);

            int j = 0;
            while (j < country.length) {
                System.out.println("Printing using while loop..." + country[j]);
            }
        }

        for (String var : country) {
            System.out.println("Printing using advanced loop.. " + var);
        }


    }


}
