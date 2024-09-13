package methodsreturn;

public class ClassDivision {
    public double Division(double num,double total){
        double result=(double) (num/total)*100;
        return result;
    }

    public static void main(String[] args) {
        ClassDivision div=new ClassDivision();
        double d=div.Division(789,1000);
        System.out.println(d);
        if (d>=33 && d<50) {
            System.out.println("Passed");
        } else if (d>50 && d<60) {
            System.out.println("Third Division");
        } else if (d>60 && d<70) {
            System.out.println("Second Division");
        }else if(d>70){
            System.out.println("First Division");
        }else {
            System.out.println("Fail");
        }
    }
}
