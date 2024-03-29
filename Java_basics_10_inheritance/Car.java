package Java_basics_10_inheritance;

public class Car {

    int wheels;
    String body;
    String color;
    String brand;

    Car(int num,String metal,String what_cor, String what_bra){
        this.wheels=num;
        this.body=metal;
        this.color=what_cor;
        this.brand=what_bra;
    }

    public void car_ModelDetails(){
        System.out.println("This car has a "+wheels+"wheels");
        System.out.println("This car has a "+body+"body");
        System.out.println("This car has a "+color+"color");
        System.out.println("This cas brand name is "+brand);

    }


}
