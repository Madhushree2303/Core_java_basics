package Java_basics_05;

import java.util.Scanner;

public class Java_concept_49 {
    public static void main(String[] args) {
        // factorial program for 7!
        // 7! -> 7*6*5*4*3*2*1


        int num=7;

        int fact=1;

        int i=1;
        while (i<=num){
            fact=fact*i; // 1 -> 2 > 6 > 24 > 120
            i++;
        }
        System.out.println("Factorial value of 7 is -> "+ fact);


    }
}

