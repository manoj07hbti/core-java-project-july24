package array;

public class FindNumberUsingIndexLinear {
    public static void main(String[] args) {
        int number[] = {84, 54, 84, 54, 84, 56, 32, 85, 39, 84, 64, 64, 34, 84, 18, 54, 84, 54, 64, 84, 68, 64, 49, 43, 46};
        int i=0;


        for (int var : number) {
            if (var == 39){
                System.out.println("Found number "+var+" in index "+i);
                break;
                } i++;
            }
        int numbers[] = {84, 54, 84, 54, 84, 56, 32, 85, 39, 84, 64, 64, 34, 84, 18, 54, 84, 54, 64, 84, 68, 64, 49, 43, 46};
        int j=24;
        for(int vas:numbers){



            if(j<0){
                break;
            }

                System.out.println("number "+vas+" at index "+j);
            j--;


        }
        for(int vaf:numbers){
            if(vaf<44){
                continue;
            }
            System.out.println(">44: "+vaf);
        }

    }


}


