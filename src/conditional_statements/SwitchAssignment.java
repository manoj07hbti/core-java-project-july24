package conditional_statements;

public class SwitchAssignment {

    public static void main(String[] args) {
        // write a code to print month name e.g. 1-january 2-february etc.

        int month = 5;
        switch (month) {
            case 1:
                System.out.println("JANUARY");
                break;
            case 2:
                System.out.println("FEBRUARY");
                break;
            case 3:
                System.out.println("MARCH");
                break;
            case 4:
                System.out.println("APRIL");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUNE");
                break;
            case 7:
                System.out.println("JULY");
                break;
            case 8:
                System.out.println("AUGUST");
                break;
            case 9:
                System.out.println("SEPTEMBER");
                break;
            case 10:
                System.out.println("OCTOBER");
                break;
            case 11:
                System.out.println("NOVEMBER");
            case 12:
                System.out.println("DECEMBER");
                break;
            default:
                System.out.println("INVALID YEAR");


        }
    }
}