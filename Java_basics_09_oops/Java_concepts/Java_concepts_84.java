package Java_basics_09_oops.Java_concepts;

public class Java_concepts_84 {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder("Madhu");

        StringBuffer buffer=new StringBuffer("Balan");

        buffer.reverse();

        builder.reverse();
        System.out.println(buffer);
        System.out.println(builder);
    }
}
