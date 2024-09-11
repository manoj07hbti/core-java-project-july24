package scanner;

import java.util.Scanner;

    public class Atm {

        public void createAtm() {
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("Welcome to SBI bank ATM..");

            int pinnumber = 2364;
            if (pinnumber == 2364) {
                System.out.println("please enter your valid pin");
            }
            int balance = 1000, withdraw, deposit;
            Scanner scanner1 = new Scanner(System.in);
            while (true) {

                System.out.println("case 1 withdraw");
                System.out.println("Choose 2 for deposit");
                System.out.println("Choose 3 for check balance");
                System.out.println("Choose 4 to exit ");
                System.out.println("Choose the operation you want to perform");
                int number = scanner.nextInt();
                switch (number) {
                    case 1:
                        System.out.println("Enter the money  withdrawn");
                        withdraw = scanner.nextInt();
                        if (balance >= withdraw) {
                            balance = balance - withdraw;
                            System.out.println("collect your money");
                        } else {
                            System.out.println("Insufficient balance");
                        }
                        break;

                    case 2:
                        System.out.println("Enter money to deposit");
                        deposit = scanner.nextInt();
                        if (balance >= deposit) {
                            balance = balance + deposit;
                            System.out.println("Money is successfully deposited");
                        } else {
                            System.out.println("");
                        }
                        break;
                    case 3:

                        System.out.println("check blance" + balance);
                        balance = scanner.nextInt();

                        break;

                    case 4:
                        System.exit(0);
                        break;
                }
            }

        }

        public static void main(String[] args) {

           Atm obj=new Atm();
           obj.createAtm();

        }




}
