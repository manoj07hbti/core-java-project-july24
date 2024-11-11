package oops.abstraction.abstrac;

import model.Vehicle;
import oops.inheritence.Two_Wheeler;

public class TwoWheeler extends VehicleParent {
    @Override
    public void sevicing() {
        System.out.println("This is servicing for two wheeler");
    }

    @Override
    public void pricing() {
        System.out.println("This is pricing for two wheeler");

    }

    public static void main(String[] args) {
        TwoWheeler obj=new TwoWheeler();
        Vehicle vehicle=new Vehicle("123",3000,75,"Two Wheeler");
        obj.displayVehicleDetails(vehicle);
        obj.sevicing();
        obj.sevicing();
    }
}
