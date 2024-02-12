package Java_basics_08;

public class Java_concept_80 {
    public static void main(String[] args) {
        // how to reverse a string

        String name ="madhu";
        String rev_name="";
        System.out.println("Actual sting :" + name);

        for (int i=0; i<name.length(); i++){
            rev_name= name.charAt(i)+rev_name;
        }
        System.out.println("Reversed string :" + rev_name);
    }
}
