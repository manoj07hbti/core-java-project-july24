package conditional_statements;

public class AgeOrOperator {

    public static void main(String[] args) {
        int Age = 0;
        int AgeLimit = 100;

        //Enter a valid numeral b/w 0 to 18 to print "Child or a teen"
        Age=17;
        if (Age > 0 || AgeLimit < 18) {
            System.out.println("The Person is a Child or a Teen");
        } else {
            System.out.println("Please enter a valid numeral to print Child or a Teen Statement");
        }

        //Enter a valid numeral b/w 18 to 45 to print "Young Adult or a Middle-Aged Adult"
        Age=34;
        if (Age >= 18 || AgeLimit <= 45) {
            System.out.println("The Person is a Young Adult or a Middle-Aged Adult");
        } else {
            System.out.println("Please enter a valid numeral to print Young Adult or a Middle-Aged Adult Statement");
        }

        //Enter the numeral 45 or above to print "Old Aged"
        Age=67;
        if (Age >= 45) {
            System.out.println("The Person is an Old Aged Adult");
        }
        else{
            System.out.println("Please enter a valid numeral to print Old Age Adult Statement");
        }

    }

}

