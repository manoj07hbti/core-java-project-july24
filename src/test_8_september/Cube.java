package test_8_september;

public class Cube {

    public void checkCube(){

        for(int i=1;i<=10;i++){
            System.out.println("Cube of  "+i +" is: "+(i*i*i));
        }
    }

    public static void main(String[] args) {
        Cube obj=new Cube();
        obj.checkCube();

    }

}
