package day11_if_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance;
        double withdraw;

        System.out.print("What is your balance: ");
        balance = scanner.nextDouble();


        System.out.print("How much money do you want to withdraw: ");
        withdraw = scanner.nextDouble();

        if (balance >= withdraw) {


            balance -= withdraw;
            System.out.print("Your new balance is: " + balance);

            //I want to withdraw more than my remaining balnce
            //200

        }else {
            System.out.println("Not enaugh balance");
        }
    }
}