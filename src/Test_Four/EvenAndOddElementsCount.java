package Test_Four;

public class EvenAndOddElementsCount
{
    public static void main(String[] args)
    {
        int Element[] = {1, 2, 3, 4, 5, 6};
        int EvenCount = 0;
        int OddCount = 0;

        for (int X = 0; X < Element.length; X++)
        {
            if (Element[X] % 2 == 0)
            {
                EvenCount++;
            }else
            {
                OddCount++;
            }
        }

        System.out.println("The count of evens is "+EvenCount+" and the count of odds is "+OddCount);
    }
}
