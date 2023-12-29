package Java_basics_02;
public class Java_concept_12 {
    public static void main(String[] args) {

        String str1="madhu";
        String str2="balan";
        String str3="test";

        String str4=str1+str2;
        System.out.println(str4);
        String str5=str3.concat(str2);
        System.out.println(str5);

        System.out.println(str1 instanceof String);
        System.out.println(str4 instanceof Object);

        int a=true ? 10:20;
        System.out.println(a);

        int b=(46>56)? 20:50;
        System.out.println(b);

        String c=(10<20)? "10":"20";
        System.out.println(c);

        String d= (270==720) ? "madhu": "balan";
        System.out.println(d);

        int a1=20;
        int b1=30;

        int min=(a1>b1) ? b1:a1;
        System.out.println(min);

        int max=(a1>b1) ? a1:b1;
        System.out.println(max);

    }
}

