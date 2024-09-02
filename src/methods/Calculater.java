package methods;

public class Calculater {

    public void makeCalculater(){

        int a= 10;
        int b=5;
        int add=a+b;
        System.out.println("this is add.."+add);

        int sub= a-b;
        System.out.println("this is Substraction.."+sub);

        int multi=a*b;
        System.out.println("this is multi.."+multi);

        int divi=a/b;
        System.out.println("this is divi.."+divi);

    }

    public static void main(String[] args) {
        Calculater obj= new Calculater();
        obj.makeCalculater();


    }






}
