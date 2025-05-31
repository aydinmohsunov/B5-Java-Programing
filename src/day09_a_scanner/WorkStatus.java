package day09_a_scanner;

import java.util.Scanner;

public class WorkStatus {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Please, enter your first name: ");
        String firstName = key.next(); // since it is a single word, we used .next();


        System.out.print("Please, enter your last name: ");
        String lastName = key.next(); // since it is a single word, we used .next();

        System.out.print("Are yuo employed? (true/false): "); // Yes/No
        boolean isEmployed = key.nextBoolean();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = key.nextBoolean();

        String infoAboutPerson = "The person with first name " + firstName + " and last name " + lastName + " currently employed: " + isEmployed + " and student: " + isStudent;

        System.out.println(infoAboutPerson);
}
}
