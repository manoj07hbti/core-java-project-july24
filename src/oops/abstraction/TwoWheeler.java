package oops.abstraction;

import model.Vehicle;

public class TwoWheeler extends VehicleParent{
    @Override
    public void servicing() {
        System.out.println("This is servicing for two wheeler...");
    }

    @Override
    public void pricing() {
        System.out.println("This si pricing for two wheeler...");
    }

    public static void main(String[] args) {
        TwoWheeler obj= new TwoWheeler();
        Vehicle vehicle= new Vehicle("123",3000,75,"TWO WHELLER");
        obj.displayVehicleDetails(vehicle);
       obj.pricing();
       obj.servicing();

    }
}
