package Java_basics_08;

public class Java_concept_74 {
    public static void main(String[] args) {
        //Swap 2 numbers using 3rd variable

        int a=10;
        int b=20;

        int temp=a;
        a=b;
        b=temp;

        System.out.println(a);
        System.out.println(b);

        // swap 2 number without using 3rd varibale

        int a1=10;
        int b1=20;
        System.out.println("before swap a1->" + a1);
        System.out.println("before swap b1->" + b1);

         a1= a1+b1; // (10+20) =30
        System.out.println(a1);

        b1=a1-b1; //30-20 =10
        System.out.println("value of b1 ->" + b1);

        a1= a1-b1;
        System.out.println("value of a1 ->" +a1);

        // swap 2 number without using 3rd variable

        int x=20;
        int y=30;

        x=x*y;

        y=x/y;

        x=x/y;

        System.out.println("value of x ->"+ x);
        System.out.println("value of y ->"+ y);



    }




}
