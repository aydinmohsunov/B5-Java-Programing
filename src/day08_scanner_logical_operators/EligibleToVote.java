package day08_scanner_logical_operators;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Tom Jerry";
        boolean isCitizen = true;
        boolean hasCriminalBackground = false; // NO
        int age = 30;

        //boolean is18orOlder = age >= 18;
        boolean isEligible = age >= 18 && isCitizen && !hasCriminalBackground; // true && true && !false

        System.out.println(name + " is eligible to vote: " + isEligible);


        System.out.println("--------------------------------------------------");
        name = "Winnie Pooh";
        isCitizen = false;
        hasCriminalBackground = false;
        age = 20;
        isEligible = age >= 18 && isCitizen && !hasCriminalBackground;
        //             true    &&  false    &&  !false(true)
        //                     false      &&  true
        //                              false

        System.out.println(name + " is eligible to vote: " + isEligible);


        System.out.println("--------------------------------------------------");
        name = "James Bond";
        isCitizen = true;
        hasCriminalBackground = false;
        age = 10;
        isEligible = age >= 18 && isCitizen && !hasCriminalBackground;
        //             false    &&  true    &&  !false(true)
        //                     false      &&  true
        //                              false

        System.out.println(name + " is eligible to vote: " + isEligible);
    }
}
