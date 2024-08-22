package loop;

public class ContinueClass {

    public static void main(String[] args) {

        //write a programe that pri nts the number from 1 to 20 .
        // however ,skip printing numbers that are divisible by 3

//        int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//
//
//        for (int var : number) {
//            if (var % 3 == 0) {                  //ADVANCE LOOP
//                continue;
//            }
//            var++;
//            System.out.println("printing number:" + var);
//        }




        for (int j = 1; j <= 20; j++) {            //FOR LOOP
            if (j % 3 == 0) {
                continue;
            }
            System.out.println(j);
        }
                }
                }




