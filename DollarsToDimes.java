
// Shekib Hadad
// This program converts the amount in dollars in its components.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount: ");
        double amount = input.nextDouble();

        int remainingAmount = (int) Math.round(amount * 100);

        int dollar = remainingAmount / 100;

        remainingAmount %= 100;

        int quarter = remainingAmount / 25;

        remainingAmount %=25;

        int dimes = remainingAmount / 10;

        remainingAmount %= 10;

        int nickels = remainingAmount / 5;

        remainingAmount %= 5;

        int pennies = remainingAmount;

        System.out.println("Your amount of " + amount + "consist of: ");
        System.out.println("Dollars: " + dollar);
        System.out.println("Quarters: " + quarter);
        System.out.println("Dimes : " + dimes);
        System.out.println("Nickels: " + dimes);
        System.out.println("Pennies: " + pennies);


    }
}