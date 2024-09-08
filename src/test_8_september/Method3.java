package test_8_september;

public class Method3 {


    public void checkNumber() {
        int no = 160;
        for (int i = 3; i <= 160; i++) {
            if (i % 9 !=0 &&i%2 == 0) {
                System.out.println("no");
            }
        }
    }

    // write print cube number string  from 1 to 10
    public void checkCube(){

        for(int i=1;i<=10;i++){
            System.out.println("Cube of  "+i +" is: "+(i*i*i));
        }
    }


    public static void main(String[] args) {
     Method3 obj=new Method3();
     obj.checkNumber();
     obj.checkCube();
    }

    }

