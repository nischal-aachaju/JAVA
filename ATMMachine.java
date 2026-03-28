import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctPin = "1234";
        double balance = 5000.00;
        int attempts = 0;
        boolean loggedIn = false;

        System.out.println("       Welcome to ATM        ");


        // PIN verification - 3 attempts
        while (attempts < 3) {
            System.out.print("Enter your PIN: ");
            String pin = scanner.next();
            attempts++;

            if (pin.equals(correctPin)) {
                loggedIn = true;
                System.out.println("Login successful!\n");
                break;
            } else {
                int remaining = 3 - attempts;
                if (remaining > 0) {
                    System.out.println("Wrong PIN! " + remaining + " attempt(s) left.");
                } else {
                    System.out.println("Card blocked. Too many wrong attempts.");
                }
            }
        }

    
        while (loggedIn) {
            System.out.println("-----------------------------");
            System.out.println("         ATM MENU            ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("-----------------------------");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Your balance: Rs. " + balance);

            } else if (choice == 2) {
                System.out.print("Enter deposit amount: Rs. ");
                double amount = scanner.nextDouble();
                if (amount > 0) {
                    balance += amount;
                    System.out.println("Rs. " + amount + " deposited successfully.");
                    System.out.println("New balance: Rs. " + balance);
                } else {
                    System.out.println("Invalid amount.");
                }

            } else if (choice == 3) {
                System.out.print("Enter withdrawal amount: Rs. ");
                double amount = scanner.nextDouble();
                if (amount <= 0) {
                    System.out.println("Invalid amount.");
                } else if (amount > balance) {
                    System.out.println("Insufficient balance!");
                } else {
                    balance -= amount;
                    System.out.println("Rs. " + amount + " withdrawn successfully.");
                    System.out.println("Remaining balance: Rs. " + balance);
                }

            } else if (choice == 4) {
                System.out.println("Thank you for using ATM. Goodbye!");
                loggedIn = false;

            } else {
                System.out.println("Invalid option. Please choose 1-4.");
            }

            System.out.println();
        }

        scanner.close();
    }
}