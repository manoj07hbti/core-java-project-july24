package methods;

public class Eligibli_Voting {

//Syntax access _specifier return _type method_name (parameter){code..}

    public void makevoting(){

        int age=20;

        if(age>18){

            System.out.println("eligible for voting person...");
        }
        else{
            System.out.println("not eligble for votin as your age is:"+age);

        }

    }

    public static void main(String[] args) {
    // step1: create object using default constructor

  // method obj=new method

    Eligibli_Voting obj=new Eligibli_Voting();

    obj. makevoting();


    }


}
