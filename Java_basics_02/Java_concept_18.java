package Java_basics_02;

import java.util.Scanner;

public class Java_concept_18 {
    public static void main(String[] args) {
        // if & else condition

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter b number");
        int b = sc.nextInt();
        System.out.println("Enter c number");
        int c = sc.nextInt();

        // if a<b ->b else -> a

        if (a>b && a>c){
            System.out.printf("number is %d", a);
        }else if (b>a && b>c){
            System.out.println("Max value is" +b);
        } else if (c>a && c>b) {
            System.out.println("Max value is"+c);
        }

    }
}

