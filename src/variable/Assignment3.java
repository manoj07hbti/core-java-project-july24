package variable;

import java.time.LocalDate;

public class Assignment3 {

    public static void main(String[] args) {

         long mobileNumber = 8791377068L;
         String panCardNumber = "PJRPH2515B";
         long aadhaarCardNumber = 893140948445L ;
         String address = "321/10 A.V.C Sikandra, Agra";
         LocalDate dob = LocalDate.of(2002,1,23);

        System.out.println("Mobile Number: " +mobileNumber);
        System.out.println("PAN Number: " +panCardNumber);
        System.out.println("Aadhaar Number: " +aadhaarCardNumber);
        System.out.println("Address: " +address);
        System.out.println("DOB: " +dob);

    }
}
