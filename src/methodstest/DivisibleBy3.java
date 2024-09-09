package methodstest;

public class DivisibleBy3 {
    public String Divisible(int number) {
        if (number >= 5 && number <= 150) {
            if (number % 3 == 0 && number % 2 != 0) {
                return "Divisible and Not Even: " + number;
            } else {
                return "Not Divisible or Even: " + number;
            }
        } else {
            return "Invalid Number: " + number;
        }
    }

    public static void main(String[] args) {
        DivisibleBy3 div = new DivisibleBy3();
        String d = div.Divisible(6);
        System.out.println(d);

    }
}