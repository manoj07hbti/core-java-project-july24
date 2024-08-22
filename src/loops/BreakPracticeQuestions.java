package loops;

public class BreakPracticeQuestions {

    public static void main(String[] args) {
        // we have an array of batsman. When you  find VIRAT  at index then we stop execution

        String batsman[] = {"SACHIN", "DHONI", "YUVI", "GAMBHIR", "SEHWAG", "SHUBMAN", "VIRAT", "RAHUl", "SURYA"};
        // using advanced for loop
        int i = 0;
        for (String var : batsman) {
            if (var == "VIRAT") {
                System.out.println("found virat at Index " + i + " hence ending the loop..");
                break;
            }
            System.out.println("Printing using advanced loop " + var);
            i++;
        }

        // we have an array of fast foods when you get burger then we have to stop execution

        String foods[] = {"PIZZA", "MOMOS", "CHOWMEIN", "FRIES", "BURGER"};
        int j = 0;
        for (String var : foods) {
            if (var == "BURGER") {
                System.out.println("Found burger at INDEX " + j + " hence ending the loop...");
                break;
            }
            System.out.println("Printing using advanced loops.." + var);
            j++;
        }

        // we have an array of height. when we get 7ft. then we stop execution

        double height[] = {4, 4.5, 4.6, 4.7, 5, 5.5, 7, 6, 6.5, 6.8};
        int k = 0;
        for (double var : height) {
            if (var == 7) {
                System.out.println("FOUND 7 AT INDEX " + k + " HENCE ENDING THE LOOP");
                break;
            }
            System.out.println("Printing using advance loop.." + var);
            k++;
        }
    }


}



