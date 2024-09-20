package conditional_statements;

public class NestedIf {

    public static void main(String[] args) {

        int number=25;
        if(number>0){
            if(number%5==0){
                System.out.println("ODD NUMBER.."+number);
            } else{
                System.out.println("EVEN NUMBER..."+number);
            }
        } else {
            System.out.println("Please provide me non negative number");
        }

        number=-24;
        if(number>0){
            if(number%4==0){
                System.out.println("EVEN NUMBER..."+number);
            } else{
                System.out.println("ODD NUMBER...");
            }
        } else{
            System.out.println("PRovide non negative number");
        }

        number= 35;
        if(number>0){
            if(number%6!=0){
                System.out.println("odd number");
            } else{
                System.out.println("even NUMBER...");
            }
             number=36;
            if(number>0){
                if(number%6==0){
                    System.out.println("Even number...."+number);
                } else{
                    System.out.println("odd number...");

                }
            }
        }
         number=81;
        if(number>0){
            if(number%9==0){
                System.out.println("printing odd number..."+number);
            } else{
                System.out.println("printing even number...");
            }
        }


        number=100;
        if(number>0){
            if(number%10==0){
                System.out.println("Even number..."+number);
            } else{
                System.out.println("odd number...");
            }
        }


        number=18;
        if(number>0){
            if(number%2==0){
                System.out.println("ODD NUMBER...");
            }else{
                System.out.println("Even number..");
            }
        }

        number=110;
        if(number>0){
            if(number%5==0){
                System.out.println("Even number...");
            } else{
                System.out.println("ODD NUMBER...");
            }
        }

        number=-50;
        if(number<0){
            if(number%2==0){
                System.out.println("Negative odd number...");
            } else{
                System.out.println("Even number..");
            }
        }

        number=200;
        if(number>0){
            if(number%5==0){
                System.out.println("Even number...");
            } else{
                System.out.println("ODD NUMBER..");
            }
        }


        }





    }





