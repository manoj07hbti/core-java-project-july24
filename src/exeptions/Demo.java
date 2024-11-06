package exeptions;

public class Demo {

    public int divide(int a, int b){
        int result=0;
         try{
              result = a / b;
         }
         catch (Exception e){
             System.out.println("Exception Occurred");
         }

        return result;
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
       int result= obj.divide(1000,10);
        System.out.println("Out Put Is: "+result);
    }
}
