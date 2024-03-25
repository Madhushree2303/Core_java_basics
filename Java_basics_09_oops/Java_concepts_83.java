package Java_basics_09_oops;

public class Java_concepts_83 {

    public static void main(String[] args) {
        String password="Automation@123";

        //if I want to use password 100 time then Sting is not the right one

        StringBuffer stringBuffer=new StringBuffer("Manual");
        stringBuffer.append("Testing@123");
        System.out.println(stringBuffer);

        StringBuilder builder=new StringBuilder("Testing");
        builder.append("123");
        builder.append("456");
        System.out.println(builder);

    }


}
