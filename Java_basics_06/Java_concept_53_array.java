package Java_basics_06;

public class Java_concept_53_array {
    public static void main(String[] args) {

        // int a=10,20,30; -> in data type we can bind only one value

        // inside the array only we can bind more than one number of values

        int a[]={10,20,30,40};

        String[] name = {"madhu","balan","shree","shashmi"};

        double num[]={23.97090,76.7865,56.798};
        short[] a1= {1,2,3,40,120,130,150};
        byte [] b1={127,30,50,70};
        long c1[]={12323213l,79879709l,3252l,213213213l,908986767l};
        char d1[]={'a','b','c','D','E'};
        float[] e1 ={20.11f,76.889f,10.23f,78f};
        boolean f1[]={true,false};

        System.out.println(a[3]);
        System.out.println(name[2]);
        System.out.println(name.length); // prints the total length of an array -> starting position of array index 0
        System.out.println(a.length);

        // when we try to print or try to access the array index which is not there inside the array we should see array index out of boundary exception
        System.out.println(name[4]);

        // index starts from -> 0
        // length starts from -> 1
    }
}
