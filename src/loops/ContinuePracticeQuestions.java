package loops;

public class ContinuePracticeQuestions {

    public static void main(String[] args) {

        // we have an array of marks and we have to find marks <75

        int marks[] = {23, 30, 35, 56, 57, 39, 75, 80, 90, 100, 60, 70};
        for (int var : marks) {
            if (var > 75) {
                continue;
            }
            System.out.println("First division...." + var);
        }

        // write a program that prints a number from 1 to 20
        // however, skip the numbers that are divisible by 2

        int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int var : number) {
            if (var % 2 == 0) {
                continue;
            }
            System.out.println("Printing number " + var);
        }

        // write a program that prints the number from 1 to 3,0
        // however skip the number that are divisible by 5

        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        //  for (int var : num) {
        //  if (var % 5 == 0) {
        //   continue;

        for (int i = 1; i <= 30; i++) {
            if (i % 5 == 0) {
                continue;

            }
            System.out.println("Printing number.. " + i);
        }
    }
    // System.out.println("Printing number " + var);
}





