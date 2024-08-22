package loops;

public class Break {

    public static void main(String[] args) {


        // you have an array of cities. when you find Kashipur we need to stop execution

        String cities[] = {"AGRA", "Delhi", "MUMBAI", "KASHIPUR", "RAMNAGAR"};
        // using advanced for loop
        int i = 0;
        for (String var : cities) {
            if (var == "KASHIPUR") {
                // we need to exit when we get KAshipur
                System.out.println("Found kashipur at Index " + i + " hence ending the loop");
                break;
            }
            i++;
            System.out.println("Printing using advanced loop.... " + var);

        }


    }

}
