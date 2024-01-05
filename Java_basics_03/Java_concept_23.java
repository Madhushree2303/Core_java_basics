package Java_basics_03;

import java.util.Scanner;

public class Java_concept_23 {
    public static void main(String[] args) {
        // if & switch -> condition based
        //Loops -> for, while & do while -> repeats the code until the condition met

        // Enter a number and i will tell with day it's. like 1 ->sunday,2 -> Monday, 3 ->Tuesday.......

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int day_num=sc.nextInt();

        switch (day_num){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
            default:
        }
    }
}

