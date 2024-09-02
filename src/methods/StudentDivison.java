package methods;

public class StudentDivison {

    public void rank() {

        int marks =500;

        double percent = (double) ((marks/600)* 100);

        if (percent >= 95 && percent < 75) {
            System.out.println("first rank:" + percent);
        } else if (percent >= 75 && percent < 55) {
            System.out.println("second rank:" + percent);
        } else if (percent >= 55 && percent < 45) {
            System.out.println("third division:" + percent);
        } else {
            System.out.println("no rank..low percent:" + percent);
        }
    }

    public static void main(String[] args) {
        StudentDivison obj = new StudentDivison();
        obj.rank();
    }
}