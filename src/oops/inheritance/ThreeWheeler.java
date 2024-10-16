package oops.inheritance;

public class ThreeWheeler extends VehicleSystem {

    public static void main(String[] args) {
        ThreeWheeler obj = new ThreeWheeler();
        obj.brake(10);
        obj.accerlation(30);
        obj.distanceCovered(60,5);
        obj.timeTaken(50,60);
        obj.steeringSystem();


    }
}
