package oops.abstraction;

import model.Vehicle;

public class FourWheeler extends VehicleParent{


    @Override
    public void servicing() {
        System.out.println("This is servicing for Four wheeler...");
    }

    @Override
    public void pricing() {
        System.out.println("This is Pricing for Four wheeler...");
    }

    public static void main(String[] args) {

        FourWheeler obj= new FourWheeler();
        Vehicle vehicle= new Vehicle("789",15000,20,"FOUR WHEELER");
        obj.servicing();
        obj.pricing();
        obj.displayVehicleDetails(vehicle);
    }
}
