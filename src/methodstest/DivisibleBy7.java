package methodstest;

public class DivisibleBy7 {
    public String Divisible(int number) {
        if (number >= 7 && number <= 190) {
            if (number % 7 == 0 && number % 2 == 0) {
                return "Divisible and Not Odd: " + number;
            } else {
                return "Not Divisible or Odd: " + number;
            }
        } else {
            return "Invalid Number: " + number;
        }
    }

    public static void main(String[] args) {
        DivisibleBy7 div = new DivisibleBy7();
        String d = div.Divisible(21);
        System.out.println(d);

    }
}
