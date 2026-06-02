import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String history = "";
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.print("Create Password: ");
        String password = sc.nextLine();
        int accountNumber = 1001;
        double balance = 1000;
        System.out.println("\nRegistration Successful");
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        while (true) {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    history += "Deposited: " + deposit + "\n";
                    System.out.println("Deposit Successful");
                    break;

                case 2:
                    System.out.print("Enter Withdraw Amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) {
                        balance -= withdraw;
                        history += "Withdrawn: " + withdraw + "\n";
                        System.out.println("Withdrawal Successful");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 3:
                    System.out.println("Balance = " + balance);
                    break;

                case 4:
                    System.out.println("\n===== TRANSACTION HISTORY =====");
                    System.out.println(history);
                    break;

                case 5:
                    System.out.println("Thank You");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}