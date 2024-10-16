package oops.inheritance;

public class FourWheeler extends VehicleSystem {

    public static void main(String[] args) {
        FourWheeler obj = new FourWheeler();

        obj.brake(20);
        obj.accerlation(50);
        obj.distanceCovered(70,5);
        obj.timeTaken(500,70);
        obj.steeringSystem();
    }
}