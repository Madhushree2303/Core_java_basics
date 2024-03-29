package Java_basics_10_inheritance.multilevel_inheritance;

public class Son extends Father{

String  name;
    void bhk1(String house_name) {
        this.name=house_name;
        System.out.println("I have a 1BHK house & house name is "+name);
    }

    public static void main(String[] args) {
        Son son=new Son();
        son.number_OfRooms=1;
        son.bhk2();

    }
}
