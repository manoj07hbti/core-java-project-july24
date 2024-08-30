package methods;

public class EvenOdd {

    public  void checkeven(){

        for(int num=1;num<=100;num++){
            if(num % 2 ==0){
                System.out.println(num +" is even number ");
            } else {
                System.out.println(num +" is odd number ");
            }
        }

    }

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();
        obj.checkeven();
    }
}
