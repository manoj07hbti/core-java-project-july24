package methods;

public class Division {
    int s1=59;
    int s2=67;
    int s3=78;
    int s4=89;
    int s5=87;
    int s6=78;
    int sT=100;
    int sO=s1+s2+s3+s4+s5+s6;
    public void division(){
        System.out.println((double)((sO)*100/(sT*6)));
    }

    public static void main(String[] args) {
        Division d=new Division();
        d.division();
    }
}
