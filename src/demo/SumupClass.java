package demo;

public class SumupClass {

    public static void main(String[] args) {

        //DATATYPES

        //STRING DATATYPE
        String name = "EPIC";
        System.out.println("PRINTING NAME:"+ name);

        //INTEGER DATATYPE
        int height=5;
        System.out.println("PRINTING HEIGHT:"+height);

        // ASSIGN AND DECALRE VARIABLE--> SYNTAX:DATATYPE variable ;
                                               //variable = value;
        //STRING VARIABLE
        String book;
        book = "RAMAYANA";
        System.out.println("ASSIGN AND DECLARE STRING VARIABLE:"+book);

      //VARIABLE MANIPULATION:USING SAME VARIABLE MANY TIMES WITHOUT USING DATATYPE
         String dress="SAREE";
        System.out.println("BEFORE MANUPULATION:"+ dress);

        dress= "SUIT";
        System.out.println("BEFORE MANUPULATION:"+ dress);
        int v=34;
        int q=56;      //OPERATORS
        v+=q;

        System.out.println("ADDITION OPERATORS:"+ v);
        //TYPECASTING
       int s=897;
       int z=8;
       double result = (double)s/z;
        System.out.println("TYPECASTING EXAMPLE:"+result);

       //SQUARE
       v=34;
      int squ=v*v;
        System.out.println("SQUARE OF V:"+ squ);

       //CUBE
       v=50;
      int cube=v*v*v;
      System.out.println("CUBE OF V:"+ cube);

     //PERCENT
     v=4500;
   int per=5;
   int answere=(v*per)/100;
   System.out.println("5% OF 4500:"+ answere);
}
}
