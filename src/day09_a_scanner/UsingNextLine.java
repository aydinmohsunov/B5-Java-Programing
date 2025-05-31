package day09_a_scanner;

import java.util.Scanner;

public class UsingNextLine {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("What day is today: ");
        String day = key.nextLine();

        System.out.print("Enter your name: ");

        String firstName = key.next();
        System.out.print("Enter your last name: ");
        String lastName = key.next();
        key.nextLine(); // we are using for To handle next line
        System.out.print("Please  enter your address: ");
        String address = key.nextLine();




    }
}
