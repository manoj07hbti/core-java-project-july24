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

    public void display(){
        int arr[]={1,2,3,4,7};
        System.out.println("before printing");
        try {
            System.out.println(arr[5]);
        }catch (Exception e){
            System.out.println("after printing");
        }
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
       int result= obj.divide(1000,10);
        System.out.println("Out Put Is: "+result);
        obj.display();
    }
}
