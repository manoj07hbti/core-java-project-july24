package methods;

public class Student {


    public void rank() {
        int totalmarks=600;
        double obmarks=(double)558/totalmarks;
        double percent=(double)(obmarks*100);


            if (percent >= 60) {
                System.out.println("first rank:"+percent);
            } else if (percent >= 50) {
                System.out.println("second rank:"+percent);
            } else if (percent >= 40) {
                System.out.println("third rank:"+percent);
            } else {
                System.out.println("fail:"+percent);
        }
    }
    public static void main(String[] args) {
        Student obj =new Student();
        obj.rank();
    }
}
