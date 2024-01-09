package Java_basics_07;

import java.util.Scanner;

public class Java_concept_61_array {
    public static void main(String[] args) {
        // take a marks from user for 5 subject and print the marks


        Scanner sc= new Scanner(System.in);
        float m[]=new float[5];
        System.out.println("Enter the mark for first sub");
        m[0]=sc.nextFloat();

        System.out.println("Enter the mark for second sub");
        m[1]=sc.nextFloat();

        System.out.println("Enter the mark for third sub");
        m[2]=sc.nextFloat();

        System.out.println("Enter the mark for fourth sub");
        m[3]=sc.nextFloat();

        System.out.println("Enter the mark for fifth sub");
        m[4]=sc.nextFloat();

        for (int i=0; i<m.length; i++){
            if (m[i]<35){
                System.out.println("You are fail"+ m[i]);
                continue;
            }
            System.out.println("you are pass"+ m[i]);
        }
        sc.close();
    }
}
