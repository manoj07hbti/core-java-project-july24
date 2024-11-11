package model;

import java.util.Objects;

public class Vehicle {
   public String engineNumber;
    public int power;
    public int mileage;
    public String type;

    public Vehicle(String engineNumber, int power, int mileage, String type) {
        this.engineNumber = engineNumber;
        this.power = power;
        this.mileage = mileage;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return power == vehicle.power && mileage == vehicle.mileage && Objects.equals(engineNumber, vehicle.engineNumber) && Objects.equals(type, vehicle.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineNumber, power, mileage, type);
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
