package loops;

public class NestedLoop {

    public static void main(String[] args) {

        for(int i=0; i<5; i++){

            System.out.println("For Loop I: "+i);

            for(int j=i; j<5; j++){

                System.out.println("Nested Loop J: "+i);
            }
        }

    }
}
