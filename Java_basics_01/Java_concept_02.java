package Java_basics_01;
public class Java_concept_02 {
    public static void main(String[] args) {
        //Data types in java
        // boolean, char, byte, short, int, long, float and double.

        byte age=29; //Range of Byte -128 to 127
        age =124;
        System.out.println(age+1);

        short _num=1290; //  -32768 to 32678
        System.out.println(_num);

        int age01= 100;
        System.out.println(age01);

        long ph_num= 987298279L;
        long ph_num1=98729827910887L;
        System.out.println("long data type value"+ph_num1+ph_num);

        float dig_num= 78.239898f;
        float dig_num1= 70.789F;

        System.out.println("float data type value"+dig_num+dig_num1);

        double dou=30.797239862379;
        System.out.println("double data type value"+dou);

        char a1= '0';
        char b='X';
        a1=b;
        System.out.println(a1);

        boolean test = false;
        System.out.println(test);
    }
}
