package day03_comments_escape_sequence;

public class EscapeSequenceQuote {




    public static void main(String[] args){

        /*
         Q: To be able to print we need double quotes.
           ex: Programing Language "Java" is great one

        * */
        // ESCAPE SEQUENCE------>\
        // \ -----> Backward slash
        // /------> Forward slash

        System.out.println("Programming Language \"Java\"is great one");

        /*
        Q: Since we use Backward SLASH for double qutes, how do we print the BACKWARD SLASH itself?


         */
        System.out.println("Today is 15 10 2025" );
        System.out.println("Today is 15 \10\2025" );// loosed informaition
        System.out.println("Today is 15\\ 10 \\2025" );

        // Single Quote with ESCAPE SEQUENCE
        System.out.println("Today is 15'10'2025");
        System.out.println("Today is 15\\'10'\\2025");

    }
}
