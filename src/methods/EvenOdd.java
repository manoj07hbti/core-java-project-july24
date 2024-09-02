package methods;

public class EvenOdd {

    public void findEO(){

     for(int i=2; i<=100; i++){
         if(i%2==0){
             System.out.println("even number:"+i);
         }
         else{
             System.out.println("odd number:"+i);
         }
     }
    }

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();
        obj.findEO();
    }
}
