package Java_basics_05;

import java.util.Scanner;

public class Java_concept_48 {
    public static void main(String[] args) {
        // factorial program
        // 1! -> 1
        // 2! -> 2*1
        // 3! -> 3*2*1
        // ............
        // 5! -> 5*4*3*2*1

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();

       int fact=1;
       for (int i=1; i<=num; i++){
           fact=fact*i;
       }
        System.out.println(fact);

        sc.close();
    }
}

