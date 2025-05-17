package day03_comments_escape_sequence;

public class EscapeSequenceTabAndNextLine {

    public static void main(String[] args) {

        // \t---> is for TAB wich is equal to 4 spaces from begining

        System.out.println("This not tabbed");
        System.out.println("    This not tabbed");
        System.out.println("        This not tabbed");
        System.out.println("        8 spaces");

        System.out.println("\t\t\t\tThis is tabbed");


        System.out.println("-------------------------------------------------------");



        //\n ---> is for next line

        System.out.print("This is all about new line with Escape Sequence.\nHere we used escape sequence ");
        //System.out.println("Here we used escape sequence");
        System.out.println("\nNEW line");



    }
}
