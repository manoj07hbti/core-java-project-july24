package mathodreturn;

public class Division_Return {


    // write a code to check student division

    public double checkDivision(int subj1marks, int subj2marks, int subj3marks, int subj4marks, int subj5marks, int subj6marks) {
        double percentage = ((double) (subj1marks + subj2marks + subj3marks + subj4marks + subj5marks + subj6marks) / 600) * 100;
        return percentage;
    }


    public static void main(String[] args) {
        Division_Return obj = new Division_Return();

        double percentage = obj.checkDivision(60, 65, 70, 79, 85, 100);
        System.out.println(percentage);
        if (percentage >= 50 && percentage < 70) {
            System.out.println("First division");
        } else if (percentage >= 75 && percentage < 80) {
            System.out.println("Brilliant student...");
        } else if (percentage >= 80 && percentage <= 100) {
            System.out.println("Topper of the college...");
        } else {
            System.out.println("Failed in class");
        }


    }
}