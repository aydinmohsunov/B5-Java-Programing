package day15_tasks;

public class RemoveSpace {
    public static void main(String[] args) {


        String str = "     loopcamp   "; // 16 characters

        System.out.println(str);
        System.out.println(str.length());

        System.out.println("====================");

        // #9- "".trim(); - removes the empty spaces from th begining and end

        System.out.println(str.trim());
        System.out.println(str);
        str = str.trim();
        System.out.println(str);

        System.out.println("======================");

        String str2 = "      java is nice programming language";
        System.out.println(str2.trim());

    }
}

