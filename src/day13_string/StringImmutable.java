package day13_string;

import day04_variables.ShophingRecipt;

public class StringImmutable {
    public static void main(String[] args) {

        String word1 = "Loop";
        String word2 = "Loop";

        System.out.println(word1);
        System.out.println(word2);


        word1 = word1 + "camp";
        System.out.println("-----------------");
        System.out.println(word1);
        System.out.println(word2);


        String word4 = new String("Wed");
        word4 = "Wednesday";
        word4 = new String("Wednsday");
        word4 = new String("Wednsday");
        System.out.println(word4);
        // IMMUTABE --> once the String is created, it CANNOT be modified (changed)

    }
}
