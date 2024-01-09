package Java_basics_06;

public class Java_concept_54 {
    public static void main(String[] args) {

        // int a=10,20,30; -> in data type we can bind only one value

        // inside the array only we can bind more than one number of values

        int [] a={10,20,30,40,50};
        System.out.println(a[3]);
        System.out.println(a.length);

        int [] b= new int[4];
        b[0]=20;
        b[1]=40;
        b[2]=60;
        b[3]=80; // till this we should see data -> length of b array is 5
        // b[4]=100; // array index exception
        // b[5]=120; // array index exception
        // System.out.println(b[5]); // array index exception

        System.out.println(b[0]);
    }
}
