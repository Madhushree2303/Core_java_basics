package Java_basics;
public class Java_concept_05 {
    public static void main(String[] args) {

        int num1=34;
        int num2=10;
        int num3=num1%num2;

        System.out.println(num3);

        int a=78;
        int b=12;
        int c=a%b;
        System.out.println(c);

        int  num = 38;
        int r = num%2;
        System.out.println(r);

        String name=null;
        name="test";

        System.out.println(name);

        char c1='\n'; //new line
        char c2='\t'; //add tab
        char c3='\b'; //remove one character
        char c4='\r'; //remove one word

        System.out.println("Madhubalan"+c4+"test");
        System.out.println("Madhu"+c3+"balan");
        System.out.println("Madhu"+c2+"balan");
        System.out.println("Madhu"+c1+"balan");

        byte x=10;
        byte y=20;
        System.out.println(x+y);

        int a1 = +10;
        int a2 = -10;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(x+y-a1-a2);


    }
}

