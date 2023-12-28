package Java_basics_01;
public class Java_concept_09 {
    public static void main(String[] args) {
       // Logical operators
        // !, &&, || -> operators( NOT, AND, OR)

        int a =120;

        boolean b= !(a>90 && a>130);
        System.out.println(b);

        boolean c= !(a==120 || a<50);
        System.out.println(c);

        byte x= 76;
        byte y=87;
        boolean z =(x <= y);
        System.out.println(z);


    }
}

