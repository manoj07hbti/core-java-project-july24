package methods;

// WRITE A METHOD WHICH TELL SQUARE OF given number

public class Square {

// syntax: access specifier return_type method_name (parameter){code..}

    public void makeSquare(){
        int number=4;
        System.out.println("square of given number is:"+number*number);
    }


    public static void main(String[] args) {

        //step1 : create object using default constructor

        Square obj=new Square();

        obj.makeSquare();

    }
}
