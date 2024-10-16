package OOPS.inheritance.Vehicle;

public class ThreeWheelerChild extends VehicleMain
{
    protected  void ThreeWheeler()
    {        System.out.println("Printing Three Wheeler's info--" +
            "Company: Bajaj," +
            " Model: Deluxe," +
            " Manufactured in: Agra");
    }

    public static void main(String[] args)
    {
        ThreeWheelerChild threeWheelerChild= new ThreeWheelerChild();
        threeWheelerChild.ThreeWheeler();
    }
}
