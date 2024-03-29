package Java_basics_10_inheritance;

public class Java extends Programming{

    String new_feature;

    Java(){
        System.out.println("Java DC");
    }

    void print_details(String featue){
        this.new_feature=featue;
        System.out.println(new_feature);
    }
}
