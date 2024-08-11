package loop;

public class PractiseClass4 {

    public static void main(String[] args) {


        //if else statement
        //1)write a code to detect a person is having fever or not

        int degree=120;

        if(degree>=99){
            System.out.println("high fever:"+ degree);
        }else{
            System.out.println("normal temperature:"+degree);
        }

        //or operator
        //2)write a code to detect a person having normal blood pressure or not

        int bp=90;

        if(bp>=120 || bp<80){
            System.out.println("blood pressure is not normal:"+bp);
        }else{
            System.out.println("blood pressure is normal:"+bp);
        }

        //and operator
        bp=100;
        if(bp==120 && bp==80){
            System.out.println("normal bp:"+bp);
        }else{
            System.out.println("not normal bp:"+bp);
        }

        //if else if statement
        //3)write a code to specify city with there famous dishes
        // :mumbai->vada pav, kolkata->rasugulla ,agra->petha

        String city="agra";
        String dish="petha";
        if(city=="mumbai" && dish=="vada pav") {
            System.out.println("LIVED IN MAHARASTARA");
        }else if(city=="agra" && dish=="petha") {
            System.out.println("LIVED IN UTTAR PRADESH");
        }else if(city=="kolkata" && dish=="rasugulla"){
            System.out.println("LIVED IN WEST BENGAL");
        }else{
            System.out.println("NOT HAVING CORRECT MATCHES OF CITY WITH DISHES");
        }

        //loops:1)forloop
        //4)write a code to print a table of 9

        int num=9;
        int i=1;

        for(i=1; i<=10; i++){
            System.out.println(num+ "*"+ i +"="+ (num*i));
        }

        //while loop
        //5)write a code for print all number divisible by 4 between 1 to 50

        i=1;
        while(i<=50) {
            if ((i % 2 == 0) && (i % 4 == 0))
                System.out.println("divisible by 4:"+i);
            i++;
        }

        //do while loop
        //6)write a code for print all number divisible by 10 betwwen 1 to 30

        i=1;
        do{
            if(i%10==0)
                System.out.println("divisible by 10:"+i);
            i++;
        }while(i<=50);

        //nested loop
        //7)write a code a to punish a person who done 3 mistakes in his homework
        // :conditions-->1 mistake ,3 times homework done

        int mistake=1;
        int hw=1;

        for(mistake=1; mistake<=3; mistake++){
            for( hw=1; hw<=3; hw++){
                System.out.println("homework");
            }
            System.out.println();
        }

        //nested loop
        //8)write a code to purchase a 5 coffee packet ang get 5 toffee free

        int coffee=1;
        int toffee=1;

        for(coffee=1; coffee<=5; coffee++){
            for(toffee=1; toffee<=1; toffee++){
                System.out.print("1 packet coffee give:"+" ");
            }
            System.out.println("1 toffee");
        }
    }
}
