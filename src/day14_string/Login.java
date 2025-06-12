package day14_string;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        String validUsername = "loopcamp";
        String validPassword = "Loop Batch#5";

        System.out.print("please, enter your user name: ");
        String inputUsername= keyboard.next();

        keyboard.nextLine(); // to handle ENTER
        System.out.print("Please, enter your password: ");
        String inputPassword = keyboard.nextLine();

        if (validUsername.equalsIgnoreCase(inputUsername) && validPassword.equals(inputPassword)){
            System.out.println("You have looged in");


        }else {

            System.out.println("Incorrect inpu");

            if (!validUsername.equalsIgnoreCase(inputUsername)){
                System.out.println("Username is not correct");
            }
            if (!validPassword.equals(inputPassword)){
                System.out.println("Password is not correct");

                // chek if the passwor is  8character long
                if (inputPassword.length()<8){
                    System.out.println("Your password input should not be less than 8 characters");
                }
            }
        }



    }
}
