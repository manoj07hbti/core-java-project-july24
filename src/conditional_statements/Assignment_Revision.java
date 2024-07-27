package conditional_statements;

public class Assignment_Revision {

    public static void main(String[] args) {

        int age=25;
        if(age>18){
            System.out.println("Person is eligible for voting");
            System.out.println("Person is eligible for voting...."+age);
        }
        age=17;
        if(age<18){
            System.out.println("Person is not eligible for voting");
            System.out.println("Person is not eligible for voting...."+age);
        }

        int run=99;
        if(run==100){
            System.out.println("Player scored a century");
            System.out.println("Player scored a century...."+run);
        }
        run=99;
        if(run!=100){
            System.out.println("Player not scored a century");
            System.out.println("Player not scored a century..."+run);
        }
         double price=987.2;
        if(price>10000){
            System.out.println("Product is costly");
            System.out.println("Product is costly...."+price);
        }
        price=9817.2;
        if(price<10000){
            System.out.println("Product is not costly");
            System.out.println("Product is not costly...."+price);

        }

        int marks=50;
        if(marks>40){
            System.out.println("Candidate cleared the exam");
            System.out.println("Candidate cleared the exam...."+marks);
        }
        marks=39;
        if(marks<40){
            System.out.println("candidate not cleared the exam");
            System.out.println("Candidate not cleared the exam..."+marks);
        }

        String city="Nainital";
        if(city=="KAShiPUR"){
            System.out.println("Person is from KASHIPUR");
            System.out.println("Person is from KASHIPUR...."+city);
        }
        city="NAINITAL";
        if(city!="KASHIPUR"){
            System.out.println("Person is not from KASHIPUR");
            System.out.println("Person is not from kashipur..."+city);
        }

        String stream="ARTS";
        if(stream=="SCIENCE"){
            System.out.println("Student is from science stream");
            System.out.println("Student is from science stream..."+stream);
        }
        if(stream!="SCIENCE"){
            System.out.println("Student is not fom science stream");
        }

        int height=7;
        if(height>6){
            System.out.println("Man is more than 6 feet tall");
        }
        height=5;
        if(height<6){
            System.out.println("Man is not more than 6 feet tall");
            System.out.println("Man is not more than 6 feet tall..."+height);
        }





    }








}
