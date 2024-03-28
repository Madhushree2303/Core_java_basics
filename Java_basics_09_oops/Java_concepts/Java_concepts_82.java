package Java_basics_09_oops.Java_concepts;

public class Java_concepts_82 {
    public static void main(String[] args) {
        // String operation

        //String as immutable in nature that is it cannot changed
      String name="Selenium";
      System.out.println(name);
      name=name.concat("balan");
        System.out.println(name);

        //StringBuffer & Builder are mutable in nature that it's changed
      StringBuffer stringBuffer=new StringBuffer("Manual");

      stringBuffer.append("Testing");
        System.out.println(stringBuffer);
        stringBuffer.delete(1,3);
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.charAt(2));


      StringBuilder stringBuilder=new StringBuilder("Automation");

      stringBuilder.append("Testing");
        System.out.println(stringBuilder);





    }
}
