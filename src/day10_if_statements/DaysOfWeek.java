package day10_if_statements;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);


        System.out.println("Please , enter a number between 1-7 (inclusive): ");
        int weekDayInNumberFromUser = key.nextInt();

        if (weekDayInNumberFromUser == 1){
            System.out.println("Monday");
        }
        if (weekDayInNumberFromUser == 2){
            System.out.println("Teusday");
        }
        if (weekDayInNumberFromUser==3){
            System.out.println("Wednesday");
        }
        if (weekDayInNumberFromUser==4){
            System.out.println("Thursday");
        }
        if (weekDayInNumberFromUser==5){
            System.out.println("Friday");
        }
        if (weekDayInNumberFromUser==6){
            System.out.println("Saturday");

        }
        if (weekDayInNumberFromUser==7){
            System.out.println("Sunday");
        }
        if (weekDayInNumberFromUser<1 || weekDayInNumberFromUser>7){
            System.out.println("Invalid number.There is not Weekday for the number." + weekDayInNumberFromUser);
        }
        System.out.println("---------------------------------------------------------------");
        if (weekDayInNumberFromUser ==1){
            System.out.println("Monday");
        }else if (weekDayInNumberFromUser == 3){
            System.out.println("Wendsday");
        }else {
            System.out.println("Invalid number.There is not Weekday for the number." + weekDayInNumberFromUser);
        }

    }
}
