package Java_basics_02;
public class Java_concept_13 {
    public static void main(String[] args) {
        //ternary operator
        //int a= condition ? if condition true print this: else print this;

        int a=5000;
        int b=1000;
        int c=150;

        int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println(max);

    }
}

