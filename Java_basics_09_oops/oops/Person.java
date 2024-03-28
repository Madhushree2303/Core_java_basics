package Java_basics_09_oops.oops;

public class Person {

    String name;
    int age;

    long ph_num;
    String address;
    String sex;

    public void eat(){
        System.out.println("veg");

    }

    public void talk(){
        System.out.println("i can talk in english");

    }

    public void walk(){
        System.out.println("i can walk");

    }
    public String person_name(){
        return name;
    }
}
