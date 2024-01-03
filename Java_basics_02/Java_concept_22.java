package Java_basics_02;

import java.util.Scanner;

public class Java_concept_22 {
    public static void main(String[] args) {
        // if & else condition

        //✅ Triangle Classifier
        //   Write a program that classifies a triangle based on its side lengths.
        //   Given three input values representing the lengths of the sides, determine

        //   if the triangle is equilateral (all sides are equal),
        //   isosceles (exactly two sides are equal), or
        //   scalene (no sides are equal).
        //   Use an if-else statement to classify the triangle.

        //  side 1, side 2, side 3 ->  side1 == side 2 == side 3 ->  equilatera
        // (side1 == side 2) or side 2 == side 3 -> isosceles
        // scalene

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side 1");
        int side_1=sc.nextInt();
        System.out.println("Enter side 2");
        int side_2=sc.nextInt();
        System.out.println("Enter side 3");
        int side_3=sc.nextInt();


        if (side_1 == side_2 && side_1==side_3 && side_2==side_3){
            System.out.println("equilateral");
        } else if (side_1 == side_2 || side_1==side_3 || side_2==side_3) {
            System.out.println("isosceles");
        }else {
            System.out.println("scalene");
        }
    }
}

