package BankOnline;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount obj1 = new BankAccount("Lexith","LW125125");
        obj1.showMenu();
    }

}
class BankAccount{
    int balance;
    int prevTransaction;
    String customerName;
    String customerID;

    BankAccount(String cusName, String cusID)
    {
        customerName = cusName ;
        customerID = cusID;
    }


    void deposit(int amount){
        if(amount != 0)
        {
            balance = balance + amount;
            prevTransaction = amount;
        }
    }
    void withdraw(int amount){
        if(amount != 0)
        {
            balance = balance - amount;
            prevTransaction = -amount;
        }

    }
    void getprevTransaction()
        {
        if(prevTransaction > 0)
        {
            System.out.println("Deposited "+ prevTransaction);
        }
        else if(prevTransaction < 0){
            System.out.println("Withdrew " + Math.abs(prevTransaction));
        }
        else{
            System.out.println("No transaction");
        }
    }
    void showMenu()
    {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome "+ customerName);
        System.out.println("Your ID is "+ customerID);
        System.out.println("\n");
        System.out.println("A: Check your Balance");
        System.out.println("B: Make a Deposit");
        System.out.println("C: Make a Withdrawal");
        System.out.println("D: Check Your Last Transaction");
        System.out.println("E: Exit");

        do
        {
            System.out.println('\n');
            System.out.println("Enter Option");
            System.out.println('\n');
            option = scanner.next().charAt(0);

            switch(option)
            {
                case 'A':

                        System.out.println("============================================================================");
                        System.out.println("Your balance is "+ balance);
                        System.out.println("============================================================================");
                        break;
                case 'B':
                    System.out.println("============================================================================");
                    System.out.println("Enter amount to deposit");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("============================================================================");
                    break;
                case 'C':
                    System.out.println("============================================================================");
                    System.out.println("Enter amount to withdraw");
                    amount = scanner.nextInt();
                    withdraw(amount);
                    System.out.println("============================================================================");
                    break;
                case 'D':
                    System.out.println("============================================================================");
                    getprevTransaction();
                    System.out.println("============================================================================");
                    break;
                default:
                    System.out.println("Invalid Option");





            }

        } while(option != 'E');
        System.out.println("Thank you for using Washington Financial Services!");


    }




}