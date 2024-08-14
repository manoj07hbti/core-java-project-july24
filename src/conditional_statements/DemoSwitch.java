package conditional_statements;

public class DemoSwitch {

    public static void main(String[] args) {

        // Write a code to display days of  week, 1-Monday ,2- Tuesday , 3- Wednesday .....
        int day = 6;

        switch (day) {

            case 1:
                System.out.println("Monday"); // if(day==1)
                break;
            case 2:
                System.out.println("Tuesday");// if(day==2)
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day found...");


        }


    }
}
