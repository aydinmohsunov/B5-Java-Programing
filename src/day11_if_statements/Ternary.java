package day11_if_statements;

public class Ternary {
    public static void main(String[] args) {
        int a = 20;
        String result;

        if (a%2 ==0){
            result="Even";
        }else {
            result = "Odd";
        }
        System.out.println(result);

        //Option 2
        String result1 = (a%2 == 0)? "Even": "Odd";
        System.out.println(result1);

    }
}
