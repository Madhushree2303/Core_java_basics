package Java_basics_06;

public class Java_concept_56 {
    public static void main(String[] args) {

        int a[]={1,2,3,4,5};
        int b[]={1,2,3,4,5};
        int d[]=b;
        int c[]=a;

        // When we compare 2 arrays it will check reference value not the array values
        // if arrays ref value equal then it's true. if ref value not equal then false.

        System.out.println(a==b); // false

        System.out.println(a.equals(b)); // false

        System.out.println(a==c); // true
        System.out.println(a.equals(c)); // true
        System.out.println(b==d); // true

    }
}
