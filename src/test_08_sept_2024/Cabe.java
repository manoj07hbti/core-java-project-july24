package test_08_sept_2024;

public class Cabe {
    public static class Cube {

        public void Cube(){

            for(int i=1;i<=10;i++){
                System.out.println("Cube of  "+i +" is: "+(i*i*i));
            }
        }

        public static void main(String[] args) {
            Cube obj=new Cube();
            obj.Cube();

        }

    }
}
