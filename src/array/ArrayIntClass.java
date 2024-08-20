package array;

public class ArrayIntClass {

    public static void main(String[] args) {

        int distance [] = {3,5,7,9,12};

        //1)for loop
        for(int i=0; i<distance.length ; i++){
            System.out.println("FOR LOOP:"+distance[i]+"km");
        }

        //2)while loop
        int i=0;
        while(i<distance.length){
            System.out.println("WHILE LOOP:"+distance[i]+"km");
            i++;

        }

        //3)advance loop
        for(int var:distance){
            System.out.println("ADVANCE LOOP:"+ var+"km");
        }
    }
}
