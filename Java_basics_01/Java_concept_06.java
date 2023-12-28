package Java_basics_01;
public class Java_concept_06 {
    public static void main(String[] args) {

        int a=10;
        int b=25;
        int c=a+b;
        String name="madhu";

        // + concatenation operation
        System.out.println(a+b+c+name);
        System.out.println(name+a+b+c);
        System.out.println(a+name+c);
        System.out.println(name+b+c);

        // compound assignment operator
        int a1=40;
        int b1=35;
        int c1=99;

        b1+=37;
        System.out.println(b1);
        a1-=28;
        System.out.println(a1);
        b1/=20;
        System.out.println(b1);
        a1*=10;
        System.out.println(a1);
        c1%=12;
        System.out.println(c1);

    }
}

