package assignment;

public class IfAndElse {
    public static void main(String[] args) {
        int age=17;
        if(age>18){
            System.out.println("Eligible for voting: "+ age);
        }else{
            System.out.println("Not eligible for voting: "+age);
        }

        double marks=61;
        if(marks>60){
            System.out.println("First division:"+marks);
        }else{
            System.out.println("Not first division:"+marks);
        }
        if(marks<33){
            System.out.println("Not cleared the exam: "+marks);
        }else{
            System.out.println("Cleared the exam");
        }
        double price=545.325;
        if(price>5000){
            System.out.println("Product is costly: "+price);
        }else{
            System.out.println("Product cost is average");
        }
        String country="canada";
        if(country=="india"){
            System.out.println("INDIAN");
        }else {
            System.out.println("NOT INDIAN");
        }
    }
}
