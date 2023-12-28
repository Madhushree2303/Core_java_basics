package Java_basics_01;
public class Java_concept_10 {
    public static void main(String[] args) {
       // Type casting - it's the process of converting lower data type to higher data type

        byte a=50;
        int b=a;  // implicit casting
        System.out.println(b);
        int c=(int) a; // explicit casting
        System.out.println(c);

        // Narrowing is the process of converting higher data type to lower data type
        // implicit casting is not possible here only explicit casting is possible

        int z=240;
        byte x=(byte) z;
        short y=(short)z;

        System.out.println(x);
        System.out.println(y);

        float food_price=120f;
        float GST=18.67f;

        double actual_price= (double) food_price+GST; // explicit casting
        System.out.println(actual_price);

        double actual_price1=food_price+GST; // implicit casting
        System.out.println(actual_price1);
    }
}

