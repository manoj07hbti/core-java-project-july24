package conditional_statements;

public class ConditonalAssigment5 {

    public static void main(String[] args) {

        int height = 7;

        if(height > 6){
            System.out.println("CANDIDATE IS TALL");
        }
        if (height < 6) {
            System.out.println("CANDIDATE IS NOT TALL:" + height);
        }

        height = 5;

        if(height > 6){
            System.out.println("CANDIDATE IS TALL");
        }
        if (height < 6) {
            System.out.println("CANDIDATE IS NOT TALL:" + height);
        }
    }
}
