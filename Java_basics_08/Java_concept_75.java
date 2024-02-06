package Java_basics_08;

import java.util.Scanner;

public class Java_concept_75 {
    public static void main(String[] args) {
        // take input from user and print it

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size");
        int n= sc.nextInt(); //5
        int num_array[]=new int[n];

        System.out.println("Enter a element");

        for (int i=0; i<n; i++){
            num_array[i]=sc.nextInt();
        }
        System.out.println("----------- Out put");

        for (int i=0; i<n; i++){
            System.out.println(num_array[i]);
        }



    }
}
