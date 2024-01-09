package Java_basics_06;

public class Java_concept_55 {
    public static void main(String[] args) {

        final String [] name= new String[5];

        System.out.println(name[0]);

        name[0]="madhu";
        System.out.println(name[0]);


        final int[] b = new int[4];
        // b -> [0,0,0,0]
         b[0] = 78;
        System.out.println(b[0]);
    }
}
