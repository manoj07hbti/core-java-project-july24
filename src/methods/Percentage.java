package methods;

public class Percentage {

    public void FindPercentage() {
int number= 600;
        int marks= 400;
        Double percentage=((double)400/600)*100;
        System.out.println("Printing marks: "+percentage);

    }

    public static void main(String[] args) {

        Percentage obj2= new Percentage();

        obj2.FindPercentage();

    }

}

