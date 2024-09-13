package methods;

public class PercentageInput {
    public void percentage(int number, int percent){
        System.out.println((double)(number*percent)/100);
    }

    public static void main(String[] args) {
        PercentageInput percentage=new PercentageInput();
        percentage.percentage(1597,15);
        percentage.percentage(4568,9);
        percentage.percentage(1597,6);
                
    }
}
