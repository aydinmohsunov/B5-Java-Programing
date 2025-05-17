package day05_variables;

public class CellPhone {
    public static void main(String[] args) {

        String brand = "Apple";
        String model = "Iphone 16Pro";
        String color = "Black";  // White,Black,Gold

        double price = 1100.99;
        int storage = 256;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("I have an" + model + " from " + brand + "." );
        System.out.println("It came with" + color + "color and with storage of " + storage + " GB.");
        System.out.println("For the SIM type" + sim + " With a camera" + hasCamera );


    }
}
