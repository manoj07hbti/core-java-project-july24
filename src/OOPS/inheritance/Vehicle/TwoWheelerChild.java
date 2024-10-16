package OOPS.inheritance.Vehicle;

public class TwoWheelerChild extends VehicleMain
{
    protected void TwoWheeler()
    {        System.out.println("Printing Two Wheeler's info--" +
            "Company: Honda," +
            " Model: Activa 5g," +
            " Manufactured in: Delhi");
    }

    public static void main(String[] args)
    {
        TwoWheelerChild twoWheelerChild= new TwoWheelerChild();
        twoWheelerChild.TwoWheeler();
    }
}

