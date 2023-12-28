package Java_basics_01;
public class Java_concept_04 {
    public static void main(String[] args) {
        //final keyword - if final keyword is declared to any of the variable then we cannot change the variable value

        final int num = 20;

        //a=21;
        System.out.println(num);

        final String name = "test user";

        //name="new user 02";
        System.out.println(name);

        char x='\u0001';
        System.out.println(x);

        // Arithmetic Operator -> +,-,*,/

        double a= 100;
        double b= 210;

        double sum =a+b;
        System.out.printf("Your ans for sum is %f",sum);
        System.out.println();

        double sub=a-b;
        System.out.printf("your ans for sub is %f",sub);
        System.out.println();

        double mul=a*b;
        System.out.printf("your ans for mul is %f",mul);
        System.out.println();

        double div=a/b;
        System.out.printf("your ans for div is %f",div);
        System.out.println();
    }
}

