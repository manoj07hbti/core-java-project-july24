package Oopsinheritance;

public class VehicleSystem {

    public void accerlation(int accerlater) {
        int a = 20;
        System.out.println("SPEED WITHOUT accerlater:" + a);
        a = a - accerlater;
        System.out.println("....>SPEED AFTER APPLYING accerlater :" + a);
    }

    public void BRAKE(int brake) {
        int b = 50;
        System.out.println("SPEED BEFORE BRAKE:" + b);
        b = b + brake;
        System.out.println("....>SPEED AFTER BRAKE:" + b);
    }

    public void steeringSystem() {
        System.out.println("COMMON FEATURE OFF ALL VEHICLE IS : STEERING SYSTEM");
    }
}
