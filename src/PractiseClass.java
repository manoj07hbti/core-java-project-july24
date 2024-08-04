public class PractiseClass {

    public static void main(String[] args) {

        //datatype and variable declaration

        int age=13;                              //integer
        System.out.println("my age:"+age);
        String name="VISHNU";                    //String
        System.out.println("my name:"+name);
        double weight=78.8;                       //double
        System.out.println("my weight:"+weight);
        char firstletter='V';                        //character
        System.out.println("my first letter:"+firstletter);

        //variable manipulation
        int a=4;
        a=a+3;                              //add
        System.out.println("add:"+a);
        a=a-2;                              //subtract
        System.out.println("subtract:"+a);
        a=a*2;                              //multi
        System.out.println("multi:"+a);
        a=a/2;                              //division
        System.out.println("div:"+a);

        //variable operator
        int s=6;
        System.out.println("before increment operator:"+s);
        s++;
        System.out.println("after increment operator:"+s);           //increment operator
        s--;
        System.out.println("after decrement operator:"+s);            //decrement operator
        int i=10;
        int j=5;
        i+=j;  //i=i+j      addition by uninary operator
        System.out.println("addition:"+i);
        i-=j;  //i=i-j       substraction by uninary operator
        System.out.println("sub:"+i);
        i*=j;  //i=i*j       multi by uninary operator
        System.out.println("multi:"+i);
        i%=j;  //i=i%j       modulus by uninary operator
        System.out.println("modulus:"+i);
        i/=j;  //i=i/j       division by uniary operator
        System.out.println("div:"+i);

        //typecasting
        int w=375;
        int q=2;
        double div=(double)w/2;
        System.out.println("typecasting:"+div);

        //store long digits
        long mobile=4567892345L;
        System.out.println("mobile number:"+mobile);

        //percentage
        w=275;
        int percent=2;
        div=(double)(w*2)/100;
        System.out.println("2% of 275:"+div);

        //if,else condition
        //write a code to check a girl is applicable for marriage i.e age>21
        age=25;
        if(age>=21) {                                         //greater than equal to
            System.out.println("applicable for marriage:" + age);
        }else{
            System.out.println("not applicable for marriage:" +age);
        }
        //write a code to declare a child age
        age=16;
        if(age<=18) {                                        //less than equal to
            System.out.println("i m child:" + age);
        }else {
            System.out.println("i m not a child:" + age);
            //write a code ,to know about u r from agra
            String city = "agra";
            if(city=="agra") {
                System.out.println("i m from agra:" + city);
            }else {
                System.out.println("not from agra");
            }

            //nested if
            //write a code about price of ticket of moive
            int price=100;
            if(price<=100){
                System.out.println("normal ticket:"+price);
                if(price<200){
                    System.out.println("gold ticket:"+price);
                    if(price<300){
                        System.out.println("platinum ticket:"+price);
                    }else{
                        System.out.println("no tickets available");
                    }
                }
            }

             price=150;
            if(price<=100){
                System.out.println("normal ticket:"+price);
                if(price<200){
                    System.out.println("gold ticket:"+price);
                    if(price<300){
                        System.out.println("platinum ticket:"+price);
                    }else{
                        System.out.println("no tickets available");
                    }
                }
            }

            price=250;
            if(price<=100){
                System.out.println("normal ticket:"+price);
                if(price<200){
                    System.out.println("gold ticket:"+price);
                    if(price<300){
                        System.out.println("platinum ticket:"+price);
                    }else{
                        System.out.println("no tickets available");
                    }
                }
            }

            //AND OPERATOR
            //Write a code to subjects given by students only by percentage of maths and chemistry bases,
            // if maths>=33; chemistry>=50
            //1)true*true = true
            int maths=43;
            int chem=54;
            if(maths>=33 && chem>=50) {
                System.out.println("student opt maths and science");
            }else{
                System.out.println("not opt maths and science");

            }
            //2)true*false = false
             maths=43;
             chem=20;
            if(maths>=33 && chem>=50) {
                System.out.println("student opt maths and science");
            }else{
                System.out.println("not opt maths and science");
            }

            //3)false*true = false
             maths=10;
             chem=60;
            if(maths>=33 && chem>=50) {
                System.out.println("student opt maths and science");
            }else{
                System.out.println("not opt maths and science");
            }

            //4)false*false = false
            maths=10;
            chem=20;
            if(maths>=33 && chem>=50) {
                System.out.println("student opt maths and science");
            }else{
                System.out.println("not opt maths and science");
            }

            //OR operator
            //write a code to login a scheme by using age or two digit code
            //code<=50 and age should be less than 70i.e,age<=70

            //1)true+true =true

            int code=34;
            age=65;
            if(code<=50 || age<=70){
                System.out.println("applicable for scheme");
            }else{
                System.out.println("not applicable for scheme");
            }

            //2)true+false =true

            code=34;
            age=95;
            if(code<=50 || age<=70){
                System.out.println("applicable for scheme");
            }else{
                System.out.println("not applicable for scheme");
            }

            //3)false+true  =true

            code=70;
            age=55;
            if(code<=50 || age<=70){
                System.out.println("applicable for scheme");
            }else{
                System.out.println("not applicable for scheme");
            }

            //4)false+true =false

            code=85;
            age=88;
            if(code<=50 || age<=70){
                System.out.println("applicable for scheme");
            }else{
                System.out.println("not applicable for scheme");
            }

            //not operator
            //write a code to verify a number is not odd

            int digit=93;
            if(!(digit%3==0)) {
                System.out.println("number is not odd:" + digit);
            }else{
                System.out.println("number is odd:"+ digit);
            }
        }

        }
}
