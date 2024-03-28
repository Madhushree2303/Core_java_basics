package Java_basics_09_oops.oops;

public class Atb5x_person {

    String name;
    long ph_num;
    String course;
    int fees;

    Atb5x_person(){

    }
    Atb5x_person(String ref_name){
        this.name=ref_name;
    }
    void printdetails(){
        System.out.println(name);
        System.out.println(course);
    }

}
