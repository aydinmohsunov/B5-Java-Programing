package day13_string;

public class StringMethods {
    public static void main(String[] args) {
        String name1 = "Tom";// by litterals (inside of String pool)
        String name2 = "Tom";//by litterals  (inside of String pool)
        String name3 = new String("Tom");// By new key word  directly in Heap



        //  compare MEMORY LOCATION DONT USE (including the case sensitivenes)
        System.out.println(name1==name2);
        System.out.println(name1==name3);
        System.out.println(name2==name3);

        // .equals()  this will compare the String VALUE
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
        System.out.println(name2.equals(name3));


        String name4 = new String("TOM");
        System.out.println(name1.equals(name4));
        System.out.println(new String("TOM").equals(name4));

        boolean IsN1Same = name1.equals(name3);
        System.out.println(IsN1Same);





        System.out.println("Tom".equals(name1));
        System.out.println(name3.equals("Tom"));




        // How can we compare by Ignoring the case sensitevenes
        // .equalIgnoreCase()  this willcompare the String VALUE
        String str1 ="Wed";
        String str2 ="WED";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        //How can i get how many characters we have in the STring
        // ,length()  this will give us the number of the tottal characters

        String sentence = "I love java"; // 11

        System.out.println(sentence.length());

        sentence ="loopcamp has SDET program. It lasts for 6 months.";
        System.out.println(sentence.length());

        int numOfCharactersInSentences = sentence.length();
        System.out.println(numOfCharactersInSentences);




    }
}
