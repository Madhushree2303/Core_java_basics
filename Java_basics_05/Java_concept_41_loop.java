package Java_basics_05;
public class Java_concept_41_loop {
    public static void main(String[] args) {

        for (int i=0; i<7; i++){
            System.out.println(i);
            if (i==5)
                continue; // Continue is used to skip the current iteration
            // continue we can not use outside loop
            System.out.println("****** after *******");
        }
    }
}

