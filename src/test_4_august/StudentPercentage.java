package test_4_august;

public class StudentPercentage {

    public static void main(String[] args) {

        //write a code to check %of student
        //case1: 33<=percentage<60
        //case2: 60=<percentage<75
        //case3: percentage>75

        int percentage=100;

        if(percentage>=33 && percentage<60) {
            System.out.println("second division");
        }else if(percentage>=60 && percentage<75) {
            System.out.println("first divison");
        }else if(percentage>75){
                System.out.println("gold medalist");
        }else{
            System.out.println("fail");
        }
    }
}
