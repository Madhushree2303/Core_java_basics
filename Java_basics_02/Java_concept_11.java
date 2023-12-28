package Java_basics_02;
public class Java_concept_11 {
    public static void main(String[] args) {

        String name="madhu";

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String username= new String("test user");

        System.out.println("Printing both names ->"+name + username);

        System.out.println(new String("automation testing"));

        int a=20;
        int b=35;

        System.out.println(a+b+name+username);
        System.out.println(name+username+a+b);
        System.out.println(username+a+name+b);
        System.out.println(name+username+(a+b));
    }
}

