package Test_Four;

public class MaximumElement
{
    public static void main(String[] args)
    {
        int Element[] = {1, 3, 5, 2, 4};

        for(int i: Element)
        {
            if(i <= 4)
            {
                continue;
            }
            System.out.println("Printing the maximum element the Array: "+i);
        }
    }
}
