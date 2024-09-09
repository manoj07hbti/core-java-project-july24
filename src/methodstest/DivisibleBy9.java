package methodstest;

public class DivisibleBy9 {
    public String Divisible(int number) {
        if (number >= 3 && number <= 160) {
            if (number % 9 == 0 && number % 2 == 0) {
                return "Divisible and Not Odd: " + number;
            } else {
                return "Not Divisible or Odd: " + number;
            }
        } else {
        }
        return "Invalid Number; " + number;
    }

    public static void main(String[] args) {
        DivisibleBy9 div = new DivisibleBy9();
        String d = div.Divisible(21);
        System.out.println(d);
    }
}
