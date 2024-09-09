package test_08_sept_2024;

public class Check_number_8_to_160 {

    public class CheckNumber {


        public void checkNumber(){
            for(int i=8; i<=160;i++){
                if(i%11!=0 && i%2==0){
                    System.out.println(i);
                }
            }
        }

        public void main(String[] args) {
            CheckNumber obj =new CheckNumber();
            obj.checkNumber();
        }
    }
}
