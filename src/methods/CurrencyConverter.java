package methods;

import java.util.Scanner;

public class CurrencyConverter {

    public String dollar() {
        String result = " ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER AMOUNT THAT CONVERT: DOLLARS INTO RUPEES:");
        Double dollar = scanner.nextDouble();
        result = dollar + " $ " + " is equals to " + dollar * 83.91 + " " + "INDIAN RUPEES";
        return result;
    }

    public String euro() {
        String result = " ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER AMOUNT THAT CONVERT: EURO INTO RUPEES:");
        Double euro = scanner.nextDouble();
        result = euro + " EURO " + " is equals to " + euro * 93.05 + " " + "INDIAN RUPEES";
        return result;
    }

    public String yen() {
        String result = " ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER AMOUNT THAT CONVERT: JAPANESES YEN INTO RUPEES:");
        Double yen = scanner.nextDouble();
        result = yen + " YEN " + " is equals to " + yen * 0.60 + " " + "INDIAN RUPEES";
        return result;
    }

    public String yuan() {
        String result = " ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER AMOUNT THAT CONVERT: CHINESE YUAN INTO RUPEES:");
        Double yuan = scanner.nextDouble();
        result = yuan + " YUAN " + " is equals to " + yuan * 11.83 + " " + "INDIAN RUPEES";
        return result;
    }

    public String pound_sterling() {
        String result = " ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER AMOUNT THAT CONVERT: UK POUND STERLING INTO RUPEES:");
        Double ps = scanner.nextDouble();
        result = ps + " POUND STERLING " + " is equals to " + ps * 110.28 + " " + "INDIAN RUPEES";
        return result;
    }


    public static void main(String[] args) {

        String re_choice = "Y";
        while (re_choice.equals("Y")) {
            System.out.println("WELCOME TO CURRENCY CONVERTER SERVICE :");
            System.out.println("CONVERT INTERNATIONAL CURRENCIES INTO INDAIN CURRENCY:please chooose options ..1)DOLLAR TO INR, 2)EURO TO INR, 3)YEN TO INR, 4)YUAN TO INR, 5)POUND STERLING TO INR..");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            CurrencyConverter obj = new CurrencyConverter();

            if (choice == 1) {
                //DOLLAR TO INR
                System.out.println(obj.dollar());
            } else if (choice == 2) {
                //EURO TO INR
                System.out.println(obj.euro());
            } else if (choice == 3) {
                //YEN TO INR
                System.out.println(obj.yen());
            } else if (choice == 4) {
                //YUAN TO INR
                System.out.println(obj.yuan());
            } else if (choice == 5) {
                //POUND STERLING INTO INR
                System.out.println(obj.pound_sterling());
            }

           System.out.println("Do you want to continue press Y or press any other button to exit to exit the converter service...");
            Scanner scanner_1 = new Scanner(System.in);
            re_choice = scanner_1.nextLine();
        }
    }
}