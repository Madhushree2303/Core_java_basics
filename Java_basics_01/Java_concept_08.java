package Java_basics_01;
public class Java_concept_08 {
    public static void main(String[] args) {
       // Logical operators
        // !, &&, || -> operators( NOT, AND, OR)

        //! - NOT operator
        boolean a= true;
        System.out.println(!a);

        System.out.println(!(120>30));
        System.out.println(!(100==100));
        System.out.println(!(120>=120));

        // && AND Operator

        System.out.println(true&&true); // T
        System.out.println(false&&true); // F
        System.out.println(true&&false); // F
        System.out.println(false&&false); // F

        //|| OR Operator

        System.out.println(true||true); // T
        System.out.println(false||false); // F
        System.out.println(false||true); // T
        System.out.println(true||false); // T
    }
}

