package array;

public class StringArray {
    public static void main(String[] args) {
        String country[] = {"India", "Pakistan", "China", "Russia", "Canada", "Australia", "Brazil", "Japan"};
        for (int i = 0; i < country.length;) {
            System.out.println("Printing Country using advanced for loop : " + country[i]);
            i++;
        }
        int j=0;
        while (j<country.length) {
            System.out.println("Printing Country using While loop: " + country[j]);
            j++;
        }
        int a=0;
        do{
            System.out.println("Printing Country using do while loop: "+country[a]);
        a++;
        }while (a<country.length);

        for (int i = 0; i <= 7; i++) {
            System.out.println("Printing Country using for loop : " + country[i]);
        }
    }
}