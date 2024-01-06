package Java_basics_03;

public class Java_concept_27 {
    public static void main(String[] args) {

       int a= 50;

       switch (a){
           case 52,53,51:
               System.out.println("Entered user input is available in case 1");
               break;
           case 50,55,54:
               System.out.println("Entered user input is available case 2");
               break;
           default:
               System.out.println("User enters invalid input");

       }
        System.out.println("outside switch condition");

       //another format of writing switch case -> break statement no need here

       int b=001;
       switch (b){
           case 001 ->System.out.println("it's a laptop");
           case 002 -> System.out.println("it's a mobile");
           default -> System.out.println("no item available");

       }

    }
}

