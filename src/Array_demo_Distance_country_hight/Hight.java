package Array_demo_Distance_country_hight;

public class Hight {

    public static void main(String[] args) {

        double hight[] = {7};


        for (int i = 0; i < hight.length; i++) {
            System.out.println("Printing in for loop : " + hight[i]);
        }


        for (double var : hight) {

            System.out.println("printing hight  double" + var);
        }
        int j = 0;
        while (j < hight.length) {

            System.out.println("Printing using while loop..." + hight[j]);
            j++;
        }

        int i = 0;

        do {
            System.out.println("printing using do while loop..." + hight[i]);
            i++;
        } while (i < hight.length);


    }
}
