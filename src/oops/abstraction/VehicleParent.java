package oops.abstraction;

import model.Vehicle;

public abstract class VehicleParent {


    //common methods: displayVehicleDetails()

    public void displayVehicleDetails(Vehicle vehicle){

        System.out.println("Vehicle Type: "+vehicle.type);
        System.out.println("Engine number: "+vehicle.engineNumber);
        System.out.println("Engine Power: "+vehicle.power);
        System.out.println("Engine mileage: "+vehicle.mileage);


    }

    public abstract void servicing(); // this is not common in case of all vehicle so we need to make as abstract
    public abstract void pricing();
}
