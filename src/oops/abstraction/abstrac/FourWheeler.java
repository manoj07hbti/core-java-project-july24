package oops.abstraction.abstrac;

import model.Vehicle;

public class FourWheeler extends VehicleParent {
    @Override
    public void sevicing() {
        System.out.println("This is servicing for Four Wheeler");

    }

    @Override
    public void pricing() {
        System.out.println("This is pricing for Four Wheeler");


    }
    public static void main(String[] args) {
        FourWheeler obj=new FourWheeler();
        Vehicle vehicle=new Vehicle("123",3000,75,"Four Wheeler");
        obj.displayVehicleDetails(vehicle);
        obj.sevicing();
        obj.sevicing();
    }


}
