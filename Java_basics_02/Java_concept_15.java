package Java_basics_02;
public class Java_concept_15 {
    public static void main(String[] args) {
        // increment operator

        int a = 10;

        System.out.println(++a + ++a + ++a + a++);

        //exp 11 ->a 11
        //exp 12 -> a 12
        //exp 13 -> a 13
        //exp 13 -> a 14

        System.out.println(a); // 14

        int b=20;

        System.out.println(--b + b-- + ++b);
        // 19 +19 + 19
        System.out.println(b);
        //19

        System.out.println(--b + b--);
        //18 + 18
        System.out.println(b);
        //17


    }
}

