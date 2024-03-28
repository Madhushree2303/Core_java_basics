package Java_basics_09_oops.Java_concepts;

public class Java_concepts_81 {
    public static void main(String[] args) {
        // String operation

        String name = "Hello";

      String str1="Madhu";

      str1=str1.concat(name);
        System.out.println(str1);

        System.out.println(name.concat("balan"));
        System.out.println(name+"TEST");
        System.out.println(name.contains("a"));

        String  actual_pwd="Madhu@023";
        String  expected_pwd="madhu@023";

        if (actual_pwd.equalsIgnoreCase(expected_pwd)){
            System.out.println("yes");
        }

        String s1 = "Pramod"; // String constant pool
        String s4= "Pramod";
        String s2 = new String("Pramod"); // object area
        String s3 = new String("Pramod");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s4);
        System.out.println(s2==s3);
        System.out.println("hello");

    }
}
