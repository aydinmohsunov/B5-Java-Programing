package day13_string;

public class SwitchExample {
    public static void main(String[] args) {
         int num =2;

        switch (num){
            case 1 :
                System.out.println("Before multiplication arithmetic operator appliaed: " + num);
                num *= 10;
                System.out.println("After multiplication arithmetic operator appliaed: " + num);
                break;

            case 2:
                System.out.println("Before modules operator appliaed to your num: "+num);
                if (num%2==0){
                    System.out.println("Your num is Even");
                }else {
                    System.out.println("Your num is ODD num");
                }
                break;


        }
        System.out.println("---------------------------------------");

        int num2 =7;
        if (num2<4){
            System.out.println("YTour num is less than 4");
        }else {
            switch (num2){
                case 4:
                case 5:
                case 6:
                    System.out.println("Your num is between 4 snd 6");
                    break;
                case 7:
                    System.out.println("your num is 7");

                default:
                    System.out.println("Your num is above 7");

            }
        }

    }
}
