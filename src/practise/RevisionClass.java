package practise;

public class RevisionClass {

    public static void main(String[] args) {

        //table of 8
        //for loop

        int num=8;
        for(int i=1; i<=10; i++){
            System.out.println(num + "*" + i + "=" + (num*i));
        }

        //while loop
         // table of 5
        int k=5;
        int l=1;
        while( l<=10){
            System.out.println(k + "*" + l + "=" + (k*l));
            l++;
        }

        //do while loop
        // table of 10

        num=10;
        int i=1;
        do{
            System.out.println(num + "*" + i + "=" + (num*i));
            i++;
        }while(i<=10);

// nested loop
        //pattern


        for( i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //switch statement;

        int day =1;

        switch(day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thrusday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("not valid number");
        }

        //if statement
        //even number  between 100 to 110

            for( i=100; i<=110; i++){
                if(i%2==0){
                System.out.println("even number:"+i );
            }else{
                    System.out.println("odd number:"+i);
                }
        }

            //and statement
        //check condition for correct mall entry
          String pwd="SK";
         String name="reeta";

         if(pwd=="SK" && name=="suresh"){
             System.out.println("welcome to mall :"+ name);
         }else {
             System.out.println("sorry wrong credentials ");
         }

    }
}
