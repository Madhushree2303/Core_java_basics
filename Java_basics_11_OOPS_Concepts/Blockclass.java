package Java_basics_11_OOPS_Concepts;

public class Blockclass {

    {
        int a=10;
        int b=20;
        int c= a+b;
        System.out.println("Empty blocks with number -> "+c);
    }

    static {
        System.out.println("this is static block");
    }

    Blockclass(){
        System.out.println("This is DC");
    }
}
