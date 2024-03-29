package Java_basics_10_inheritance;

public class Volvo extends Car{

    Volvo(int num, String metal, String what_cor, String what_bra) {
        super(num, metal, what_cor, what_bra);
        super.body="gold";
    }


    public static void main(String[] args) {
        Volvo volvo=new Volvo(4,"iron","green","bmw");
        /*volvo.brand="Volvo";
        volvo.wheels=4;
        volvo.color="Red";
        volvo.body="iron";*/
        volvo.car_ModelDetails();




    }
}
