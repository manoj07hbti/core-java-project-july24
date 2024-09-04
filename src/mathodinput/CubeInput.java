package mathodinput;

public class CubeInput {



    public void makeCube(int number) {

        System.out.println("Cube of...." + number * number * number);

    }


    public static void main(String[] args) {

        CubeInput obj=new CubeInput();
        obj.makeCube(3);
        obj.makeCube(6);
        obj.makeCube(2);
    }

}