package methodsreturn;

public class EvenOdd {
    public String EvenOdd(int number){
        if(number%2==0){
            return "Even Number: "+number;
        }else {
            return "Odd Number: "+number;
        }
    }

    public static void main(String[] args) {
        EvenOdd evenodd=new EvenOdd();
        String ed=evenodd.EvenOdd(2);
        System.out.println(ed);
    }
}
