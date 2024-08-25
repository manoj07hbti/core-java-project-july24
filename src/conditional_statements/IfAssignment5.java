package conditional_statements;

public class IfAssignment5 {

    public static void main(String[] args) {

        int Height = 8;

        if(Height > 6){
            System.out.println("CANDIDATE IS TALL");
        }
        if (Height < 6) {
            System.out.println("CANDIDATE IS NOT TALL:" + Height);
        }

        Height = 4;

        if(Height > 6){
            System.out.println("CANDIDATE IS TALL");
        }
        if (Height < 6) {
            System.out.println("CANDIDATE IS NOT TALL:" + Height);
        }
    }
}

