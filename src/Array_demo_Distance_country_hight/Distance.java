package Array_demo_Distance_country_hight;

public class Distance {

    public static void main(String[] args) {

        int distance[] = {35};


        for (int i = 0; i < distance.length; i++) {
            System.out.println("Printing in for loop : " + distance[i]);
        }


        for (int var : distance) {
            System.out.println("Printing distance : " + var);
        }

        int i = 0;
        while (i < distance.length) {

            System.out.println("Printing using while loop..." + distance[i]);
            i++;
        }

        i = 0;

        do {
            System.out.println("Printing using do while loop.." + distance[i]);
            i++;
        } while (i < distance.length);

    }
}
