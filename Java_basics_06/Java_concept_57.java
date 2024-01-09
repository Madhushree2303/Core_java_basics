package Java_basics_06;

public class Java_concept_57 {
    public static void main(String[] args) {

       String name[]={"madhu", "balan", "yuva","shree"};
        String name1[]={"madhu", "balan", "yuva","shree"};

        System.out.println(name==name1);

        String name2[]=name1;
        System.out.println(name2==name1);

        // -------------------- End ----------------

        String a="madhu";
        String b="madhu";

        System.out.println(a==b); // String only compare the values

    }

}
