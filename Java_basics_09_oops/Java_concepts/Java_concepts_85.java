package Java_basics_09_oops.Java_concepts;

import java.util.Scanner;

public class Java_concepts_85 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a name");
        String user_Input=scanner.next();

        boolean result=isPalindrom(user_Input);
        if (result){
            System.out.println("It's palindrom");
        }else {
            System.out.println("It's not a palindrom");
        }
    }

    private static boolean isPalindrom(String userInput) {
        String name=userInput;
        StringBuilder builder=new StringBuilder(userInput);
        builder.reverse();
        return name.equalsIgnoreCase(builder.toString());
    }

}
