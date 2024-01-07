package Java_basics_04;
public class Java_concept_35 {
    public static void main(String[] args) {

        // for( A ;B ; C)
        // A -> Initialization -> JVM What variable, where you are starting point
        // B - Condition -> When you want this to stop.
        // C ->  Increment / Decrement

        // Print the value of i and break if i =7

        for (int i=0; i<10; i++){
           // System.out.println("print value of"+ i);

            if (i==7){
                System.out.println("Value is 7 so break the loop");
                break;
            }
            System.out.println("print value of"+ i);
        }
    }
}

