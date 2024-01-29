package Java_basics_07;

public class Java_concept_64 {
    public static void main(String[] args) {

        // find leap year
        // A leap year is divisible by 4,
        // but not by 100 unless it is also divisible by 400.

        int year = 2025;

        if((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println("Leap year");
        }else {
            System.out.println("Not a leap year");
        }

    }
}
