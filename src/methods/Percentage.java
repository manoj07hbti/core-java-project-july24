package methods;

public class Percentage {
    int number=789;
    int percentage =11;

    public void percent(){
        System.out.println((double)(number*percentage)/100);
    }

    public static void main(String[] args) {
        Percentage percent =new Percentage();
        percent.percent();

    }
}
