package Java_basics_08;

import java.util.Scanner;

public class Java_concept_78 {
    public static void main(String[] args) {
        // how to reverse a string

        //String name= "madhu";
        char charArray[]= {'m','a', 'd','h','u'};
        System.out.println(charArray.length);

        int left=0;
        int right=charArray.length-1;

        while (left<right){
            char temp_char=charArray[left]; //temp = m
            charArray[left]=charArray[right]; //m == u
            charArray[right]=temp_char; // u == m

            left++;
            right--;
        }
        String rev_sting= new String(charArray);
        System.out.println(rev_sting);

    }
}
