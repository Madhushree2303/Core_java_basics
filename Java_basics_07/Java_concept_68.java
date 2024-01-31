package Java_basics_07;

public class Java_concept_68 {
    public static void main(String[] args) {
        // function a block of code that perform some specific task
        int x= max(17,9);
        System.out.println(x);

        sayHello4time();

    }

    public static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
           return y;
        }

    }

    static void sayHello4time(){

        for (int i=0; i<4; i++){
            System.out.println("Hello");
        }

    }
}
