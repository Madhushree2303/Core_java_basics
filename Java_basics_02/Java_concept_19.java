package Java_basics_02;

import java.util.Scanner;

public class Java_concept_19 {
    public static void main(String[] args) {
        // if & else condition

        Scanner sc=new Scanner(System.in);

        int num= sc.nextInt();

        if (num>30){
            System.out.println("number is >30");
        } else if (num>10) {
            System.out.println("number is > 10");

        }else {
            System.out.println("number is <40");
        }
    }
}

