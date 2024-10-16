package oops.inheritance;

public class VehicleSystem {

    public void brake(int b){

        int a=60;
        System.out.println("SPEED WITHOUT BRAKE :" + a);
        a=a-b;
        System.out.println("....>SPEED AFTER APPLYING BRAKE :"+ a);
    }

    public void accerlation(int accerlate){
       int s=50;
        System.out.println("SPEED BEFORE ACCERLATION :"+ s);
        s=s+accerlate;
        System.out.println("....>SPEED AFTER ACCERLATION:"+ s);
    }

    public void distanceCovered(int speed, int time ){

      int distance = speed * time;
        System.out.println("DISTANCE COVERED :"+ distance +"KM");
    }

    public void timeTaken(int distance , int speed){

      double time = (double) distance/speed;
        System.out.println("TIME TAKEN :" + time);
    }

    public void steeringSystem(){
        System.out.println("COMMON FEATURE OFF ALL VEHICLE IS : STEERING SYSTEM");
    }
}
