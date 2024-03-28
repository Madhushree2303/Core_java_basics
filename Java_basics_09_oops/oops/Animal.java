package Java_basics_09_oops.oops;

public class Animal {

    String animal_name;

    String animal_type;

    Animal(String name, String type){
        animal_name=name;
        animal_type=type;

    }
    void sayabout_animal(){
        System.out.println("Name of this animal is "+animal_name+" & Animal type is "+animal_type);
    }
}
