package test_4_august;

public class StudentScore {

    public static void main(String[] args) {

        double percentage=85.3;

        if(percentage >=33 && percentage<60){
            System.out.println("Second Division");
        } else if (percentage>=60 && percentage<75){
            System.out.println("First Division");
        } else if (percentage >75) {
            System.out.println("Gold Medalist");
        } else {
            System.out.println("FAIL");
        }
    }

}
