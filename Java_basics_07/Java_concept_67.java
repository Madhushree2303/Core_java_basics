package Java_basics_07;

public class Java_concept_67 {
    public static void main(String[] args) {

      int a= num_sum(); // no arguments
      int a1= num_sum(2,7); // 1 arguments
      int a2= num_sum(5);
      printhello();

        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
    }

    static int num_sum(){
        return 100;

    }

    static int num_sum(int input_1){
        return input_1;

    }

    static int num_sum(int input_1, int input_3){
        return input_1+input_3;

    }

    static void printhello(){
        System.out.println("Hello");
    }
}
