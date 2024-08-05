package conditional_statements;

public class OrOperator
{
    public static void main(String[] args)
    {
        int MarkRank =33;
        int LimitRank =100;

        // Marking and Limiting for Second Division Student (True+True=True)
        MarkRank =54;
        if(MarkRank >= 33 || LimitRank <60)
        {
            System.out.println("The Student Achieved Second Division");
        }
        else
        {
            System.out.println("Invalid Input");
        }

        // Marking and Limiting for First Division Student (True+True=True)
        LimitRank =71;
        if(MarkRank >= 60 || LimitRank <75)
        {
            System.out.println("The Student Achieved First Division");
        }
        else
        {
            System.out.println("Invalid Input");
        }

        // Marking and Limiting for Gold Medalist Student
        MarkRank =94;
        if(MarkRank >= 75)
        {
            System.out.println("The Student Achieved Gold Medalist Rank");
        }
        else
        {
            System.out.println("Invalid Input");
        }

    }
}
