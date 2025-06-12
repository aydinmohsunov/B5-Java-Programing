package day14_string;

public class UpperAndLowerCase {
    public static void main(String[] args) {
        String day= "Thursday";
        System.out.println(day);

        //#4 - .toUpperCase(); --->  converts the String to ALL UPPERCASE and returns String

        System.out.println(day.toUpperCase());
        System.out.println(day);
        day = day.toUpperCase(); // RE-ASSIGNED new ALL UPPERCASE version to "day" refence

      //#5 - "" .toLowerCase() --> converts thr String to ALL lowercase and returns String

        day.toLowerCase(); // I made it lowercase but did not use
        System.out.println(day);

        System.out.println(day.toLowerCase());
        System.out.println(day );
        day = day.toLowerCase();
        System.out.println(day);

        System.out.println("=========================");
        String word = "ToDay is oOd dAy#@!";
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());









    }
}
