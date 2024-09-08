package practise;

public class RevisionClass_C {


    //IMPORTANT QUESTION PRACTISE CLASS


    //1)write a method to check number is  palindrome number or not by using method input

    public String pd(int num) {
        String result=" ";
        int orinumber = num;
        int rev = 0;
        while (num != 0) {

            rev = rev * 10 + num % 10;
            num = num / 10;

        }
        if(orinumber==rev){
            result="palindrome number :"+orinumber;
        }
        else{
           result ="not a palindrone number:"+orinumber;
        }

        return result;
    }

//2)armstrong number with the help of return type



    public String  a(int i){

        String result=" ";
        int arm=0;
        int r;
        int c=i;

        while(i>0){
            r= i  % 10;
            arm = (r*r*r)+arm;
            i=i/10;
        }
        if(c==arm){
           result="armstrong number:"+c;
        }
        else{
           result ="not armstrong number:"+c;
        }

        return result;
    }

    //3)write a code for even odd number by using return type
    public String eo(int p){
        String result=" ";
        if(p%2==0){
            result="even number:"+p;
        }
        else{
            result="odd number:"+p;
        }
        return result;
    }

    //4)write a code for check a  prime number by using a return type

    public String pr(int r){
       String result=" ";
        boolean isprime=true;
        for(int i=2; i<r; i++){
            if(r%i==0){
                result="not a prime number bcz,divisible by other number:"+i;
                isprime=false;
            }
            if(isprime){
                result="PRIME NUMBER:"+r;
            }
            else{
                result="not a prime number:"+r;
            }

        }
        return result;
    }

    //5)write a code for student class by using method return type

    public String s(double n){
        String result=" ";
        double percent =((double)n/500)*100;
        if(percent>=60){
            result="first division:"+percent;
        }else if(percent>=50 && percent<60){
            result="second division:"+percent;
        }else if(percent>=40 && percent<50){
            result="third division:"+percent;
        }else{
            result="fail:"+percent;
        }
        return result;
    }

    public static void main(String[] args) {

        RevisionClass_C obj = new RevisionClass_C();
        obj.pd(121);
        System.out.println( obj.pd(121));
        System.out.println(obj.pd(234));

        System.out.println(obj.a(145));
        System.out.println(obj.a(153));

        System.out.println(obj.eo(25));
        System.out.println(obj.eo(20));

        System.out.println(obj.pr(31));
        System.out.println(obj.pr(22));

        System.out.println(obj.s(450));
        System.out.println(obj.s(120));
    }
}
