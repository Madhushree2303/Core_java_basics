package Java_basics_02;

import java.util.Scanner;

public class Java_concept_17 {
    public static void main(String[] args) {
        // if & else condition

        if (2+2 >=7){
            System.out.println("condition matching");
        }
        System.out.println("---------- end of first if condition-----------");


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number i will tell it's even or odd");
        int a = sc.nextInt();


        if (a%2 ==1){
            System.out.println("ODD number");
        }else
        {
            System.out.println("EVEN number");
        }
        System.out.println("---------- end of second if condition-----------");

    }
}

