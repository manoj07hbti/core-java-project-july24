package methodstest;

public class DivisibleBy11 {
    public String Divisible(int number) {
        if (number >= 8 && number <= 160) {
            if (number % 11 == 0 && number % 2 == 0) {
                return "Divisible and not odd: " + number;
            } else {
                return "Not Divisible or Odd: " + number;
            }
        } else {
        }
        return "Invalid Number: " + number;
    }

    public String divisible(int number) {
        if (number >= 1 && number <= 180) {
            if (number % 11 == 0 && number % 2 == 0) {
                return "Divisible and not odd: " + number;
            } else {
                return "Not Divisible or Odd: " + number;
            }
        } else {
        }
        return "Invalid Number: " + number;

    }

    public static void main(String[] args) {
        DivisibleBy11 div = new DivisibleBy11();
        String d = div.Divisible(33);
        System.out.println(d);
        String d1 = div.divisible(45);
        System.out.println(d1);

    }
}
