package Java_basics_09_oops.oops;

public class Java_oops_concepts_90 {

    String draw; // Instance vaiable


    Java_oops_concepts_90(String todraw){
        draw=todraw;
    }
    void drawing(){
        System.out.println("Draw a "+ draw);
    }

    public static void main(String[] args) {

        Java_oops_concepts_90 javaOopsConcepts90=new Java_oops_concepts_90("circle");
        javaOopsConcepts90.drawing();

        Java_oops_concepts_90 javaOopsConcepts=new Java_oops_concepts_90("rectangle");
        javaOopsConcepts.drawing();

    }

}
