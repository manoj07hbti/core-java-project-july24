package loops;

public class Demo_Break {

    public static void main(String[] args) {

        //write a find city to TUNDLA you need to stop execution

        String cities[] ={"AGRA","FIROZABAD","TUNDLA","PUNE"};
          int k=0;

          for(String var: cities){

              if(var=="TUNDLA"){

                  //exit
                  System.out.println("tundla at index: "+k+ " hence ending tha loop....");
                  break;
              }
              k++;
           System.out.println("print using advance loop...."+var);

          }








    }










}
