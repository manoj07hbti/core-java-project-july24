package methods;

public class ArmstrongNumber {


    public void an(){

        int num=153;
        int arm=0;
        int r;
        int c=num;

        while(num>0){
            r= num  % 10;
            arm = (r*r*r)+arm;
            num=num/10;
        }
        if(c==arm){
            System.out.println("armstrong number:"+c);
        }
        else{
            System.out.println("not a armstrong number:"+c);
        }
    }

    public static void main(String[] args) {

      ArmstrongNumber obj = new ArmstrongNumber();
      obj.an();
    }
}
