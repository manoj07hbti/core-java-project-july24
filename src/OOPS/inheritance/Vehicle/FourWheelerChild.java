package OOPS.inheritance.Vehicle;

public class FourWheelerChild extends VehicleMain
{
    protected void FourWheeler()
    {        System.out.println("Printing Four Wheeler's info--"+
            "Company: TATA," +
            " Model: Harrier," +
            " Manufactured in: Mumbai");
    }

    public static void main(String[] args)
    {
        FourWheelerChild fourWheelerChild= new FourWheelerChild();
        fourWheelerChild.FourWheeler();
    }
}
