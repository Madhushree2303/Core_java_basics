package Java_basics_03;

import java.util.Scanner;

public class Java_concept_25 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a char i will tell it's a vowel or not");

        char single_char=sc.next().toCharArray()[0];

        switch (single_char){
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("not a vowel");
        }




    }
}

