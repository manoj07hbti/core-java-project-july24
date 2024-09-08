package test_8_sep;

public class Square {


    //4)write a code to print sqaure of number

    public String sqaure(int a){
        String result=" ";
       for( a=1; a<=10; a++){
          result="sqaure of "+ a + "is: "+ a*a;
        }
        return result;
    }



    public static void main(String[] args) {
       Square obj = new Square();
        System.out.println(obj.sqaure(2));

    }


}
