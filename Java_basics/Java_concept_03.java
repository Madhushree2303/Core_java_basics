package Java_basics;
public class Java_concept_03 {
    public static void main(String[] args) {
        //Data types in java
        // boolean, char, byte, short, int, long, float and double.
        // using printf to print the variables value with format

        byte age1= 120;
        short test=12434;
        int age =20;
        long lon= 1232386887679L;

        String name="madhu";
        char a='A';
        float f=34.4223f;

        System.out.printf("Your age is %d",age);
        System.out.printf("Your test is %d",test);
        System.out.printf("Your age1 is %d",age1);
        System.out.printf("Your lon is %d",lon);

        System.out.printf("Your name is %s",name);
        System.out.printf("Your a is %c",a);
        System.out.printf("Your f is %f",f);


        short a11=120;
        a11=121;
        a11=190;
        System.out.println(a11);

        byte b11=120;
        b11=122;
        b11=123;
        System.out.println(b11);

    }
}
