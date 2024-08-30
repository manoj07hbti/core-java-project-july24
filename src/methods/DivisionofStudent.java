package methods;

public class DivisionofStudent {

    public void checkDivision(){
        int subj1marks= 45;
        int subj2marks= 65;
        int subj3marks= 80;
        int subj4marks= 90;
        int subj5marks= 70;
        int subj6marks= 60;

        double  percentage =  ( ( double) (subj1marks + subj2marks +subj3marks +subj4marks+ subj5marks +subj6marks)/ 600 ) *100;

        if(percentage >= 40 && percentage < 60){
            System.out.println("Third Divisino");
        } else if(percentage>= 60 && percentage <80 ){
            System.out.println("Second Division");
        } else if (percentage>= 80) {
            System.out.println("First Division");
        } else {
            System.out.println("Fail");
        }

    }

    public static void main(String[] args) {

        DivisionofStudent obj =  new DivisionofStudent();
        obj.checkDivision();

    }
}
