package loops;

public class Demo_Break {


    public static void main(String[] args) {

        int i = 0;
        String cites[] = {"jaipur", "nagpur", "makkhanpur", "kanpur", "sahjhapur", "dholpu"};
        for (String mann : cites) {
            if (mann == "makkhanpur") {
                System.out.println("found agra at index..." + i + "hence ending the loop");

                break;

            }
            i++;
            System.out.println("found agra at index...." + mann);

        }


        double number[] = {12.5, 54.1, 87, 054.20, 87};
        int j = 4;
        for (double mannu : number){
            if (j < 0) {
                break;
            }
        System.out.println("printing....." + number[j] + "at index" + j);
        j--;


    }
}}

