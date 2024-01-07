package Java_basics_05;
public class Java_concept_42 {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            if (i%2==0){
                System.out.println("value even of "+i);
                continue;
            }
            System.out.println("value odd of"+ i);

        }

    }
}

