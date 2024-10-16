package oops.inheritance;

public class TwoWheeler extends VehicleSystem{

    public static void main(String[] args) {
         TwoWheeler obj = new TwoWheeler();
         obj.brake(5);
         obj.accerlation(10);
         obj.distanceCovered(30,10);
         obj.timeTaken(50,30);
         obj.steeringSystem();
    }
}
