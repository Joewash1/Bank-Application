package BankOnline;

import java.util.Scanner;

public class BankScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount here");
        int a = scanner.nextInt();
        System.out.println("Amount equals " + a );
    }
}
