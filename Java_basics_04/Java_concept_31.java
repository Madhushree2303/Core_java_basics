package Java_basics_04;

import java.util.Scanner;

public class Java_concept_31 {
    public static void main(String[] args) {

     // take a input from user and print it

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter user name");
        String name=sc.next();

        System.out.println("Enter user ph number");
        long ph_num=sc.nextLong();

        System.out.println("Enter user sex");
        String sex=sc.next();

        System.out.println("Enter user salary");
        double sal=sc.nextDouble();

        System.out.println("User name is " + name);
        System.out.println("user ph number is " + ph_num);
        System.out.println("User sex is " + sex);
        System.out.println("User sal is " + sal);

        sc.close();
    }
}

