package mathodinput;

public class FactorialInput {

    public void checkfactorial(int number){

        int factorial=1;
        for (int i=number; i>0; i--){
            factorial=factorial*i;
        }
        System.out.println("factorial of givin number .."+ factorial);
    }


    public static void main(String[] args) {

        FactorialInput obj=new FactorialInput();
        obj.checkfactorial(7);
        obj.checkfactorial(5);
        obj.checkfactorial(9);
    }
}
