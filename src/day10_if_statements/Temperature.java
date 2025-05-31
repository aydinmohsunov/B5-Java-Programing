package day10_if_statements;

import day04_variables.EscapeSequence;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter the temprature: ");
        int temperature = input.nextInt();
        //above or equal to 70

        if (temperature>=70) {
            System.out.println("Its a nice day");
            System.out.println("Go to outside, but with your laptop to code Java");
        }else {
            System.out.println("Its to cold");
            System.out.println("Code more Java");
        }


//        if (temperature<70){
//            System.out.println("Its to cold");
//            System.out.println("Code more Java");
        }
    }

