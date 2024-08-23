package demo_arrey;

public class Demo_Array {

    public static void main(String[] args){

        // SAVE 10 MAN NAME IN ARRAY


        //SYNTAX : Datatype varName [] = {value1, value2,value3.......value N};


        String names []={"himanshu","krishna","bablu","rohit","ankur","vinit","sandeep","hanny","ishu","govinda","jyoti"};{
            System.out.println("printing data...."+names[8]);
        }


      for(int i=0; i<=8; i++){
          System.out.println("printing with loop...."+names[i]);
      }


      for(int i=0; i< names.length; i++){
          System.out.println("printing with length.............."+names[i]);
      }

        //SYNTAX: for (Datatype varName : arrayName){
        //                   //CODE
        //              }

         //advanced loop
        for(String var : names){
            System.out.println("printing with advanced loop,,,,,,,,,,,,,,"+var);
        }


    }
}
