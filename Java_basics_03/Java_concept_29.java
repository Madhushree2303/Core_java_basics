package Java_basics_03;

public class Java_concept_29 {
    public static void main(String[] args) {

       char code='C';

       int val= switch (code){
           case 'A':
               yield 65;
           case 'B':
               yield 66;
           case 'C':
               yield 67;
           default:
               throw new IllegalStateException("Unexpected value: " + code);
       };
        System.out.println(val);
    }
}

