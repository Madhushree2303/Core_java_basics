package Java_basics_08;

public class Java_concept_79 {
    public static void main(String[] args) {
        // how to reverse a string

        String name ="madhu";
        String rev_name="";

        for (int i=name.length()-1; i>=0; i--){
            rev_name=rev_name+name.charAt(i);

        }
        System.out.println(rev_name);
    }
}
