package day13_string;

import java.util.Scanner;

public class DaysInWeek {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Please , enter a number that represents day of week (between 1 - 7)");
        int userInput = scan.nextInt();
        String dayFromNum ="";

        switch (userInput){

            case 1 :
                //System.out.println("Monday");
                dayFromNum = "Monday";
                break;
            case 2:
               // System.out.println("Tuesday");
                dayFromNum = "Tuesday";
                break;
            case 3:
               // System.out.println("Wednsday");
                dayFromNum = "Wednsday";
                break;
            case 4:
               // System.out.println("Thursday");
                dayFromNum = "Thursday";
                break;
            case 5:
                //System.out.println("Friday");
                dayFromNum = "Friday";
                break;
            case 6:
                //System.out.println("Saturday");
                dayFromNum = "Saturday";
                break;
            case 7:
               // System.out.println("Sunday");
                dayFromNum = "Sunday";
                break;
            default:
            System.out.println("Not a day");


        }

        System.out.println(dayFromNum);




    }
}
