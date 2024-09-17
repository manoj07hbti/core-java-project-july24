package collections;

import java.util.ArrayList;

public class ListPractice {

    ArrayList currency = new ArrayList();


    public void addData() {
        // add data to list

        currency.add("DINAR");    ///   0
        currency.add("RAND");    //  1
        currency.add("POUND");    //  2
        currency.add("YEN");      //  3
        currency.add("EURO");     //4

    }


    public void readData() {

        // read data
        for (int i = 0; i < currency.size(); i++) {
            System.out.println("Printing data " + currency.get(i) + "at Index " + i);
        }

    }

    public void removeData() {
        // remove data
        for (int i = 0; i < currency.size(); i++) {
            System.out.println("Printing after removing data ." + currency.remove(1));
            System.out.println("Changing indexes are.." + currency.get(i) + "at Index " + i);
        }

    }


    public static void main(String[] args) {
        ListPractice currency = new ListPractice();
        currency.addData();
        currency.readData();
        currency.removeData();
    }


}
