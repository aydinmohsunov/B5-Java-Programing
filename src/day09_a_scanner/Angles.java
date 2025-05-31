package day09_a_scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please, enter 3 angles:");
        double angle1 = keyboard.nextDouble();
        double angle2 = keyboard.nextDouble();
        double angle3 = keyboard.nextDouble();

        double sumOfAngles = angle1 + angle2 + angle3;

        // if all angles ADDS up to 180, it is triangle
        boolean isTriangle = sumOfAngles == 180;


        // if all angles ADDS up to 360, it is circle
        boolean isCircle = sumOfAngles == 360;


        System.out.println("Is it a triangle: " + isTriangle);
        System.out.println("Is it a circle: " + isCircle);

    }
}
