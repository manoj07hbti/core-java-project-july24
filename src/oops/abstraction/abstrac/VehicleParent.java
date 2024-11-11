package oops.abstraction.abstrac;

import model.Vehicle;

public abstract class VehicleParent {


    public void displayVehicleDetails(Vehicle vehicle){
        System.out.println("Vechile Type:  "+vehicle.type);
        System.out.println("Engine Number: "+vehicle.engineNumber);
        System.out.println("Engine Power: "+vehicle.getPower());
        System.out.println("Engine Mileage: "+vehicle.mileage);

    }

    public abstract void sevicing();
    public abstract void pricing();
}
