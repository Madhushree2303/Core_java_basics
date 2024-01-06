package Java_basics_03;

import java.util.Scanner;

public class Java_concept_30 {
    public static void main(String[] args) {

      // 3/x^2 + y^2 - |z| ->solve this

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter  x value");
        double x=sc.nextDouble();
        System.out.println("Enter  y value");
        double y=sc.nextDouble();
        System.out.println("Enter  z value");
        double z=sc.nextDouble();

       double result=Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println(result);
        sc.close();

    }
}

